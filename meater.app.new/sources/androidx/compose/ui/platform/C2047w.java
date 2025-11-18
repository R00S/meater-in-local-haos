package androidx.compose.ui.platform;

import A0.C0832k;
import A0.C0841u;
import F0.AccessibilityAction;
import F0.ProgressBarRangeInfo;
import F0.ScrollAxisRange;
import H0.C1060d;
import H0.TextLayoutResult;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.AbstractC2106m;
import android.view.InterfaceC2114v;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.C2036q;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4170o;
import s.AbstractC4403m;
import s.AbstractC4405o;
import s.C4380B;
import s.C4381C;
import s.C4385G;
import s.C4392b;
import s.C4404n;
import s.C4406p;
import s.C4415z;
import s1.C4421a;
import t1.t;
import ta.InterfaceC4588d;
import x0.C5047a;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0010²\u0001Å\u0002¸\u0001¼\u0001Ä\u0001Í\u0001Ñ\u0001Ø\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JK\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0019\u001a\u00020\t2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c2\u0014\b\u0002\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u001b2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u001aj\b\u0012\u0004\u0012\u00020\u001b`\u001c2\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001f0\u001eH\u0002¢\u0006\u0004\b'\u0010(J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\u0019\u001a\u00020\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020&H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J'\u00102\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00122\u0006\u00101\u001a\u00020\u001bH\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u0004\u0018\u0001062\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b9\u00108J\u001f\u0010:\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b:\u00105J\u0017\u0010;\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b;\u0010/J\u001f\u0010<\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\b<\u00105J\u0019\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u0004\u0018\u00010@*\u00020=H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0012H\u0002¢\u0006\u0004\bC\u00105J\u0017\u0010D\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u0010EJ=\u0010K\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\t2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020M2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000bH\u0003¢\u0006\u0004\bQ\u0010RJ?\u0010X\u001a\u00020M2\u0006\u0010\u0011\u001a\u00020\u000b2\b\u0010S\u001a\u0004\u0018\u00010\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u000b2\b\u0010U\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bZ\u0010EJ)\u0010^\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u000b2\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\b^\u0010_J1\u0010a\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u00122\u0006\u0010`\u001a\u0002062\b\u0010]\u001a\u0004\u0018\u00010\\H\u0002¢\u0006\u0004\ba\u0010bJ#\u0010g\u001a\u0004\u0018\u00010f2\b\u0010c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\bi\u0010jJ/\u0010l\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00109*\u00020V2\b\u0010W\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010k\u001a\u00020\u000bH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020&2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020&2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\br\u0010qJ\u001f\u0010u\u001a\u00020&2\u0006\u0010o\u001a\u00020n2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020&H\u0002¢\u0006\u0004\bw\u0010-J\u000f\u0010x\u001a\u00020&H\u0002¢\u0006\u0004\bx\u0010-J\u001d\u0010z\u001a\u00020&2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\bz\u0010{J&\u0010\u007f\u001a\u00020\t2\u0006\u0010|\u001a\u00020\u000b2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020}0IH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u00020&2\u0007\u0010\u0081\u0001\u001a\u00020}H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J.\u0010\u0086\u0001\u001a\u00020&2\u0007\u0010\u0084\u0001\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000b2\t\u0010\u0085\u0001\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J%\u0010\u008b\u0001\u001a\u00020&2\u0007\u0010\u0088\u0001\u001a\u00020\u001b2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u001a\u0010\u008d\u0001\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J5\u0010\u0092\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001b2\u0007\u0010\u008f\u0001\u001a\u00020\u000b2\u0007\u0010\u0090\u0001\u001a\u00020\t2\u0007\u0010\u0091\u0001\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001a\u0010\u0094\u0001\u001a\u00020&2\u0007\u0010\u0084\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0094\u0001\u0010jJ5\u0010\u0098\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001b2\u0007\u0010\u0095\u0001\u001a\u00020\u000b2\u0007\u0010\u0096\u0001\u001a\u00020\u000b2\u0007\u0010\u0097\u0001\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001a\u0010\u009a\u0001\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009b\u0001J\u0019\u0010\u009d\u0001\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001bH\u0002¢\u0006\u0005\b\u009d\u0001\u0010/J(\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u001b2\u0007\u0010\u008f\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001d\u0010¡\u0001\u001a\u0004\u0018\u0001062\b\u0010\u0015\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0005\b¡\u0001\u00108J\u0019\u0010£\u0001\u001a\u0004\u0018\u00010=*\u00030¢\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J-\u0010¥\u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u001b\u0010¨\u0001\u001a\u00020\t2\u0007\u0010N\u001a\u00030§\u0001H\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001J&\u0010\u00ad\u0001\u001a\u00020\u000b2\b\u0010«\u0001\u001a\u00030ª\u00012\b\u0010¬\u0001\u001a\u00030ª\u0001H\u0001¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u001d\u0010²\u0001\u001a\u00030±\u00012\b\u0010°\u0001\u001a\u00030¯\u0001H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0011\u0010´\u0001\u001a\u00020&H\u0000¢\u0006\u0005\b´\u0001\u0010-J\u0013\u0010µ\u0001\u001a\u00020&H\u0080@¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0019\u0010·\u0001\u001a\u00020&2\u0006\u0010o\u001a\u00020nH\u0000¢\u0006\u0005\b·\u0001\u0010qR\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R/\u0010Â\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b¼\u0001\u0010½\u0001\u0012\u0005\bÁ\u0001\u0010-\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0005\bÀ\u0001\u0010jR=\u0010Ë\u0001\u001a\u000f\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\t0Ã\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÄ\u0001\u0010Å\u0001\u0012\u0005\bÊ\u0001\u0010-\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Ï\u0001\u001a\u00030Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R2\u0010Ö\u0001\u001a\u00020\t2\u0007\u0010Ð\u0001\u001a\u00020\t8\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010\u009a\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R*\u0010Þ\u0001\u001a\u00030×\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010â\u0001\u001a\u00030ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0018\u0010æ\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001RD\u0010ë\u0001\u001a-\u0012\u000f\u0012\r è\u0001*\u0005\u0018\u00010ç\u00010ç\u0001 è\u0001*\u0015\u0012\u000f\u0012\r è\u0001*\u0005\u0018\u00010ç\u00010ç\u0001\u0018\u00010I0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010ï\u0001\u001a\u00030ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u001e\u0010ó\u0001\u001a\u00070ð\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0019\u0010õ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0001\u0010½\u0001R\u001b\u0010ø\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0019\u0010ú\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010\u009a\u0001R\u001e\u0010þ\u0001\u001a\t\u0012\u0005\u0012\u00030û\u00010\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001e\u0010\u0080\u0002\u001a\t\u0012\u0005\u0012\u00030û\u00010\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010ý\u0001R'\u0010\u0084\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020V0\u0081\u00020\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R'\u0010\u0087\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020V0\u0085\u00020\u0081\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0083\u0002R\u0019\u0010\u0089\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010½\u0001R\u001b\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001e\u0010\u008f\u0002\u001a\t\u0012\u0004\u0012\u00020n0\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010\u008e\u0002R\u001e\u0010\u0092\u0002\u001a\t\u0012\u0004\u0012\u00020&0\u0090\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u0091\u0002R\u0019\u0010\u0094\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u009a\u0001R\u001c\u0010\u0098\u0002\u001a\u0005\u0018\u00010\u0095\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010\u0097\u0002R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068B@\u0002X\u0082\u000e¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R\u0019\u0010\u009f\u0002\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R*\u0010§\u0002\u001a\u00030 \u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¡\u0002\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002\"\u0006\b¥\u0002\u0010¦\u0002R*\u0010«\u0002\u001a\u00030 \u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¨\u0002\u0010¢\u0002\u001a\u0006\b©\u0002\u0010¤\u0002\"\u0006\bª\u0002\u0010¦\u0002R\u001f\u0010°\u0002\u001a\u0002068\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¬\u0002\u0010\u00ad\u0002\u001a\u0006\b®\u0002\u0010¯\u0002R\u001f\u0010³\u0002\u001a\u0002068\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b±\u0002\u0010\u00ad\u0002\u001a\u0006\b²\u0002\u0010¯\u0002R\u0018\u0010·\u0002\u001a\u00030´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R \u0010¸\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010ý\u0001R\u001a\u0010º\u0002\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010¹\u0002R\u0018\u0010»\u0002\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\ba\u0010\u009a\u0001R\u0017\u0010¾\u0002\u001a\u00030¼\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010½\u0002R\u001d\u0010¿\u0002\u001a\b\u0012\u0004\u0012\u00020}0\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010ê\u0001R$\u0010À\u0002\u001a\u000f\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020&0Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010Å\u0001R\u0017\u0010Â\u0002\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010Ó\u0001R\u0017\u0010Ä\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ó\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Æ\u0002"}, d2 = {"Landroidx/compose/ui/platform/w;", "Ls1/a;", "Landroidx/compose/ui/platform/q;", "view", "<init>", "(Landroidx/compose/ui/platform/q;)V", "Ls/o;", "Landroidx/compose/ui/platform/V0;", "currentSemanticsNodes", "", "vertical", "", "direction", "Lh0/g;", "position", "O", "(Ls/o;ZIJ)Z", "virtualViewId", "Lt1/t;", "S", "(I)Lt1/t;", "node", "Landroid/graphics/Rect;", "L", "(Landroidx/compose/ui/platform/V0;)Landroid/graphics/Rect;", "layoutIsRtl", "Ljava/util/ArrayList;", "LF0/p;", "Lkotlin/collections/ArrayList;", "parentListToSort", "Ls/B;", "", "containerChildrenMapping", "W0", "(ZLjava/util/ArrayList;Ls/B;)Ljava/util/List;", "currNode", "geometryList", "containerMapToChildren", "Loa/F;", "X", "(LF0/p;Ljava/util/ArrayList;Ls/B;)V", "listToSort", "Z0", "(ZLjava/util/List;)Ljava/util/List;", "V0", "()V", "q0", "(LF0/p;)Z", "info", "semanticsNode", "y0", "(ILt1/t;LF0/p;)V", "Q0", "(LF0/p;Lt1/t;)V", "", "g0", "(LF0/p;)Ljava/lang/String;", "T", "T0", "f0", "R0", "LH0/d;", "h0", "(LF0/p;)LH0/d;", "Landroid/text/SpannableString;", "b1", "(LH0/d;)Landroid/text/SpannableString;", "U0", "n0", "(I)Z", "C0", "eventType", "contentChangeType", "", "contentDescription", "I0", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "H0", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "R", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "U", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "Q", "action", "Landroid/os/Bundle;", "arguments", "v0", "(IILandroid/os/Bundle;)Z", "extraDataKey", "K", "(ILt1/t;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Lh0/i;", "bounds", "Landroid/graphics/RectF;", "a1", "(LF0/p;Lh0/i;)Landroid/graphics/RectF;", "f1", "(I)V", "size", "e1", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "LA0/G;", "layoutNode", "s0", "(LA0/G;)V", "O0", "Ls/C;", "subtreeChangedSemanticsNodesIds", "N0", "(LA0/G;Ls/C;)V", "P", "g1", "newSemanticsNodes", "M0", "(Ls/o;)V", "id", "Landroidx/compose/ui/platform/T0;", "oldScrollObservationScopes", "B0", "(ILjava/util/List;)Z", "scrollObservationScope", "D0", "(Landroidx/compose/ui/platform/T0;)V", "semanticsNodeId", "title", "K0", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/U0;", "oldNode", "G0", "(LF0/p;Landroidx/compose/ui/platform/U0;)V", "F0", "(I)I", "granularity", "forward", "extendSelection", "d1", "(LF0/p;IZZ)Z", "L0", "start", "end", "traversalMode", "P0", "(LF0/p;IIZ)Z", "Z", "(LF0/p;)I", "Y", "o0", "Landroidx/compose/ui/platform/g;", "j0", "(LF0/p;I)Landroidx/compose/ui/platform/g;", "i0", "LF0/l;", "k0", "(LF0/l;)LH0/d;", "N", "(ZIJ)Z", "Landroid/view/MotionEvent;", "V", "(Landroid/view/MotionEvent;)Z", "", "x", "y", "m0", "(FF)I", "Landroid/view/View;", "host", "Lt1/u;", "b", "(Landroid/view/View;)Lt1/u;", "u0", "M", "(Lta/d;)Ljava/lang/Object;", "t0", "d", "Landroidx/compose/ui/platform/q;", "l0", "()Landroidx/compose/ui/platform/q;", "e", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "getHoveredVirtualViewId$ui_release$annotations", "hoveredVirtualViewId", "Lkotlin/Function1;", "f", "LBa/l;", "getOnSendAccessibilityEvent$ui_release", "()LBa/l;", "setOnSendAccessibilityEvent$ui_release", "(LBa/l;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "onSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityManager;", "g", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "value", "h", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityForceEnabledForTesting", "", "i", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "S0", "(J)V", "SendRecurringAccessibilityEventsIntervalMillis", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "j", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "k", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "l", "Ljava/util/List;", "enabledServices", "Landroid/os/Handler;", "m", "Landroid/os/Handler;", "handler", "Landroidx/compose/ui/platform/w$e;", "n", "Landroidx/compose/ui/platform/w$e;", "nodeProvider", "o", "focusedVirtualViewId", "p", "Lt1/t;", "currentlyFocusedANI", "q", "sendingFocusAffectingEvent", "LF0/j;", "r", "Ls/B;", "pendingHorizontalScrollEvents", "s", "pendingVerticalScrollEvents", "Ls/Y;", "t", "Ls/Y;", "actionIdToLabel", "Ls/G;", "u", "labelToActionId", "v", "accessibilityCursorPosition", "w", "Ljava/lang/Integer;", "previousTraversedNode", "Ls/b;", "Ls/b;", "subtreeChangedLayoutNodes", "LZb/g;", "LZb/g;", "boundsUpdateChannel", "z", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/w$g;", "A", "Landroidx/compose/ui/platform/w$g;", "pendingTextTraversedEvent", "B", "Ls/o;", "a0", "()Ls/o;", "C", "Ls/C;", "paneDisplayed", "Ls/z;", "D", "Ls/z;", "e0", "()Ls/z;", "setIdToBeforeMap$ui_release", "(Ls/z;)V", "idToBeforeMap", "E", "d0", "setIdToAfterMap$ui_release", "idToAfterMap", "F", "Ljava/lang/String;", "c0", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "G", "b0", "ExtraDataTestTraversalAfterVal", "LO0/u;", "H", "LO0/u;", "urlSpanCache", "previousSemanticsNodes", "Landroidx/compose/ui/platform/U0;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "r0", "isTouchExplorationEnabled", "p0", "isEnabled", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2047w extends C4421a {

    /* renamed from: P, reason: collision with root package name */
    public static final int f23391P = 8;

    /* renamed from: Q, reason: collision with root package name */
    private static final AbstractC4403m f23392Q = C4404n.a(b0.l.f29947a, b0.l.f29948b, b0.l.f29959m, b0.l.f29970x, b0.l.f29935A, b0.l.f29936B, b0.l.f29937C, b0.l.f29938D, b0.l.f29939E, b0.l.f29940F, b0.l.f29949c, b0.l.f29950d, b0.l.f29951e, b0.l.f29952f, b0.l.f29953g, b0.l.f29954h, b0.l.f29955i, b0.l.f29956j, b0.l.f29957k, b0.l.f29958l, b0.l.f29960n, b0.l.f29961o, b0.l.f29962p, b0.l.f29963q, b0.l.f29964r, b0.l.f29965s, b0.l.f29966t, b0.l.f29967u, b0.l.f29968v, b0.l.f29969w, b0.l.f29971y, b0.l.f29972z);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private g pendingTextTraversedEvent;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private AbstractC4405o<V0> currentSemanticsNodes;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private C4381C paneDisplayed;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private C4415z idToBeforeMap;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private C4415z idToAfterMap;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final String ExtraDataTestTraversalBeforeVal;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final String ExtraDataTestTraversalAfterVal;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final O0.u urlSpanCache;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private C4380B<U0> previousSemanticsNodes;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private U0 previousSemanticsRoot;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final Runnable semanticsChangeChecker;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final List<T0> scrollObservationScopes;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<T0, C4153F> scheduleScrollEventIfNeededLambda;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C2036q view;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int hoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new m();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AccessibilityManager accessibilityManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean accessibilityForceEnabledForTesting;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long SendRecurringAccessibilityEventsIntervalMillis;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private List<AccessibilityServiceInfo> enabledServices;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private e nodeProvider;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int focusedVirtualViewId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private t1.t currentlyFocusedANI;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean sendingFocusAffectingEvent;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C4380B<ScrollAxisRange> pendingHorizontalScrollEvents;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final C4380B<ScrollAxisRange> pendingVerticalScrollEvents;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private s.Y<s.Y<CharSequence>> actionIdToLabel;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private s.Y<C4385G<CharSequence>> labelToActionId;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int accessibilityCursorPosition;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private Integer previousTraversedNode;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final C4392b<A0.G> subtreeChangedLayoutNodes;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Zb.g<C4153F> boundsUpdateChannel;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/w$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Loa/F;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$a */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = C2047w.this.accessibilityManager;
            C2047w c2047w = C2047w.this;
            accessibilityManager.addAccessibilityStateChangeListener(c2047w.enabledStateListener);
            accessibilityManager.addTouchExplorationStateChangeListener(c2047w.touchExplorationStateListener);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C2047w.this.handler.removeCallbacks(C2047w.this.semanticsChangeChecker);
            AccessibilityManager accessibilityManager = C2047w.this.accessibilityManager;
            C2047w c2047w = C2047w.this;
            accessibilityManager.removeAccessibilityStateChangeListener(c2047w.enabledStateListener);
            accessibilityManager.removeTouchExplorationStateChangeListener(c2047w.touchExplorationStateListener);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/w$b;", "", "<init>", "()V", "Lt1/t;", "info", "LF0/p;", "semanticsNode", "Loa/F;", "a", "(Lt1/t;LF0/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23431a = new b();

        private b() {
        }

        public static final void a(t1.t info, F0.p semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!C2053z.h(semanticsNode) || (accessibilityAction = (AccessibilityAction) F0.m.a(semanticsNode.getUnmergedConfig(), F0.k.f4315a.v())) == null) {
                return;
            }
            info.b(new t.a(R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/w$c;", "", "<init>", "()V", "Lt1/t;", "info", "LF0/p;", "semanticsNode", "Loa/F;", "a", "(Lt1/t;LF0/p;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f23432a = new c();

        private c() {
        }

        public static final void a(t1.t info, F0.p semanticsNode) {
            if (C2053z.h(semanticsNode)) {
                F0.l unmergedConfig = semanticsNode.getUnmergedConfig();
                F0.k kVar = F0.k.f4315a;
                AccessibilityAction accessibilityAction = (AccessibilityAction) F0.m.a(unmergedConfig, kVar.p());
                if (accessibilityAction != null) {
                    info.b(new t.a(R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) F0.m.a(semanticsNode.getUnmergedConfig(), kVar.m());
                if (accessibilityAction2 != null) {
                    info.b(new t.a(R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) F0.m.a(semanticsNode.getUnmergedConfig(), kVar.n());
                if (accessibilityAction3 != null) {
                    info.b(new t.a(R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) F0.m.a(semanticsNode.getUnmergedConfig(), kVar.o());
                if (accessibilityAction4 != null) {
                    info.b(new t.a(R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/w$e;", "Lt1/u;", "<init>", "(Landroidx/compose/ui/platform/w;)V", "", "virtualViewId", "Lt1/t;", "b", "(I)Lt1/t;", "action", "Landroid/os/Bundle;", "arguments", "", "f", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "Loa/F;", "a", "(ILt1/t;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "d", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$e */
    private final class e extends t1.u {
        public e() {
        }

        @Override // t1.u
        public void a(int virtualViewId, t1.t info, String extraDataKey, Bundle arguments) {
            C2047w.this.K(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // t1.u
        public t1.t b(int virtualViewId) {
            t1.t tVarS = C2047w.this.S(virtualViewId);
            C2047w c2047w = C2047w.this;
            if (c2047w.sendingFocusAffectingEvent && virtualViewId == c2047w.focusedVirtualViewId) {
                c2047w.currentlyFocusedANI = tVarS;
            }
            return tVarS;
        }

        @Override // t1.u
        public t1.t d(int focus) {
            return b(C2047w.this.focusedVirtualViewId);
        }

        @Override // t1.u
        public boolean f(int virtualViewId, int action, Bundle arguments) {
            return C2047w.this.v0(virtualViewId, action, arguments);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/w$f;", "Ljava/util/Comparator;", "LF0/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(LF0/p;LF0/p;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$f */
    private static final class f implements Comparator<F0.p> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f23434B = new f();

        private f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(F0.p a10, F0.p b10) {
            C3478i c3478iJ = a10.j();
            C3478i c3478iJ2 = b10.j();
            int iCompare = Float.compare(c3478iJ.getLeft(), c3478iJ2.getLeft());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(c3478iJ.getTop(), c3478iJ2.getTop());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(c3478iJ.getBottom(), c3478iJ2.getBottom());
            return iCompare3 != 0 ? iCompare3 : Float.compare(c3478iJ.getRight(), c3478iJ2.getRight());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/w$g;", "", "LF0/p;", "node", "", "action", "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(LF0/p;IIIIJ)V", "a", "LF0/p;", "d", "()LF0/p;", "b", "I", "()I", "c", "e", "f", "J", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$g */
    private static final class g {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final F0.p node;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int action;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int granularity;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int toIndex;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long traverseTime;

        public g(F0.p pVar, int i10, int i11, int i12, int i13, long j10) {
            this.node = pVar;
            this.action = i10;
            this.granularity = i11;
            this.fromIndex = i12;
            this.toIndex = i13;
            this.traverseTime = j10;
        }

        /* renamed from: a, reason: from getter */
        public final int getAction() {
            return this.action;
        }

        /* renamed from: b, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* renamed from: c, reason: from getter */
        public final int getGranularity() {
            return this.granularity;
        }

        /* renamed from: d, reason: from getter */
        public final F0.p getNode() {
            return this.node;
        }

        /* renamed from: e, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* renamed from: f, reason: from getter */
        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/w$h;", "Ljava/util/Comparator;", "LF0/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(LF0/p;LF0/p;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$h */
    private static final class h implements Comparator<F0.p> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f23441B = new h();

        private h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(F0.p a10, F0.p b10) {
            C3478i c3478iJ = a10.j();
            C3478i c3478iJ2 = b10.j();
            int iCompare = Float.compare(c3478iJ2.getRight(), c3478iJ.getRight());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(c3478iJ.getTop(), c3478iJ2.getTop());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(c3478iJ.getBottom(), c3478iJ2.getBottom());
            return iCompare3 != 0 ? iCompare3 : Float.compare(c3478iJ2.getLeft(), c3478iJ.getLeft());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\t\u001a\u00020\u000b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/w$i;", "Ljava/util/Comparator;", "Loa/o;", "Lh0/i;", "", "LF0/p;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(Loa/o;Loa/o;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$i */
    private static final class i implements Comparator<C4170o<? extends C3478i, ? extends List<F0.p>>> {

        /* renamed from: B, reason: collision with root package name */
        public static final i f23442B = new i();

        private i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C4170o<C3478i, ? extends List<F0.p>> a10, C4170o<C3478i, ? extends List<F0.p>> b10) {
            int iCompare = Float.compare(a10.c().getTop(), b10.c().getTop());
            return iCompare != 0 ? iCompare : Float.compare(a10.c().getBottom(), b10.c().getBottom());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$j */
    public /* synthetic */ class j {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23443a;

        static {
            int[] iArr = new int[G0.a.values().length];
            try {
                iArr[G0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23443a = iArr;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2247, 2280}, m = "boundsUpdatesEventLoop$ui_release")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f23444B;

        /* renamed from: C, reason: collision with root package name */
        Object f23445C;

        /* renamed from: D, reason: collision with root package name */
        Object f23446D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f23447E;

        /* renamed from: G, reason: collision with root package name */
        int f23449G;

        k(InterfaceC4588d<? super k> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23447E = obj;
            this.f23449G |= Integer.MIN_VALUE;
            return C2047w.this.M(this);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.w$l */
    static final class l extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final l f23450B = new l();

        l() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/accessibility/AccessibilityEvent;", "it", "", "a", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.w$m */
    static final class m extends AbstractC3864v implements Ba.l<AccessibilityEvent, Boolean> {
        m() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(C2047w.this.getView().getParent().requestSendAccessibilityEvent(C2047w.this.getView(), accessibilityEvent));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.w$n */
    static final class n extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ T0 f23452B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C2047w f23453C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(T0 t02, C2047w c2047w) {
            super(0);
            this.f23452B = t02;
            this.f23453C = c2047w;
        }

        public final void a() {
            F0.p semanticsNode;
            A0.G layoutNode;
            ScrollAxisRange horizontalScrollAxisRange = this.f23452B.getHorizontalScrollAxisRange();
            ScrollAxisRange verticalScrollAxisRange = this.f23452B.getVerticalScrollAxisRange();
            Float oldXValue = this.f23452B.getOldXValue();
            Float oldYValue = this.f23452B.getOldYValue();
            float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.c().invoke().floatValue() - oldXValue.floatValue();
            float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.c().invoke().floatValue() - oldYValue.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iF0 = this.f23453C.F0(this.f23452B.getSemanticsNodeId());
                V0 v02 = (V0) this.f23453C.a0().c(this.f23453C.focusedVirtualViewId);
                if (v02 != null) {
                    C2047w c2047w = this.f23453C;
                    try {
                        t1.t tVar = c2047w.currentlyFocusedANI;
                        if (tVar != null) {
                            tVar.e0(c2047w.L(v02));
                            C4153F c4153f = C4153F.f46609a;
                        }
                    } catch (IllegalStateException unused) {
                        C4153F c4153f2 = C4153F.f46609a;
                    }
                }
                this.f23453C.getView().invalidate();
                V0 v03 = (V0) this.f23453C.a0().c(iF0);
                if (v03 != null && (semanticsNode = v03.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                    C2047w c2047w2 = this.f23453C;
                    if (horizontalScrollAxisRange != null) {
                        c2047w2.pendingHorizontalScrollEvents.t(iF0, horizontalScrollAxisRange);
                    }
                    if (verticalScrollAxisRange != null) {
                        c2047w2.pendingVerticalScrollEvents.t(iF0, verticalScrollAxisRange);
                    }
                    c2047w2.s0(layoutNode);
                }
            }
            if (horizontalScrollAxisRange != null) {
                this.f23452B.g(horizontalScrollAxisRange.c().invoke());
            }
            if (verticalScrollAxisRange != null) {
                this.f23452B.h(verticalScrollAxisRange.c().invoke());
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/T0;", "it", "Loa/F;", "a", "(Landroidx/compose/ui/platform/T0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.w$o */
    static final class o extends AbstractC3864v implements Ba.l<T0, C4153F> {
        o() {
            super(1);
        }

        public final void a(T0 t02) {
            C2047w.this.D0(t02);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(T0 t02) {
            a(t02);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "it", "", "a", "(LA0/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.w$p */
    static final class p extends AbstractC3864v implements Ba.l<A0.G, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final p f23455B = new p();

        p() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(A0.G g10) {
            F0.l lVarI = g10.I();
            boolean z10 = false;
            if (lVarI != null && lVarI.getIsMergingSemanticsOfDescendants()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "it", "", "a", "(LA0/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.w$q */
    static final class q extends AbstractC3864v implements Ba.l<A0.G, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final q f23456B = new q();

        q() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(A0.G g10) {
            return Boolean.valueOf(g10.getNodes().q(A0.e0.a(8)));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"LF0/p;", "kotlin.jvm.PlatformType", "a", "b", "", "(LF0/p;LF0/p;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.w$r */
    static final class r extends AbstractC3864v implements Ba.p<F0.p, F0.p, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final r f23457B = new r();

        /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.w$r$a */
        static final class a extends AbstractC3864v implements Ba.a<Float> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f23458B = new a();

            a() {
                super(0);
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.w$r$b */
        static final class b extends AbstractC3864v implements Ba.a<Float> {

            /* renamed from: B, reason: collision with root package name */
            public static final b f23459B = new b();

            b() {
                super(0);
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        r() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(F0.p pVar, F0.p pVar2) {
            F0.l unmergedConfig = pVar.getUnmergedConfig();
            F0.s sVar = F0.s.f4372a;
            return Integer.valueOf(Float.compare(((Number) unmergedConfig.y(sVar.H(), a.f23458B)).floatValue(), ((Number) pVar2.getUnmergedConfig().y(sVar.H(), b.f23459B)).floatValue()));
        }
    }

    public C2047w(C2036q c2036q) {
        this.view = c2036q;
        Object systemService = c2036q.getContext().getSystemService("accessibility");
        C3862t.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.t
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                C2047w.W(this.f23347a, z10);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.u
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                C2047w.c1(this.f23352a, z10);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new e();
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new C4380B<>(0, 1, null);
        this.pendingVerticalScrollEvents = new C4380B<>(0, 1, null);
        this.actionIdToLabel = new s.Y<>(0, 1, null);
        this.labelToActionId = new s.Y<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new C4392b<>(0, 1, null);
        this.boundsUpdateChannel = Zb.j.b(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = C4406p.a();
        this.paneDisplayed = new C4381C(0, 1, null);
        this.idToBeforeMap = new C4415z(0, 1, null);
        this.idToAfterMap = new C4415z(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new O0.u();
        this.previousSemanticsNodes = C4406p.b();
        this.previousSemanticsRoot = new U0(c2036q.getSemanticsOwner().a(), C4406p.a());
        c2036q.addOnAttachStateChangeListener(new a());
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.v
            @Override // java.lang.Runnable
            public final void run() {
                C2047w.E0(this.f23360B);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new o();
    }

    private static final boolean A0(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.c().invoke().floatValue() < scrollAxisRange.a().invoke().floatValue() && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.c().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private final boolean B0(int id2, List<T0> oldScrollObservationScopes) {
        boolean z10;
        T0 t0A = W0.a(oldScrollObservationScopes, id2);
        if (t0A != null) {
            z10 = false;
        } else {
            t0A = new T0(id2, this.scrollObservationScopes, null, null, null, null);
            z10 = true;
        }
        this.scrollObservationScopes.add(t0A);
        return z10;
    }

    private final boolean C0(int virtualViewId) {
        if (!r0() || n0(virtualViewId)) {
            return false;
        }
        int i10 = this.focusedVirtualViewId;
        if (i10 != Integer.MIN_VALUE) {
            J0(this, i10, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        J0(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(T0 scrollObservationScope) {
        if (scrollObservationScope.b0()) {
            this.view.getSnapshotObserver().i(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new n(scrollObservationScope, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(C2047w c2047w) {
        Trace.beginSection("measureAndLayout");
        try {
            A0.m0.y(c2047w.view, false, 1, null);
            C4153F c4153f = C4153F.f46609a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                c2047w.P();
                Trace.endSection();
                c2047w.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F0(int id2) {
        if (id2 == this.view.getSemanticsOwner().a().getId()) {
            return -1;
        }
        return id2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G0(F0.p r17, androidx.compose.ui.platform.U0 r18) {
        /*
            r16 = this;
            r0 = r16
            s.C r1 = s.r.b()
            java.util.List r2 = r17.t()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L10:
            if (r5 >= r3) goto L46
            java.lang.Object r6 = r2.get(r5)
            F0.p r6 = (F0.p) r6
            s.o r7 = r16.a0()
            int r8 = r6.getId()
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L43
            s.C r7 = r18.getChildren()
            int r8 = r6.getId()
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L3c
            A0.G r1 = r17.getLayoutNode()
            r0.s0(r1)
            return
        L3c:
            int r6 = r6.getId()
            r1.f(r6)
        L43:
            int r5 = r5 + 1
            goto L10
        L46:
            s.C r2 = r18.getChildren()
            int[] r3 = r2.elements
            long[] r2 = r2.metadata
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L97
            r6 = r4
        L54:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L92
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L6e:
            if (r11 >= r9) goto L90
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8c
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L8c
            A0.G r1 = r17.getLayoutNode()
            r0.s0(r1)
            return
        L8c:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L6e
        L90:
            if (r9 != r10) goto L97
        L92:
            if (r6 == r5) goto L97
            int r6 = r6 + 1
            goto L54
        L97:
            java.util.List r1 = r17.t()
            int r2 = r1.size()
        L9f:
            if (r4 >= r2) goto Lca
            java.lang.Object r3 = r1.get(r4)
            F0.p r3 = (F0.p) r3
            s.o r5 = r16.a0()
            int r6 = r3.getId()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lc7
            s.B<androidx.compose.ui.platform.U0> r5 = r0.previousSemanticsNodes
            int r6 = r3.getId()
            java.lang.Object r5 = r5.c(r6)
            kotlin.jvm.internal.C3862t.d(r5)
            androidx.compose.ui.platform.U0 r5 = (androidx.compose.ui.platform.U0) r5
            r0.G0(r3, r5)
        Lc7:
            int r4 = r4 + 1
            goto L9f
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2047w.G0(F0.p, androidx.compose.ui.platform.U0):void");
    }

    private final boolean H0(AccessibilityEvent event) {
        if (!p0()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean I0(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !p0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventR = R(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventR.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventR.setContentDescription(W0.a.e(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        Trace.beginSection("sendEvent");
        try {
            return H0(accessibilityEventR);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean J0(C2047w c2047w, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return c2047w.I0(i10, i11, num, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int virtualViewId, t1.t info, String extraDataKey, Bundle arguments) {
        F0.p semanticsNode;
        V0 v0C = a0().c(virtualViewId);
        if (v0C == null || (semanticsNode = v0C.getSemanticsNode()) == null) {
            return;
        }
        String strI0 = i0(semanticsNode);
        if (C3862t.b(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int iE = this.idToBeforeMap.e(virtualViewId, -1);
            if (iE != -1) {
                info.t().putInt(extraDataKey, iE);
                return;
            }
            return;
        }
        if (C3862t.b(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int iE2 = this.idToAfterMap.e(virtualViewId, -1);
            if (iE2 != -1) {
                info.t().putInt(extraDataKey, iE2);
                return;
            }
            return;
        }
        if (!semanticsNode.getUnmergedConfig().i(F0.k.f4315a.i()) || arguments == null || !C3862t.b(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            F0.l unmergedConfig = semanticsNode.getUnmergedConfig();
            F0.s sVar = F0.s.f4372a;
            if (!unmergedConfig.i(sVar.C()) || arguments == null || !C3862t.b(extraDataKey, "androidx.compose.ui.semantics.testTag")) {
                if (C3862t.b(extraDataKey, "androidx.compose.ui.semantics.id")) {
                    info.t().putInt(extraDataKey, semanticsNode.getId());
                    return;
                }
                return;
            } else {
                String str = (String) F0.m.a(semanticsNode.getUnmergedConfig(), sVar.C());
                if (str != null) {
                    info.t().putCharSequence(extraDataKey, str);
                    return;
                }
                return;
            }
        }
        int i10 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i11 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i11 > 0 && i10 >= 0) {
            if (i10 < (strI0 != null ? strI0.length() : Integer.MAX_VALUE)) {
                TextLayoutResult textLayoutResultE = W0.e(semanticsNode.getUnmergedConfig());
                if (textLayoutResultE == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = i10 + i12;
                    if (i13 >= textLayoutResultE.getLayoutInput().getText().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(a1(semanticsNode, textLayoutResultE.d(i13)));
                    }
                }
                info.t().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    private final void K0(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventR = R(F0(semanticsNodeId), 32);
        accessibilityEventR.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventR.getText().add(title);
        }
        H0(accessibilityEventR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect L(V0 node) {
        Rect adjustedBounds = node.getAdjustedBounds();
        long jQ = this.view.q(C3477h.a(adjustedBounds.left, adjustedBounds.top));
        long jQ2 = this.view.q(C3477h.a(adjustedBounds.right, adjustedBounds.bottom));
        return new Rect((int) Math.floor(C3476g.m(jQ)), (int) Math.floor(C3476g.n(jQ)), (int) Math.ceil(C3476g.m(jQ2)), (int) Math.ceil(C3476g.n(jQ2)));
    }

    private final void L0(int semanticsNodeId) {
        g gVar = this.pendingTextTraversedEvent;
        if (gVar != null) {
            if (semanticsNodeId != gVar.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gVar.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventR = R(F0(gVar.getNode().getId()), 131072);
                accessibilityEventR.setFromIndex(gVar.getFromIndex());
                accessibilityEventR.setToIndex(gVar.getToIndex());
                accessibilityEventR.setAction(gVar.getAction());
                accessibilityEventR.setMovementGranularity(gVar.getGranularity());
                accessibilityEventR.getText().add(i0(gVar.getNode()));
                H0(accessibilityEventR);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0586  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void M0(s.AbstractC4405o<androidx.compose.ui.platform.V0> r37) {
        /*
            Method dump skipped, instructions count: 1637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2047w.M0(s.o):void");
    }

    private final void N0(A0.G layoutNode, C4381C subtreeChangedSemanticsNodesIds) {
        F0.l lVarI;
        A0.G gJ;
        if (layoutNode.K0() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().q(A0.e0.a(8))) {
                layoutNode = C2053z.j(layoutNode, q.f23456B);
            }
            if (layoutNode == null || (lVarI = layoutNode.I()) == null) {
                return;
            }
            if (!lVarI.getIsMergingSemanticsOfDescendants() && (gJ = C2053z.j(layoutNode, p.f23455B)) != null) {
                layoutNode = gJ;
            }
            int semanticsId = layoutNode.getSemanticsId();
            if (subtreeChangedSemanticsNodesIds.f(semanticsId)) {
                J0(this, F0(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean O(s.AbstractC4405o<androidx.compose.ui.platform.V0> r21, boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2047w.O(s.o, boolean, int, long):boolean");
    }

    private final void O0(A0.G layoutNode) {
        if (layoutNode.K0() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRangeC = this.pendingHorizontalScrollEvents.c(semanticsId);
            ScrollAxisRange scrollAxisRangeC2 = this.pendingVerticalScrollEvents.c(semanticsId);
            if (scrollAxisRangeC == null && scrollAxisRangeC2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventR = R(semanticsId, 4096);
            if (scrollAxisRangeC != null) {
                accessibilityEventR.setScrollX((int) scrollAxisRangeC.c().invoke().floatValue());
                accessibilityEventR.setMaxScrollX((int) scrollAxisRangeC.a().invoke().floatValue());
            }
            if (scrollAxisRangeC2 != null) {
                accessibilityEventR.setScrollY((int) scrollAxisRangeC2.c().invoke().floatValue());
                accessibilityEventR.setMaxScrollY((int) scrollAxisRangeC2.a().invoke().floatValue());
            }
            H0(accessibilityEventR);
        }
    }

    private final void P() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p0()) {
                G0(this.view.getSemanticsOwner().a(), this.previousSemanticsRoot);
            }
            C4153F c4153f = C4153F.f46609a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                M0(a0());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    g1();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean P0(F0.p node, int start, int end, boolean traversalMode) {
        String strI0;
        F0.l unmergedConfig = node.getUnmergedConfig();
        F0.k kVar = F0.k.f4315a;
        if (unmergedConfig.i(kVar.w()) && C2053z.h(node)) {
            Ba.q qVar = (Ba.q) ((AccessibilityAction) node.getUnmergedConfig().x(kVar.w())).a();
            if (qVar != null) {
                return ((Boolean) qVar.g(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (strI0 = i0(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > strI0.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z10 = strI0.length() > 0;
        H0(U(F0(node.getId()), z10 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z10 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z10 ? Integer.valueOf(strI0.length()) : null, strI0));
        L0(node.getId());
        return true;
    }

    private final boolean Q(int virtualViewId) {
        if (!n0(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyFocusedANI = null;
        this.view.invalidate();
        J0(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    private final void Q0(F0.p node, t1.t info) {
        F0.l unmergedConfig = node.getUnmergedConfig();
        F0.s sVar = F0.s.f4372a;
        if (unmergedConfig.i(sVar.h())) {
            info.m0(true);
            info.q0((CharSequence) F0.m.a(node.getUnmergedConfig(), sVar.h()));
        }
    }

    private final AccessibilityEvent R(int virtualViewId, int eventType) {
        V0 v0C;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        if (p0() && (v0C = a0().c(virtualViewId)) != null) {
            accessibilityEventObtain.setPassword(v0C.getSemanticsNode().getUnmergedConfig().i(F0.s.f4372a.w()));
        }
        return accessibilityEventObtain;
    }

    private final void R0(F0.p node, t1.t info) {
        info.f0(f0(node));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final t1.t S(int virtualViewId) {
        InterfaceC2114v lifecycleOwner;
        AbstractC2106m lifecycle;
        C2036q.b viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == AbstractC2106m.b.DESTROYED) {
            return null;
        }
        t1.t tVarU = t1.t.U();
        V0 v0C = a0().c(virtualViewId);
        if (v0C == null) {
            return null;
        }
        F0.p semanticsNode = v0C.getSemanticsNode();
        if (virtualViewId == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            tVarU.E0(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            F0.p pVarR = semanticsNode.r();
            Integer numValueOf = pVarR != null ? Integer.valueOf(pVarR.getId()) : null;
            if (numValueOf == null) {
                C5047a.c("semanticsNode " + virtualViewId + " has null parent");
                throw new KotlinNothingValueException();
            }
            int iIntValue = numValueOf.intValue();
            tVarU.F0(this.view, iIntValue != this.view.getSemanticsOwner().a().getId() ? iIntValue : -1);
        }
        tVarU.N0(this.view, virtualViewId);
        tVarU.e0(L(v0C));
        y0(virtualViewId, tVarU, semanticsNode);
        return tVarU;
    }

    private final String T(F0.p node) {
        Collection collection;
        CharSequence charSequence;
        F0.l lVarN = node.a().n();
        F0.s sVar = F0.s.f4372a;
        Collection collection2 = (Collection) F0.m.a(lVarN, sVar.d());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) F0.m.a(lVarN, sVar.D())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) F0.m.a(lVarN, sVar.g())) == null || charSequence.length() == 0))) {
            return this.view.getContext().getResources().getString(b0.m.f29985m);
        }
        return null;
    }

    private final void T0(F0.p node, t1.t info) {
        info.O0(g0(node));
    }

    private final AccessibilityEvent U(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventR = R(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventR.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventR.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventR.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventR.getText().add(text);
        }
        return accessibilityEventR;
    }

    private final void U0(F0.p node, t1.t info) {
        C1060d c1060dH0 = h0(node);
        info.P0(c1060dH0 != null ? b1(c1060dH0) : null);
    }

    private final void V0() {
        this.idToBeforeMap.i();
        this.idToAfterMap.i();
        V0 v0C = a0().c(-1);
        F0.p semanticsNode = v0C != null ? v0C.getSemanticsNode() : null;
        C3862t.d(semanticsNode);
        List<F0.p> listZ0 = Z0(C2053z.k(semanticsNode), kotlin.collections.r.s(semanticsNode));
        int iO = kotlin.collections.r.o(listZ0);
        int i10 = 1;
        if (1 > iO) {
            return;
        }
        while (true) {
            int id2 = listZ0.get(i10 - 1).getId();
            int id3 = listZ0.get(i10).getId();
            this.idToBeforeMap.q(id2, id3);
            this.idToAfterMap.q(id3, id2);
            if (i10 == iO) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(C2047w c2047w, boolean z10) {
        c2047w.enabledServices = z10 ? c2047w.accessibilityManager.getEnabledAccessibilityServiceList(-1) : kotlin.collections.r.m();
    }

    private final List<F0.p> W0(boolean layoutIsRtl, ArrayList<F0.p> parentListToSort, C4380B<List<F0.p>> containerChildrenMapping) {
        ArrayList arrayList = new ArrayList();
        int iO = kotlin.collections.r.o(parentListToSort);
        int size = 0;
        if (iO >= 0) {
            int i10 = 0;
            while (true) {
                F0.p pVar = parentListToSort.get(i10);
                if (i10 == 0 || !Y0(arrayList, pVar)) {
                    arrayList.add(new C4170o(pVar.j(), kotlin.collections.r.s(pVar)));
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        kotlin.collections.r.C(arrayList, i.f23442B);
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C4170o c4170o = (C4170o) arrayList.get(i11);
            kotlin.collections.r.C((List) c4170o.d(), new C2051y(new C2049x(layoutIsRtl ? h.f23441B : f.f23434B, A0.G.INSTANCE.b())));
            arrayList2.addAll((Collection) c4170o.d());
        }
        final r rVar = r.f23457B;
        kotlin.collections.r.C(arrayList2, new Comparator() { // from class: androidx.compose.ui.platform.s
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C2047w.X0(rVar, obj, obj2);
            }
        });
        while (size <= kotlin.collections.r.o(arrayList2)) {
            List<F0.p> listC = containerChildrenMapping.c(((F0.p) arrayList2.get(size)).getId());
            if (listC != null) {
                if (q0((F0.p) arrayList2.get(size))) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, listC);
                size += listC.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    private final void X(F0.p currNode, ArrayList<F0.p> geometryList, C4380B<List<F0.p>> containerMapToChildren) {
        boolean zK = C2053z.k(currNode);
        boolean zBooleanValue = ((Boolean) currNode.getUnmergedConfig().y(F0.s.f4372a.s(), l.f23450B)).booleanValue();
        if ((zBooleanValue || q0(currNode)) && a0().b(currNode.getId())) {
            geometryList.add(currNode);
        }
        if (zBooleanValue) {
            containerMapToChildren.t(currNode.getId(), Z0(zK, kotlin.collections.r.Z0(currNode.k())));
            return;
        }
        List<F0.p> listK = currNode.k();
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            X(listK.get(i10), geometryList, containerMapToChildren);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X0(Ba.p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final int Y(F0.p node) {
        F0.l unmergedConfig = node.getUnmergedConfig();
        F0.s sVar = F0.s.f4372a;
        return (unmergedConfig.i(sVar.d()) || !node.getUnmergedConfig().i(sVar.E())) ? this.accessibilityCursorPosition : H0.H.g(((H0.H) node.getUnmergedConfig().x(sVar.E())).getPackedValue());
    }

    private static final boolean Y0(ArrayList<C4170o<C3478i, List<F0.p>>> arrayList, F0.p pVar) {
        float top = pVar.j().getTop();
        float bottom = pVar.j().getBottom();
        boolean z10 = top >= bottom;
        int iO = kotlin.collections.r.o(arrayList);
        if (iO >= 0) {
            int i10 = 0;
            while (true) {
                C3478i c3478iC = arrayList.get(i10).c();
                boolean z11 = c3478iC.getTop() >= c3478iC.getBottom();
                if (!z10 && !z11 && Math.max(top, c3478iC.getTop()) < Math.min(bottom, c3478iC.getBottom())) {
                    arrayList.set(i10, new C4170o<>(c3478iC.l(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i10).d()));
                    arrayList.get(i10).d().add(pVar);
                    return true;
                }
                if (i10 == iO) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    private final int Z(F0.p node) {
        F0.l unmergedConfig = node.getUnmergedConfig();
        F0.s sVar = F0.s.f4372a;
        return (unmergedConfig.i(sVar.d()) || !node.getUnmergedConfig().i(sVar.E())) ? this.accessibilityCursorPosition : H0.H.k(((H0.H) node.getUnmergedConfig().x(sVar.E())).getPackedValue());
    }

    private final List<F0.p> Z0(boolean layoutIsRtl, List<F0.p> listToSort) {
        C4380B<List<F0.p>> c4380bB = C4406p.b();
        ArrayList<F0.p> arrayList = new ArrayList<>();
        int size = listToSort.size();
        for (int i10 = 0; i10 < size; i10++) {
            X(listToSort.get(i10), arrayList, c4380bB);
        }
        return W0(layoutIsRtl, arrayList, c4380bB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4405o<V0> a0() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = W0.b(this.view.getSemanticsOwner());
            if (p0()) {
                V0();
            }
        }
        return this.currentSemanticsNodes;
    }

    private final RectF a1(F0.p textNode, C3478i bounds) {
        if (textNode == null) {
            return null;
        }
        C3478i c3478iQ = bounds.q(textNode.s());
        C3478i c3478iI = textNode.i();
        C3478i c3478iM = c3478iQ.o(c3478iI) ? c3478iQ.m(c3478iI) : null;
        if (c3478iM == null) {
            return null;
        }
        long jQ = this.view.q(C3477h.a(c3478iM.getLeft(), c3478iM.getTop()));
        long jQ2 = this.view.q(C3477h.a(c3478iM.getRight(), c3478iM.getBottom()));
        return new RectF(C3476g.m(jQ), C3476g.n(jQ), C3476g.m(jQ2), C3476g.n(jQ2));
    }

    private final SpannableString b1(C1060d c1060d) {
        return (SpannableString) e1(O0.a.b(c1060d, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(C2047w c2047w, boolean z10) {
        c2047w.enabledServices = c2047w.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean d1(F0.p node, int granularity, boolean forward, boolean extendSelection) {
        int iZ;
        int i10;
        int id2 = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id2 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String strI0 = i0(node);
        boolean z10 = false;
        if (strI0 != null && strI0.length() != 0) {
            InterfaceC2016g interfaceC2016gJ0 = j0(node, granularity);
            if (interfaceC2016gJ0 == null) {
                return false;
            }
            int iY = Y(node);
            if (iY == -1) {
                iY = forward ? 0 : strI0.length();
            }
            int[] iArrA = forward ? interfaceC2016gJ0.a(iY) : interfaceC2016gJ0.b(iY);
            if (iArrA == null) {
                return false;
            }
            int i11 = iArrA[0];
            z10 = true;
            int i12 = iArrA[1];
            if (extendSelection && o0(node)) {
                iZ = Z(node);
                if (iZ == -1) {
                    iZ = forward ? i11 : i12;
                }
                i10 = forward ? i12 : i11;
            } else {
                iZ = forward ? i12 : i11;
                i10 = iZ;
            }
            this.pendingTextTraversedEvent = new g(node, forward ? 256 : 512, granularity, i11, i12, SystemClock.uptimeMillis());
            P0(node, iZ, i10, true);
        }
        return z10;
    }

    private final <T extends CharSequence> T e1(T text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i10 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i10)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i10;
        }
        T t10 = (T) text.subSequence(0, size);
        C3862t.e(t10, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t10;
    }

    private final boolean f0(F0.p node) {
        F0.l unmergedConfig = node.getUnmergedConfig();
        F0.s sVar = F0.s.f4372a;
        G0.a aVar = (G0.a) F0.m.a(unmergedConfig, sVar.G());
        F0.i iVar = (F0.i) F0.m.a(node.getUnmergedConfig(), sVar.y());
        boolean z10 = aVar != null;
        if (((Boolean) F0.m.a(node.getUnmergedConfig(), sVar.A())) != null) {
            return iVar != null ? F0.i.k(iVar.getValue(), F0.i.INSTANCE.g()) : false ? z10 : true;
        }
        return z10;
    }

    private final void f1(int virtualViewId) {
        int i10 = this.hoveredVirtualViewId;
        if (i10 == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        J0(this, virtualViewId, 128, null, null, 12, null);
        J0(this, i10, 256, null, null, 12, null);
    }

    private final String g0(F0.p node) throws Resources.NotFoundException {
        F0.l unmergedConfig = node.getUnmergedConfig();
        F0.s sVar = F0.s.f4372a;
        Object objA = F0.m.a(unmergedConfig, sVar.B());
        G0.a aVar = (G0.a) F0.m.a(node.getUnmergedConfig(), sVar.G());
        F0.i iVar = (F0.i) F0.m.a(node.getUnmergedConfig(), sVar.y());
        if (aVar != null) {
            int i10 = j.f23443a[aVar.ordinal()];
            if (i10 == 1) {
                if ((iVar == null ? false : F0.i.k(iVar.getValue(), F0.i.INSTANCE.f())) && objA == null) {
                    objA = this.view.getContext().getResources().getString(b0.m.f29987o);
                }
            } else if (i10 == 2) {
                if ((iVar == null ? false : F0.i.k(iVar.getValue(), F0.i.INSTANCE.f())) && objA == null) {
                    objA = this.view.getContext().getResources().getString(b0.m.f29986n);
                }
            } else if (i10 == 3 && objA == null) {
                objA = this.view.getContext().getResources().getString(b0.m.f29979g);
            }
        }
        Boolean bool = (Boolean) F0.m.a(node.getUnmergedConfig(), sVar.A());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(iVar == null ? false : F0.i.k(iVar.getValue(), F0.i.INSTANCE.g())) && objA == null) {
                objA = zBooleanValue ? this.view.getContext().getResources().getString(b0.m.f29984l) : this.view.getContext().getResources().getString(b0.m.f29981i);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) F0.m.a(node.getUnmergedConfig(), sVar.x());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.a()) {
                if (objA == null) {
                    Ha.b<Float> bVarC = progressBarRangeInfo.c();
                    float current = ((bVarC.h().floatValue() - bVarC.c().floatValue()) > 0.0f ? 1 : ((bVarC.h().floatValue() - bVarC.c().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - bVarC.c().floatValue()) / (bVarC.h().floatValue() - bVarC.c().floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == 0.0f)) {
                        iK = (current == 1.0f ? 1 : 0) != 0 ? 100 : Ha.g.k(Math.round(current * 100), 1, 99);
                    }
                    objA = this.view.getContext().getResources().getString(b0.m.f29990r, Integer.valueOf(iK));
                }
            } else if (objA == null) {
                objA = this.view.getContext().getResources().getString(b0.m.f29978f);
            }
        }
        if (node.getUnmergedConfig().i(sVar.g())) {
            objA = T(node);
        }
        return (String) objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g1() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2047w.g1():void");
    }

    private final C1060d h0(F0.p node) {
        C1060d c1060dK0 = k0(node.getUnmergedConfig());
        List list = (List) F0.m.a(node.getUnmergedConfig(), F0.s.f4372a.D());
        return c1060dK0 == null ? list != null ? (C1060d) kotlin.collections.r.l0(list) : null : c1060dK0;
    }

    private final String i0(F0.p node) {
        C1060d c1060d;
        if (node == null) {
            return null;
        }
        F0.l unmergedConfig = node.getUnmergedConfig();
        F0.s sVar = F0.s.f4372a;
        if (unmergedConfig.i(sVar.d())) {
            return W0.a.e((List) node.getUnmergedConfig().x(sVar.d()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().i(sVar.g())) {
            C1060d c1060dK0 = k0(node.getUnmergedConfig());
            if (c1060dK0 != null) {
                return c1060dK0.getText();
            }
            return null;
        }
        List list = (List) F0.m.a(node.getUnmergedConfig(), sVar.D());
        if (list == null || (c1060d = (C1060d) kotlin.collections.r.l0(list)) == null) {
            return null;
        }
        return c1060d.getText();
    }

    private final InterfaceC2016g j0(F0.p node, int granularity) {
        String strI0;
        TextLayoutResult textLayoutResultE;
        if (node == null || (strI0 = i0(node)) == null || strI0.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            C2008c c2008cA = C2008c.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            c2008cA.e(strI0);
            return c2008cA;
        }
        if (granularity == 2) {
            C2018h c2018hA = C2018h.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            c2018hA.e(strI0);
            return c2018hA;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                C2014f c2014fA = C2014f.INSTANCE.a();
                c2014fA.e(strI0);
                return c2014fA;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().i(F0.k.f4315a.i()) || (textLayoutResultE = W0.e(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            C2010d c2010dA = C2010d.INSTANCE.a();
            c2010dA.j(strI0, textLayoutResultE);
            return c2010dA;
        }
        C2012e c2012eA = C2012e.INSTANCE.a();
        c2012eA.j(strI0, textLayoutResultE, node);
        return c2012eA;
    }

    private final C1060d k0(F0.l lVar) {
        return (C1060d) F0.m.a(lVar, F0.s.f4372a.g());
    }

    private final boolean n0(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final boolean o0(F0.p node) {
        F0.l unmergedConfig = node.getUnmergedConfig();
        F0.s sVar = F0.s.f4372a;
        return !unmergedConfig.i(sVar.d()) && node.getUnmergedConfig().i(sVar.g());
    }

    private final boolean q0(F0.p node) {
        List list = (List) F0.m.a(node.getUnmergedConfig(), F0.s.f4372a.d());
        boolean z10 = ((list != null ? (String) kotlin.collections.r.l0(list) : null) == null && h0(node) == null && g0(node) == null && !f0(node)) ? false : true;
        if (W0.g(node)) {
            if (node.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                return true;
            }
            if (node.A() && z10) {
                return true;
            }
        }
        return false;
    }

    private final boolean r0() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(A0.G layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.w(C4153F.f46609a);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:91:0x01a8
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01a7 -> B:91:0x01a8). Please report as a decompilation issue!!! */
    public final boolean v0(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2047w.v0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean w0(ScrollAxisRange scrollAxisRange, float f10) {
        return (f10 < 0.0f && scrollAxisRange.c().invoke().floatValue() > 0.0f) || (f10 > 0.0f && scrollAxisRange.c().invoke().floatValue() < scrollAxisRange.a().invoke().floatValue());
    }

    private static final float x0(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y0(int r17, t1.t r18, F0.p r19) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2047w.y0(int, t1.t, F0.p):void");
    }

    private static final boolean z0(ScrollAxisRange scrollAxisRange) {
        return (scrollAxisRange.c().invoke().floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (scrollAxisRange.c().invoke().floatValue() < scrollAxisRange.a().invoke().floatValue() && scrollAxisRange.getReverseScrolling());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:49:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0086 -> B:42:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cf -> B:42:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(ta.InterfaceC4588d<? super oa.C4153F> r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2047w.M(ta.d):java.lang.Object");
    }

    public final boolean N(boolean vertical, int direction, long position) {
        if (C3862t.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return O(a0(), vertical, direction, position);
        }
        return false;
    }

    public final void S0(long j10) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j10;
    }

    public final boolean V(MotionEvent event) {
        if (!r0()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iM0 = m0(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            f1(iM0);
            if (iM0 == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        f1(Integer.MIN_VALUE);
        return true;
    }

    @Override // s1.C4421a
    public t1.u b(View host) {
        return this.nodeProvider;
    }

    /* renamed from: b0, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* renamed from: c0, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: d0, reason: from getter */
    public final C4415z getIdToAfterMap() {
        return this.idToAfterMap;
    }

    /* renamed from: e0, reason: from getter */
    public final C4415z getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    /* renamed from: l0, reason: from getter */
    public final C2036q getView() {
        return this.view;
    }

    public final int m0(float x10, float y10) {
        int iF0;
        A0.m0.y(this.view, false, 1, null);
        C0841u c0841u = new C0841u();
        this.view.getRoot().z0(C3477h.a(x10, y10), c0841u, (12 & 4) != 0, (12 & 8) != 0);
        int iO = kotlin.collections.r.o(c0841u);
        while (true) {
            iF0 = Integer.MIN_VALUE;
            if (-1 >= iO) {
                break;
            }
            A0.G gK = C0832k.k(c0841u.get(iO));
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(gK) != null) {
                return Integer.MIN_VALUE;
            }
            if (gK.getNodes().q(A0.e0.a(8))) {
                iF0 = F0(gK.getSemanticsId());
                if (W0.f(F0.q.a(gK, false))) {
                    break;
                }
            }
            iO--;
        }
        return iF0;
    }

    public final boolean p0() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty());
    }

    public final void t0(A0.G layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (p0()) {
            s0(layoutNode);
        }
    }

    public final void u0() {
        this.currentSemanticsNodesInvalidated = true;
        if (!p0() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }
}
