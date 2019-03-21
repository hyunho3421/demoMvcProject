<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>graph</title>
    <link rel="stylesheet" type="text/css" href="/static/billboard.css">
    <script src="/static/billboard.pkgd.js"></script>
</head>
<body>
    <div id="chart"></div>
</body>
<script>

    var chart = bb.generate({
        bindto: "#chart",
        data: {
            type: "line",
            columns: [
                ["data1", 30, 200, 100, 400, 150, 250]
            ]
        }
    });
</script>
</html>