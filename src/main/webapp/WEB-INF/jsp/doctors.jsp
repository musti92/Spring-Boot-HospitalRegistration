<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
            <tr style="color: black">
                <td>ID</td>


                <td>FIRST</td>


                <td>LAST</td>


                <td>UZMANLIK</td>
            </tr>
        </thead>
        <c:forEach items="${doctors}" var="doctor">
            <tr style="color: blueviolet">
                <td>${doctor.id}</td>
                <td>${doctor.firstname}</td>
                <td>${doctor.lastname}</td>
                <td>${doctor.profession}</td>


            </tr>
        </c:forEach>
    </table>

</body>
</html>