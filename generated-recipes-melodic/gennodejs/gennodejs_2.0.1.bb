# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Javascript ROS message and service generators."
AUTHOR = "Chris Smith <csmith@rethinkrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "gennodejs"
ROS_BPN = "gennodejs"

ROS_BUILD_DEPENDS = " \
    genmsg \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    genmsg \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    genmsg \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/RethinkRobotics-release/gennodejs-release/archive/release/melodic/gennodejs/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0f4e2609eb2faa411c7c50baa8395b3b"
SRC_URI[sha256sum] = "09d5f9ee001d83dd19c111dc8c2d995b9e9a90e21df2a379b882ac555b9bc9b1"
S = "${WORKDIR}/gennodejs-release-release-melodic-gennodejs-2.0.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('gennodejs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('gennodejs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gennodejs/gennodejs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gennodejs/gennodejs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gennodejs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gennodejs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}