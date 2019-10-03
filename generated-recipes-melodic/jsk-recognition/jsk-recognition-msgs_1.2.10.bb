# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ROS messages for jsk_pcl_ros and jsk_perception."
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://wiki.ros.org/jsk_recognition_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_recognition"
ROS_BPN = "jsk_recognition_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    jsk-footstep-msgs \
    message-generation \
    pcl-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    jsk-footstep-msgs \
    message-generation \
    pcl-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    jsk-footstep-msgs \
    message-generation \
    pcl-msgs \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/melodic/jsk_recognition_msgs/1.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "288becf1e9cb6d7875c2d9bd31c6ddf7"
SRC_URI[sha256sum] = "29666d54c5db407b249a6233047344608e66d1760ad1576db9148dcec5255a87"
S = "${WORKDIR}/jsk_recognition-release-release-melodic-jsk_recognition_msgs-1.2.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jsk-recognition', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('jsk-recognition', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-recognition/jsk-recognition_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-recognition/jsk-recognition-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-recognition/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-recognition/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}