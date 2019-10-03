# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "rosserial for TivaC Launchpad evaluation boards."
AUTHOR = "Vitor Matos <vmatos@robosavvy.com>"
ROS_AUTHOR = "Vitor Matos"
HOMEPAGE = "http://wiki.ros.org/rosserial_tivac"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosserial"
ROS_BPN = "rosserial_tivac"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rosserial-client \
    rosserial-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosserial-client \
    rosserial-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_tivac/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e26c18a64da6f73d0beb5bb2a9108922"
SRC_URI[sha256sum] = "3d4ce56cd9d2dd5e1d51afa86467890aa0d06c97b7342f7d469640eaa09c1372"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_tivac-0.8.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosserial', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosserial', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosserial/rosserial_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosserial/rosserial-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosserial/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosserial/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}