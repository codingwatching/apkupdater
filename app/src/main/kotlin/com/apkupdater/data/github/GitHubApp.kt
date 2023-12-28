package com.apkupdater.data.github

data class GitHubApp(
    val packageName: String,
    val user: String,
    val repo: String,
    val extra: Regex? = null
)

val GitHubApps = listOf(
    GitHubApp("org.adaway", "AdAway", "AdAway"),
    GitHubApp("com.beemdevelopment.aegis", "beemdevelopment", "Aegis"),
    GitHubApp("dev.ukanth.ufirewall", "ukanth", "afwall"),
    GitHubApp("de.seemoo.at_tracking_detection.release", "seemoo-lab", "AirGuard"),
    GitHubApp("com.amaze.filemanager", "TeamAmaze", "AmazeFileManager"),
    GitHubApp("mega.privacy.android.app", "meganz", "android"),
    GitHubApp("com.nextcloud.client", "nextcloud", "android"),
    GitHubApp("com.duckduckgo.mobile.android", "duckduckgo", "Android"),
    GitHubApp("com.github.ashutoshgngwr.noice", "trynoice", "android-app"),
    GitHubApp("xyz.Quickdev.Animiru.mi", "Quickdesh", "Animiru"),
    GitHubApp("xyz.jmir.tachiyomi.mi", "aniyomiorg", "aniyomi"),
    GitHubApp("xyz.jmir.tachiyomi.mi.debug", "aniyomiorg", "aniyomi-preview"),
    GitHubApp("com.ichi2.anki", "ankidroid", "Anki-Android"),
    GitHubApp("com.menny.android.anysoftkeyboard", "AnySoftKeyboard", "AnySoftKeyboard"),
    GitHubApp("org.courville.nova", "nova-video-player", "aos-AVP"),
    GitHubApp("com.apkupdater", "rumboalla", "apkupdater"),
    GitHubApp("com.xBrowserSync.android", "xbrowsersync", "app"),
    GitHubApp("io.github.muntashirakon.AppManager", "MuntashirAkon", "AppManager"),
    GitHubApp("cm.aptoide.pt", "Aptoide", "aptoide-client-v8"),
    GitHubApp("com.funkymuse.aurora", "FunkyMuse", "Aurora"),
    GitHubApp("org.oxycblt.auxio", "OxygenCobalt", "Auxio"),
    GitHubApp("deckers.thibault.aves", "deckerst", "aves"),
    GitHubApp("org.kde.bettercounter", "albertvaka", "bettercounter"),
    GitHubApp("com.shadow.blackhole", "Sangwan5688", "BlackHole"),
    GitHubApp("org.blokada.origin.alarm", "blokadaorg", "blokada"),
    GitHubApp("com.phaseshifter.canora", "vetux", "canora"),
    GitHubApp("com.looker.droidify", "Droid-ify", "client"),
    GitHubApp("com.github.lamarios.clipious", "lamarios", "clipious"),
    GitHubApp("com.lagradost.cloudstream3", "recloudstream", "cloudstream"),
    GitHubApp("org.cromite.cromite", "uazo", "cromite"),
    GitHubApp("id.psw.vshlauncher", "EmiyaSyahriel", "CrossLauncher"),
    GitHubApp("com.brunochanrio.dangoplayeruni", "brunochanrio", "DangoPlayer"),
    GitHubApp("at.bitfire.davdroid", "bitfireAT", "davx5-ose"),
    GitHubApp("com.felix.diohub", "NamanShergill", "diohub"),
    GitHubApp("me.rosuh.easywatermark", "rosuH", "EasyWatermark"),
    GitHubApp("im.vector.app", "vector-im", "element-android"),
    GitHubApp("org.eu.exodus_privacy.exodusprivacy", "Exodus-Privacy", "exodus-android-app"),
    GitHubApp("eu.faircode.email", "M66B", "FairEmail"),
    GitHubApp("com.flick", "sheeshcake", "Flickv3"),
    GitHubApp("com.flixclusive", "rhenwinch", "Flixclusive"),
    GitHubApp("dev.beamlak.flixquest", "BeamlakAschalew", "flixquest"),
    GitHubApp("app.d3rt0xx.flyffdroid", "d3rt0xx", "FlyffDroid"),
    GitHubApp("io.freetubeapp.freetube", "MarmadileManteater", "FreeTubeCordova"),
    GitHubApp("com.gh4a", "slapperwan", "gh4a"),
    GitHubApp("com.jhelum.gyawun", "jhelumcorp", "gyawun"),
    GitHubApp("com.anandnet.harmonymusic", "anandnet", "Harmony-Music"),
    GitHubApp("com.supersuman.hymn", "supersu-man", "hymn"),
    GitHubApp("io.github.forkmaintainers.iceraven", "fork-maintainers", "iceraven-browser"),
    GitHubApp("ru.tech.imageresizershrinker", "T8RIN", "ImageToolbox"),
    GitHubApp("com.zionhuang.music", "z-huang", "InnerTune"),
    GitHubApp("keepass2android.keepass2android_nonet", "PhilippC", "keepass2android", contains("nonet")),
    GitHubApp("keepass2android.keepass2android", "PhilippC", "keepass2android", notContains("nonet")),
    GitHubApp("com.kunzisoft.keepass.free", "Kunzisoft", "KeePassDX"),
    GitHubApp("org.koreader.launcher", "koreader", "koreader"),
    GitHubApp("com.swordfish.lemuroid", "Swordfish90", "Lemuroid"),
    GitHubApp("com.iakmds.librecamera", "iakmds", "librecamera"),
    GitHubApp("com.foobnix.pro.pdf.reader", "foobnix", "LibreraReader"),
    GitHubApp("org.proninyaroslav.libretorrent", "proninyaroslav", "libretorrent"),
    GitHubApp("com.github.libretube", "libre-tube", "LibreTube"),
    GitHubApp("org.localsend.localsend_app", "localsend", "localsend"),
    GitHubApp("com.f0x1d.logfox", "F0x1d", "LogFox"),
    GitHubApp("com.m3u.androidApp", "realOxy", "M3UAndroid"),
    GitHubApp("net.gsantner.markor", "gsantner", "markor"),
    GitHubApp("org.joinmastodon.android", "mastodon", "mastodon-android"),
    GitHubApp("me.zhanghai.android.files", "zhanghai", "MaterialFiles"),
    GitHubApp("com.mattermost.rn", "mattermost", "mattermost-mobile"),
    GitHubApp("jp.panta.misskeyandroidclient", "pantasystem", "Milktea"),
    GitHubApp("info.shiosyakeyakini.miria", "shiosyakeyakini-info", "miria"),
    GitHubApp("miru.miaomint", "miru-project", "miru-app"),
    GitHubApp("com.limelight", "moonlight-stream", "moonlight-android"),
    GitHubApp("is.xyz.mpv", "mpv-android", "mpv-android"),
    GitHubApp("com.gokadzev.musify", "gokadzev", "Musify"),
    GitHubApp("com.msob7y.namida", "namidaco", "namida"),
    GitHubApp("com.cylonid.nativealpha", "cylonid", "NativeAlphaForAndroid"),
    GitHubApp("tachiyomi.mangadex", "CarlosEsco", "Neko"),
    GitHubApp("nekox.messenger", "NekoX-Dev", "NekoX"),
    GitHubApp("cz.tutislav.neodeemer", "Tutislav", "neodeemer"),
    GitHubApp("com.machiav3lli.fdroid", "NeoApplications", "Neo-Store"),
    GitHubApp("eu.faircode.netguard", "M66B", "NetGuard"),
    GitHubApp("org.schabi.newpipe", "TeamNewPipe", "NewPipe"),
    GitHubApp("com.streetwriters.notesnook", "streetwriters", "notesnook"),
    GitHubApp("dev.imranr.obtainium", "ImranR98", "Obtainium"),
    GitHubApp("com.darkempire78.opencalculator", "Darkempire78", "OpenCalc"),
    GitHubApp("com.app.openlib", "dstark5", "Openlib"),
    GitHubApp("app.organicmaps", "organicmaps", "organicmaps"),
    GitHubApp("sh.ppy.osulazer", "ppy", "osu"),
    GitHubApp("com.arjanvlek.oxygenupdater", "oxygen-updater", "oxygen-updater"),
    GitHubApp("com.perol.play.pixez", "Notsfsssf", "pixez-flutter"),
    GitHubApp("com.brouken.player", "moneytoo", "Player"),
    GitHubApp("hr.dtakac.prognoza", "davidtakac", "prognoza"),
    GitHubApp("com.prateekmedia.pstube", "prateekmedia", "pstube"),
    GitHubApp("com.utopia.pxviewr", "alphasp", "pxview"),
    GitHubApp("com.lagradost.quicknovel", "LagradOst", "QuickNovel"),
    GitHubApp("net.programmierecke.radiodroid2", "segler-alex", "RadioDroid"),
    GitHubApp("com.yoshi.rain", "DarkMooNight", "Rain"),
    GitHubApp("com.bnyro.recorder", "you-apps", "RecordYou"),
    GitHubApp("code.name.monkey.retromusic", "RetroMusicPlayer", "RetroMusicPlayer"),
    GitHubApp("app.rvx.android.youtube", "NoName-exe", "revanced-extended"),
    GitHubApp("app.revanced.manager.flutter", "revanced", "revanced-manager"),
    GitHubApp("it.fast4x.rimusic", "fast4x", "RiMusic"),
    GitHubApp("com.carriez.flutter_hbb", "rustdesk", "rustdesk"),
    GitHubApp("eu.darken.sdmse", "d4rken-org", "sdmaid-se"),
    GitHubApp("moe.shizuku.privileged.api", "RikkaApps", "Shizuku"),
    GitHubApp("com.simplemobiletools.flashlight", "SimpleMobileTools", "Simple-Flashlight"),
    GitHubApp("com.simplemobiletools.gallery.pro", "SimpleMobileTools", "Simple-Gallery"),
    GitHubApp("com.simplemobiletools.voicerecorder", "SimpleMobileTools", "Simple-Voice-Recorder"),
    GitHubApp("chat.simplex.app", "simplex-chat", "simplex-chat"),
    GitHubApp("com.maxrave.simpmusic", "maxrave-dev", "SimpMusic"),
    GitHubApp("com.sketchware.remod", "Sketchware-Pro", "Sketchware-Pro"),
    GitHubApp("free.rm.skytube.extra", "SkyTubeTeam", "SkyTube"),
    GitHubApp("com.liskovsoft.smarttubetv", "yuliskov", "SmartTube"),
    GitHubApp("com.artxdev.songtube", "SongTube", "SongTube-App"),
    GitHubApp("com.github.soulsearching", "enteraname74", "SoulSearching"),
    GitHubApp("com.toasterofbread.spmp", "toasterofbread", "spmp"),
    GitHubApp("com.shabinder.spotiflyer", "Shabinder", "SpotiFlyer"),
    GitHubApp("oss.krtirtho.spotube", "KRTirtho", "spotube"),
    GitHubApp("com.bobbyesp.spowlo", "BobbyESP", "Spowlo"),
    GitHubApp("com.tanasi.streamflix", "stantanasi", "streamflix"),
    GitHubApp("com.zhenxiang.superimage", "Lucchetto", "SuperImage"),
    GitHubApp("eu.kanade.tachiyomi", "tachiyomiorg", "tachiyomi"),
    GitHubApp("eu.kanade.tachiyomi.az", "az4521", "TachiyomiAZ"),
    GitHubApp("eu.kanade.tachiyomi.j2k", "Jays2Kings", "tachiyomiJ2K"),
    GitHubApp("eu.kanade.tachiyomi.sy", "jobobby04", "TachiyomiSY"),
    GitHubApp("org.telegram.messenger.beta", "Telegram-FOSS-Team", "Telegram-FOSS"),
    GitHubApp("com.fsck.k9", "thunderbird", "thunderbird-android"),
    GitHubApp("de.moekadu.metronome", "thetwom", "toc2"),
    GitHubApp("com.demomiru.tokeiv2", "Sovan22", "Tokeii"),
    GitHubApp("org.zephyrsoft.trackworktime", "mathisdt", "trackworktime"),
    GitHubApp("com.kylecorry.trail_sense", "kylecorry31", "Trail-Sense"),
    GitHubApp("com.bnyro.translate", "you-apps", "TranslateYou"),
    GitHubApp("de.grobox.liberario", "grote", "Transportr"),
    GitHubApp("de.moekadu.tuner", "thetwom", "Tuner"),
    GitHubApp("de.tutao.tutanota", "tutao", "tutanota"),
    GitHubApp("com.perflyst.twire", "twireapp", "Twire"),
    GitHubApp("org.isoron.uhabits", "iSoron", "uhabits"),
    GitHubApp("link.unlinked", "un-linked", "unlinked"),
    GitHubApp("net.xzos.upgradeall", "DUpdateSystem", "UpgradeAll"),
    GitHubApp("com.jamal2367.urlradio", "jamal2362", "URL-Radio"),
    GitHubApp("dev.aryak.varanasi", "devaryakjha", "varanasi_mobile_app"),
    GitHubApp("app.suhasdissa.vibeyou", "you-apps", "VibeYou"),
    GitHubApp("com.crazylegend.vigilante", "FunkyMuse", "Vigilante"),
    GitHubApp("it.vfsfitvnm.vimusic", "vfsfitvnm", "ViMusic"),
    GitHubApp("com.xc3fff0e.xmanager", "Team-xManager", "xManager"),
    GitHubApp("com.yubico.yubioath", "Yubico", "yubioath-flutter"),
    GitHubApp("org.mavlink.qgroundcontrolbeta", "mavlink", "QGroundControl")
)

fun contains(text: String) = Regex("^.*$text.*\$")

fun notContains(text: String) = Regex("^((?!$text).)*\$")
