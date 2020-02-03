# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Helper functions for displaying and debugging MoveIt! data in Rviz via published markers"
AUTHOR = "Dave Coleman <dave@picknik.ai>"
ROS_AUTHOR = "Dave Coleman <dave@picknik.ai>"
HOMEPAGE = "https://github.com/ros-planning/moveit_visual_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit_visual_tools"
ROS_BPN = "moveit_visual_tools"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    graph-msgs \
    moveit-core \
    moveit-ros-planning \
    roscpp \
    roslint \
    rviz-visual-tools \
    std-msgs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    graph-msgs \
    moveit-core \
    moveit-ros-planning \
    roscpp \
    roslint \
    rviz-visual-tools \
    std-msgs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    graph-msgs \
    moveit-core \
    moveit-ros-planning \
    roscpp \
    roslint \
    rviz-visual-tools \
    std-msgs \
    tf2-eigen \
    tf2-ros \
    trajectory-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit_visual_tools-release/archive/release/melodic/moveit_visual_tools/3.5.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moveit_visual_tools"
SRC_URI = "git://github.com/ros-gbp/moveit_visual_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "00961cfb16b113b5f40fee57c6a77ec56fe809a7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
