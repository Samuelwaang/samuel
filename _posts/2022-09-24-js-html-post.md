---
toc: true
layout: post
title: Javascript HTML
description: javascript html frontend
categories: [markdown]
---



<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial- scale=1.0">
    <title>Document</title>
    <style>
        table,td{
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>

<script>
    function table() {
        var first = document.getElementById("val1");
        var second = document.getElementById("val2");
        var third = document.getElementById("val3");
        var period = document.getElementById("period");
        var score = document.getElementById("score");
        var name = first + " " + second;
        var name1 = name + " " + third;
        var output = document.querySelector("#output tbody");
        output.innerHTML += "<tr><td>"+name.value+"</td><td>"+period.value+"</td><td>"+score.value+"</td></tr>"
    }
</script> 

<body>
    <form action="">
        <div>
            <label for="name">First Name</label>
            <input type="text" id="val1">
        </div>
        <div>
            <label for="name">Middle Name</label>
            <input type="text" id="val2">
        </div>
        <div>
            <label for="name">Last Name</label>
            <input type="text" id="val3">
        </div>
        <div>
            <label for="name">Period</label>
            <input type="text" id="period">
        </div>
        <div>
            <label for="name">Score</label>
            <input type="text" id="score">
        </div>
    </form>
    <input type="button" onclick="table();" value="Add">
    <div>
        <table id="output">
            <thead><td>Name</td><td>Period</td><td>Score</td></thead>
            <tbody></tbody>
        </table>
    </div>    
</body>

 

   
