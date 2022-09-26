---
toc: true
layout: post
title: Javascript HTML
description: javascript html frontend
categories: [markdown]
---
<div>
<input id="val1" type = "text" placeholder = "Enter your first name">
<input id="val2" type = "text" placeholder = "Enter your middle name">
<input id="val3" type = "text" placeholder = "Enter your last name">
<input id="period" type = "text" placeholder = "Enter your last name">
<input id="score" type = "text" placeholder = "Input your score for this week">
<input type="button" onclick="add();" value="Add">
<div>
<table id="output">
    <thead>
        <td>Name</td>
        <td>Surname</td>
    </thead>
    <tbody>
    </tbody>
</table>

<p>

<script>
    function table() {
        var first = getElementById("val1");
        var second = getElementById("val2");
        var third = getElementById("val3");
        var period = getElementById("period");
        var score = getElementById("score");
        var output = document.querySelector("#output tbody");
        output.innerHTML += "<tr><td>"+name.value+"</td><td>"+surname.value+"</td></tr>"
    }
</script>    
