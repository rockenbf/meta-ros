# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The pheeno_ros_description package"
AUTHOR = "Zahi Kakish <zkakish@gmail.edu>"
ROS_AUTHOR = "Zahi Kakish <zkakish@gmail.com>"
HOMEPAGE = "https://acslaboratory.github.io"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "pheeno_ros_description"
ROS_BPN = "pheeno_ros_description"

ROS_BUILD_DEPENDS = " \
    urdf \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    urdf \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    urdf \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/acslaboratory/pheeno_ros_description-release/archive/release/melodic/pheeno_ros_description/0.1.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pheeno_ros_description"
SRC_URI = "git://github.com/acslaboratory/pheeno_ros_description-release;${ROS_BRANCH};protocol=https"
SRCREV = "fe521b758441ad7d251ea762c77d1f1ee48bf2ba"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
