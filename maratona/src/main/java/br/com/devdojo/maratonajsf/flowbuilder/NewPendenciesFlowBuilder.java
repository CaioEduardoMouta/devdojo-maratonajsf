package br.com.devdojo.maratonajsf.flowbuilder;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;

public class NewPendenciesFlowBuilder implements Serializable {

	
	@Produces
	@FlowDefinition
	public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
		String flowId = "newregistration";
		flowBuilder.id("", flowId);
		flowBuilder.viewNode(flowId,"/newpendencies/newpendencies.xhtml").markAsStartNode();
		flowBuilder.returnNode("proocedToNewRegistration3")
					.fromOutcome("/newregistration/newregistration3.xhtml");
		flowBuilder.returnNode("exitToNewInicio")
				   .fromOutcome("/newregistration/newregistration.xhtml");
		//flowBuilder.inboundParameter( "userName", "#{testeFlowBuilderNestedBean.userName}");		
		//flowBuilder.inboundParameter("userSurname", "#{testeFlowBuilderNestedBean.userSurname}");	
		return flowBuilder.getFlow();
	}
}
