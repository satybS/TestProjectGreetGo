<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<jsp:include page="fragments/headTag.jsp"/>
<link rel="stylesheet" href="webjars/datatables/1.10.12/css/dataTables.bootstrap.min.css">

<body>
<jsp:include page="fragments/bodyHeader.jsp"/>

<div class="jumbotron">
    <div class="container">
        <div class="shadow">
            <h3>Список звезд</h3>

            <div class="view-box">
                <a class="btn btn-sm btn-info" onclick="add('Добавить Звезду')">Добавить Звезду</a>
                <table class="table table-striped display" id="datatable">
                    <thead>
                    <tr>
                        <th>Название Звезды</th>
                        <th>Высота</th>
                        <th>Долгота</th>
                        <th>Класс звезды</th>
                        <th>Открыватель</th>
                        <th></th>
                        <th></th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="editRow">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h2 class="modal-title" id="modalTitle"></h2>
            </div>
            <div class="modal-body">
                <form:form class="form-horizontal" method="post" id="detailsForm">
                    <input type="hidden" id="id" name="id">

                    <div class="form-group">
                        <label for="name" class="control-label col-xs-3">Название Звезды</label>

                        <div class="col-xs-9">
                            <input class="form-control" id="name"
                                   name="name" placeholder="Название Звезды"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="coordinate1" class="control-label col-xs-3">Высота</label>

                        <div class="col-xs-9">
                            <input class="form-control" id="coordinate1" name="coordinate1" placeholder="Высота"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="coordinate2" class="control-label col-xs-3">Долгота</label>

                        <div class="col-xs-9">
                            <input type="text" class="form-control" id="coordinate2" name="coordinate2"
                                   placeholder="Долгота"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="starType" class="control-label col-xs-3">Класс Звезды</label>

                        <div class="col-xs-9">
                            <input type="text" class="form-control" id="starType" name="starType" placeholder = "Класс Звезды"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="discoverer" class="control-label col-xs-3">Открыватель</label>

                        <div class="col-xs-9">
                            <input type="text" class="form-control" id="discoverer" name="discoverer" placeholder = "Открыватель"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-xs-offset-3 col-xs-9">
                            <button class="btn btn-primary" type="button" onclick="save()">Сохранить</button>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    var edit_title ='Edit star';
</script>

<script type="text/javascript" src="webjars/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/datatables/1.10.12/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="webjars/datatables/1.10.12/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="webjars/noty/2.3.8/js/noty/packaged/jquery.noty.packaged.min.js"></script>
<script type="text/javascript" src="resources/js/datatablesUtil.js"></script>
<script type="text/javascript" src="resources/js/mealDatatables.js"></script>
</html>