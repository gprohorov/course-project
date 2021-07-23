<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Items</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<h1>  Table of elements</h1>

<div style="width: 80%" >

    <table class="table table-success table-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Item</th>
            <th>Description</th>
            <th>Created</th>
            <th>Updated</th>
            <th>Delete</th>
            <th>Edit</th>

        </tr>

        <#list elements as element>
            <tr>
                <td>${element.id}</td>
                <td>${element.name}</td>
                <td>${element.item.name}</td>
                <td>${element.desc}</td>
                <td>${element.createdAt}</td>
                <td>${element.updatedAt}</td>
<#--                -->
<#--                <td>  <a href="/gui/item/delete/${item.id}" > <input type="button" class="btn btn-danger" value="Del">  </a>  </td>-->
<#--                <td>  <a href="/gui/item/update/${item.id}" > <input type="button" class="btn btn-dark" value="Edit">  </a>  </td>-->

            </tr>
        </#list>

  </table>

</div>

<a href="/gui/item/create" > <input type="button" class="btn btn-success" value="Create"></a>


</body>
</html>