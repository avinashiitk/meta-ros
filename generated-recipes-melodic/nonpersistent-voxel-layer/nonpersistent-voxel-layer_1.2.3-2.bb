# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "include         This package provides an implementation of a 3D costmap that takes in sensor         data from the world, builds a 3D occupancy grid of the data for only one iteration."
AUTHOR = "Steven Macenski <stevenmacenski@gmail.com>"
ROS_AUTHOR = "Steven Macenski"
HOMEPAGE = "http://wiki.ros.org/non-persisent-voxel-layer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "nonpersistent_voxel_layer"
ROS_BPN = "nonpersistent_voxel_layer"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    laser-geometry \
    map-msgs \
    message-filters \
    message-generation \
    nav-msgs \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
    voxel-grid \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    laser-geometry \
    map-msgs \
    message-filters \
    message-runtime \
    nav-msgs \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    rosconsole \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
    voxel-grid \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    dynamic-reconfigure \
    geometry-msgs \
    laser-geometry \
    map-msgs \
    message-filters \
    message-runtime \
    nav-msgs \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    rosconsole \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    visualization-msgs \
    voxel-grid \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SteveMacenski/nonpersistent_voxel_layer-release/archive/release/melodic/nonpersistent_voxel_layer/1.2.3-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "76b44db47e8a3c65543a6977875a0500"
SRC_URI[sha256sum] = "3c8ab56ed99d7856535320eaaedb8670bbf5115258808a22a1b6531ff9308107"
S = "${WORKDIR}/nonpersistent_voxel_layer-release-release-melodic-nonpersistent_voxel_layer-1.2.3-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('nonpersistent-voxel-layer', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('nonpersistent-voxel-layer', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/nonpersistent-voxel-layer/nonpersistent-voxel-layer_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/nonpersistent-voxel-layer/nonpersistent-voxel-layer-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/nonpersistent-voxel-layer/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/nonpersistent-voxel-layer/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}