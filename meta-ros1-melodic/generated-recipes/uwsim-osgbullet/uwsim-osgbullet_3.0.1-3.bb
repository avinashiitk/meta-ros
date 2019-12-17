# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The OSG Bullet library adapted to UWSim. See https://code.google.com/p/osgbullet"
AUTHOR = "Mario Prats <marioprats@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "uwsim_osgbullet"
ROS_BPN = "uwsim_osgbullet"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libopenscenegraph} \
    boost \
    uwsim-bullet \
    uwsim-osgworks \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libopenscenegraph} \
    boost \
    catkin \
    uwsim-bullet \
    uwsim-osgworks \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libopenscenegraph} \
    boost \
    catkin \
    uwsim-bullet \
    uwsim-osgworks \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uji-ros-pkg/uwsim_osgbullet-release/archive/release/melodic/uwsim_osgbullet/3.0.1-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/uwsim_osgbullet"
SRC_URI = "git://github.com/uji-ros-pkg/uwsim_osgbullet-release;${ROS_BRANCH};protocol=https"
SRCREV = "a3fa8be4b6accdaa0f7b3d47cfc70d3692175324"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
