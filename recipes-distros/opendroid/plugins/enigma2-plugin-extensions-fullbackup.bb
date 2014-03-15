DESCRIPTION = "automatic fullbackup and manual flashing for ET/VU+/XP1000
"
MAINTAINER = "Dima73 <Dima-73@inbox.lv>
"
SECTION = "base"
LICENSE = "proprietary"
PACKAGE_ARCH = "mips32el"

require conf/license/license-gplv2.inc

inherit gitpkgv
SRCREV = "${AUTOREV}"
PV = "7.0+git${SRCPV}"
PKGV = "7.0+git${GITPKGV}"
VER ="2.9"
PR = "r1"


SRC_URI="git://github.com/opendroid-Team/enigma2-plugin-extensions-fullbackup.git"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"


do_install() {
	cp -rp ${S}/usr ${D}/
}