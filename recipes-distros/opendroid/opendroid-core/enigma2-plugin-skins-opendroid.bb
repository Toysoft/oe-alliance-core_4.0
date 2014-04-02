DESCRIPTION = "Enigma2 Skin opendroid"
MAINTAINER = "Opendroid-Team"

require conf/license/license-gplv2.inc

inherit gitpkgv allarch

EPSM = "enigma2-plugin-skins-opendroid"
SRCREV = "${AUTOREV}"
PV = "2.0+git${SRCPV}"
PKGV = "2.0+git${GITPKGV}"
PR = "r19"

SRC_URI="git://github.com/opendroid-Team/mega32.git"

S = "${WORKDIR}/git"

do_install() {
	install -d ${D}/usr/share/enigma2
	cp -rp ${S}/* ${D}/usr/share/enigma2/
	chmod -R a+rX ${D}/usr/share/enigma2/
}
