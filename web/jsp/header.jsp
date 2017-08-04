<%@ taglib prefix="s" uri="/struts-tags" %>
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">ILoS</a>
    </div>
    <!-- /.navbar-header -->
    <ul class="nav navbar-top-links navbar-right">
        <!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-user fa-fw"></i> <b><s:property value="#session.username"/> </b> <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                </li>
                <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                </li>
                <li class="divider"></li>
                <li><a href="<s:url action="logout"/>"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
    </ul>
    <!-- /.navbar-top-links -->

    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li>
                    <a href="<s:url action="home"/>"><i class="fa fa-home fa-fw"></i> Home</a>
                </li>
                <li>
                    <a href="<s:url action="drHeader"/>"><i class="fa fa-truck fa-fw"></i> Delivery Request</a>
                </li>
                <li>
                    <a href="<s:url action="#"/>"><i class="fa fa-map-marker fa-fw"></i> Master Destination</a>
                </li>
                <li>
                    <a href="<s:url action="#"/>"><i class="fa fa-truck fa-fw"></i> Master Driver</a>
                </li>
                <li>
                    <a href="<s:url action="#"/>"><i class="fa fa-truck fa-fw"></i> Driver Kasbon</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-gear fa-fw"></i> System<span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#"><i class="fa fa-user fa-fw"></i> User and Roles<span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li>
                                    <a href="#">User Management</a>
                                </li>
                                <li>
                                    <a href="#">Users</a>
                                </li>
                                <li>
                                    <a href="#">Roles</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side -->
</nav>
<script>
function showReport(value){
  var url="createDeliveryReport?someVariable="+value;
  window.open(url,"_blank","directories=no, status=no,width=840, height=740,top=0,left=0");
}
</script>