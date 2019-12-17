# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The turtlesim_dash_tutorial package"
AUTHOR = "Siddhartha Banerjee <banerjs.sid@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "turtlesim_dash_tutorial"
ROS_BPN = "turtlesim_dash_tutorial"

ROS_BUILD_DEPENDS = " \
    actionlib \
    rospy \
    turtle-actionlib \
    turtlesim \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    rospy \
    turtle-actionlib \
    turtlesim \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    rospy \
    turtle-actionlib \
    turtlesim \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/banerjs-ros-release/turtlesim_dash_tutorial-release/archive/release/melodic/turtlesim_dash_tutorial/1.0.0-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/turtlesim_dash_tutorial"
SRC_URI = "git://github.com/banerjs-ros-release/turtlesim_dash_tutorial-release;${ROS_BRANCH};protocol=https"
SRCREV = "4712b34489d13846b21dd2ce100f19a554fe0a96"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
