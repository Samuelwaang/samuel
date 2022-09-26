---
toc: true
layout: post
title: Javascript HTML
description: javascript html frontend
categories: [markdown]
---

<script>
    function table() {
        var first = getElementById("val1");
        var second = getElementById("val2");
        var third = getElementById("val3");
        var period = getElementById("period");
        var score = getElementById("score");
        var name = first + " " + second + " " + third + " ";
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
</body>

 

   
