<?xml version="1.0" encoding="UTF-8" ?>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html public "-//W3C//DTO XHTML 1.0 Transitional//EN"
			"http://www.w3.org/TR/xhtmll/DTD/xhtml1-transitional.dtd">

<html xmlns= "http://www.w3.org/1999/xhtml"
	xmlns:h= "http://java.sun.com/jsf/html"
	xmlns:ui= "http://java.sun.com/jsf/facelets"
	xmlns:f= "http://xmlns.jcp.org/jsf/core"
	xlmns:p="http://primefaces.org/ui">
	
<h:body>

<p:importEnum type="javax.faces.application.ProjectStage" 
var="Turno" allSuffix="ALL_ENUM_VALUES"/>

<h:outputLabel value=", world" /><br />
<h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/> <br/>
<h:outputLabel value="#{estudanteRegistrarBean.estudante['sobrenome']}"/> <br/>
<h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2}"/> <br/>
<h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 == estudanteRegistrarBean.estudante.nota2}"/> <br/>
<h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2 and estudanteRegistrarBean.estudante.nome.equals('Caio')}"/> <br/>
<h:outputText value="Comparação Notas" /><br />
<h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1. le estudanteRegistrarBean.estudante.nota2}"/> <br/>
<h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1. eq 0 ? 'ZERO' : 'NAO ZERO'}"/> <br/>
<h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1. = 40}"/> <br/>
<h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1. += ' sobrenomealgumacoisa'}"/> <br/>
<!--  Palavras Reservadas: and , or , !, eq, ne, lt, gt, le, ge, true, false, null, instanceof , empty, div e mod -->
<h:outputText value="ENUM"/><br/>
<h:outputLabel value="#{estudanteRegistrarBean.estudante.turno eq  Turno.MATUTINO}"/><br/>

</h:body>
</html>