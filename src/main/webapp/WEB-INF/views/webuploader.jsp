<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebUploader演示</title>
    <link rel="stylesheet" type="text/css" href="../../resources/webuploader/webuploader.css" />
    <link rel="stylesheet" type="text/css" href="../../resources/image-upload/style.css" />
</head>
<body>
<div id="wrapper">
    <div id="container">
        <!--头部，相册选择和格式选择-->

        <div id="uploader">
            <div class="queueList">
                <div id="dndArea" class="placeholder">
                    <div id="filePicker"></div>
                    <p>或将照片拖到这里，单次最多可选300张</p>
                </div>
            </div>
            <div class="statusBar" style="display:none;">
                <div class="progress">
                    <span class="text">0%</span>
                    <span class="percentage"></span>
                </div><div class="info"></div>
                <div class="btns">
                    <div id="filePicker2"></div><div class="uploadBtn">开始上传</div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="../../resources/image-upload/jquery.js"></script>
<script type="text/javascript" src="../../resources/webuploader/webuploader.js"></script>
<script type="text/javascript" src="../../resources/image-upload/upload.js"></script>
</body>
</html>