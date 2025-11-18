package io.sentry.android.core.internal.threaddump;

import io.sentry.C9594t4;
import io.sentry.C9680x4;
import io.sentry.C9692z4;
import io.sentry.EnumC9587s4;
import io.sentry.protocol.C9562u;
import io.sentry.protocol.C9563v;
import io.sentry.protocol.C9564w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* compiled from: ThreadDumpParser.java */
/* renamed from: io.sentry.android.core.internal.threaddump.c */
/* loaded from: classes2.dex */
public class C9303c {

    /* renamed from: a */
    private static final Pattern f35965a = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: b */
    private static final Pattern f35966b = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: c */
    private static final Pattern f35967c = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");

    /* renamed from: d */
    private static final Pattern f35968d = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");

    /* renamed from: e */
    private static final Pattern f35969e = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* renamed from: f */
    private static final Pattern f35970f = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: g */
    private static final Pattern f35971g = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: h */
    private static final Pattern f35972h = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: i */
    private static final Pattern f35973i = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: j */
    private static final Pattern f35974j = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: k */
    private static final Pattern f35975k = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: l */
    private static final Pattern f35976l = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: m */
    private static final Pattern f35977m = Pattern.compile("\\s+");

    /* renamed from: n */
    private final C9680x4 f35978n;

    /* renamed from: o */
    private final boolean f35979o;

    /* renamed from: p */
    private final C9692z4 f35980p;

    public C9303c(C9680x4 c9680x4, boolean z) {
        this.f35978n = c9680x4;
        this.f35979o = z;
        this.f35980p = new C9692z4(c9680x4);
    }

    /* renamed from: a */
    private void m30264a(C9564w c9564w, C9594t4 c9594t4) {
        Map<String, C9594t4> mapM31515k = c9564w.m31515k();
        if (mapM31515k == null) {
            mapM31515k = new HashMap<>();
        }
        C9594t4 c9594t42 = mapM31515k.get(c9594t4.m31641f());
        if (c9594t42 != null) {
            c9594t42.m31647l(Math.max(c9594t42.m31642g(), c9594t4.m31642g()));
        } else {
            mapM31515k.put(c9594t4.m31641f(), new C9594t4(c9594t4));
        }
        c9564w.m31524t(mapM31515k);
    }

    /* renamed from: b */
    private Integer m30265b(Matcher matcher, int i2, Integer num) {
        String strGroup = matcher.group(i2);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    /* renamed from: c */
    private Long m30266c(Matcher matcher, int i2, Long l) {
        String strGroup = matcher.group(i2);
        return (strGroup == null || strGroup.length() == 0) ? l : Long.valueOf(Long.parseLong(strGroup));
    }

    /* renamed from: d */
    private Integer m30267d(Matcher matcher, int i2, Integer num) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return num;
        }
        Integer numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
        return numValueOf.intValue() >= 0 ? numValueOf : num;
    }

    /* renamed from: e */
    private boolean m30268e(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* renamed from: g */
    private C9563v m30269g(C9302b c9302b, C9564w c9564w) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f35967c.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher3 = f35968d.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher4 = f35969e.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher5 = f35970f.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher6 = f35971g.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher7 = f35973i.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher8 = f35972h.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher9 = f35975k.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher10 = f35974j.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher11 = f35976l.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher12 = f35977m.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        C9562u c9562u = null;
        while (true) {
            if (!c9302b.m30261a()) {
                break;
            }
            C9301a c9301aM30262b = c9302b.m30262b();
            Matcher matcher13 = matcher12;
            if (c9301aM30262b == null) {
                this.f35978n.getLogger().mo30214c(EnumC9587s4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = c9301aM30262b.f35960b;
            if (m30268e(matcher2, str)) {
                C9562u c9562u2 = new C9562u();
                c9562u2.m31494y(matcher2.group(1));
                c9562u2.m31488s(matcher2.group(2));
                c9562u2.m31490u(m30265b(matcher2, 3, null));
                arrayList.add(c9562u2);
            } else if (m30268e(matcher3, str)) {
                C9562u c9562u3 = new C9562u();
                c9562u3.m31494y(matcher3.group(1));
                c9562u3.m31488s(matcher3.group(2));
                arrayList.add(c9562u3);
            } else {
                matcher = matcher2;
                if (m30268e(matcher4, str)) {
                    c9562u = new C9562u();
                    String str2 = String.format("%s.%s", matcher4.group(1), matcher4.group(2));
                    c9562u.m31492w(str2);
                    c9562u.m31488s(matcher4.group(3));
                    c9562u.m31487r(matcher4.group(4));
                    c9562u.m31490u(m30267d(matcher4, 5, null));
                    c9562u.m31489t(this.f35980p.m31961b(str2));
                    arrayList.add(c9562u);
                } else if (m30268e(matcher5, str)) {
                    c9562u = new C9562u();
                    String str3 = String.format("%s.%s", matcher5.group(1), matcher5.group(2));
                    c9562u.m31492w(str3);
                    c9562u.m31488s(matcher5.group(3));
                    c9562u.m31489t(this.f35980p.m31961b(str3));
                    arrayList.add(c9562u);
                } else if (m30268e(matcher6, str)) {
                    if (c9562u != null) {
                        C9594t4 c9594t4 = new C9594t4();
                        c9594t4.m31647l(1);
                        c9594t4.m31643h(matcher6.group(1));
                        c9594t4.m31645j(matcher6.group(2));
                        c9594t4.m31644i(matcher6.group(3));
                        c9562u.m31491v(c9594t4);
                        m30264a(c9564w, c9594t4);
                    }
                } else if (m30268e(matcher7, str)) {
                    if (c9562u != null) {
                        C9594t4 c9594t42 = new C9594t4();
                        c9594t42.m31647l(2);
                        c9594t42.m31643h(matcher7.group(1));
                        c9594t42.m31645j(matcher7.group(2));
                        c9594t42.m31644i(matcher7.group(3));
                        c9562u.m31491v(c9594t42);
                        m30264a(c9564w, c9594t42);
                    }
                } else if (!m30268e(matcher8, str)) {
                    if (!m30268e(matcher9, str)) {
                        if (!m30268e(matcher10, str)) {
                            if (!m30268e(matcher11, str)) {
                                if (str.length() == 0) {
                                    break;
                                }
                                matcher12 = matcher13;
                                if (m30268e(matcher12, str)) {
                                    break;
                                }
                                matcher2 = matcher;
                            } else if (c9562u != null) {
                                C9594t4 c9594t43 = new C9594t4();
                                c9594t43.m31647l(8);
                                c9562u.m31491v(c9594t43);
                                m30264a(c9564w, c9594t43);
                            }
                        } else if (c9562u != null) {
                            C9594t4 c9594t44 = new C9594t4();
                            c9594t44.m31647l(8);
                            c9594t44.m31643h(matcher10.group(1));
                            c9594t44.m31645j(matcher10.group(2));
                            c9594t44.m31644i(matcher10.group(3));
                            c9562u.m31491v(c9594t44);
                            m30264a(c9564w, c9594t44);
                        }
                    } else if (c9562u != null) {
                        C9594t4 c9594t45 = new C9594t4();
                        c9594t45.m31647l(8);
                        c9594t45.m31643h(matcher9.group(1));
                        c9594t45.m31645j(matcher9.group(2));
                        c9594t45.m31644i(matcher9.group(3));
                        c9594t45.m31646k(m30266c(matcher9, 4, null));
                        c9562u.m31491v(c9594t45);
                        m30264a(c9564w, c9594t45);
                    }
                    matcher12 = matcher13;
                    matcher2 = matcher;
                } else if (c9562u != null) {
                    C9594t4 c9594t46 = new C9594t4();
                    c9594t46.m31647l(4);
                    c9594t46.m31643h(matcher8.group(1));
                    c9594t46.m31645j(matcher8.group(2));
                    c9594t46.m31644i(matcher8.group(3));
                    c9562u.m31491v(c9594t46);
                    m30264a(c9564w, c9594t46);
                }
                matcher12 = matcher13;
                matcher2 = matcher;
            }
            matcher = matcher2;
            matcher12 = matcher13;
            c9562u = null;
            matcher2 = matcher;
        }
        Collections.reverse(arrayList);
        C9563v c9563v = new C9563v(arrayList);
        c9563v.m31501e(Boolean.TRUE);
        return c9563v;
    }

    /* renamed from: h */
    private C9564w m30270h(C9302b c9302b) {
        C9564w c9564w = new C9564w();
        Matcher matcher = f35965a.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher2 = f35966b.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        if (!c9302b.m30261a()) {
            return null;
        }
        C9301a c9301aM30262b = c9302b.m30262b();
        boolean z = false;
        if (c9301aM30262b == null) {
            this.f35978n.getLogger().mo30214c(EnumC9587s4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (m30268e(matcher, c9301aM30262b.f35960b)) {
            Long lM30266c = m30266c(matcher, 4, null);
            if (lM30266c == null) {
                this.f35978n.getLogger().mo30214c(EnumC9587s4.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            c9564w.m31525u(lM30266c);
            c9564w.m31527w(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    c9564w.m31530z(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    c9564w.m31530z(strGroup);
                }
            }
        } else if (m30268e(matcher2, c9301aM30262b.f35960b)) {
            Long lM30266c2 = m30266c(matcher2, 3, null);
            if (lM30266c2 == null) {
                this.f35978n.getLogger().mo30214c(EnumC9587s4.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            c9564w.m31525u(lM30266c2);
            c9564w.m31527w(matcher2.group(1));
        }
        String strM31517m = c9564w.m31517m();
        if (strM31517m != null) {
            boolean zEquals = strM31517m.equals("main");
            c9564w.m31526v(Boolean.valueOf(zEquals));
            c9564w.m31521q(Boolean.valueOf(zEquals));
            if (zEquals && !this.f35979o) {
                z = true;
            }
            c9564w.m31522r(Boolean.valueOf(z));
        }
        c9564w.m31529y(m30269g(c9302b, c9564w));
        return c9564w;
    }

    /* renamed from: f */
    public List<C9564w> m30271f(C9302b c9302b) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f35965a.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher2 = f35966b.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        while (c9302b.m30261a()) {
            C9301a c9301aM30262b = c9302b.m30262b();
            if (c9301aM30262b == null) {
                this.f35978n.getLogger().mo30214c(EnumC9587s4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList;
            }
            String str = c9301aM30262b.f35960b;
            if (m30268e(matcher, str) || m30268e(matcher2, str)) {
                c9302b.m30263d();
                C9564w c9564wM30270h = m30270h(c9302b);
                if (c9564wM30270h != null) {
                    arrayList.add(c9564wM30270h);
                }
            }
        }
        return arrayList;
    }
}
