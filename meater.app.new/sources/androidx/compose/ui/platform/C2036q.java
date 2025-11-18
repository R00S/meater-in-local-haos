package androidx.compose.ui.platform;

import A0.AbstractC0834m;
import A0.C0832k;
import A0.G;
import A0.InterfaceC0831j;
import A0.m0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.AbstractC2106m;
import android.view.FocusFinder;
import android.view.InterfaceC2097e;
import android.view.InterfaceC2114v;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.b;
import androidx.compose.ui.platform.C2036q;
import androidx.compose.ui.platform.j1;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import b0.i;
import c0.C2305a;
import d0.ViewOnAttachStateChangeListenerC3012b;
import e0.C3110a;
import e0.C3117h;
import e0.InterfaceC3112c;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import h0.C3482m;
import i0.C3550M;
import i0.C3588m0;
import i0.InterfaceC3586l0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.AbstractC1341l;
import kotlin.C1345p;
import kotlin.InterfaceC1340k;
import kotlin.InterfaceC1563p0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;
import oa.C4148A;
import oa.C4153F;
import oa.InterfaceC4156a;
import q0.C4259b;
import q0.InterfaceC4258a;
import r0.C4331a;
import r0.C4333c;
import r0.InterfaceC4332b;
import s0.C4416a;
import s0.C4417b;
import s0.C4418c;
import s0.C4419d;
import s1.C4421a;
import s1.C4422a0;
import t3.C4550g;
import t3.InterfaceC4549f;
import ta.InterfaceC4588d;
import u0.C4616B;
import u0.C4618D;
import u0.C4619E;
import u0.C4626L;
import u0.C4629O;
import u0.C4642h;
import u0.InterfaceC4628N;
import u0.InterfaceC4633T;
import u0.InterfaceC4655u;
import u0.InterfaceC4657w;
import u0.PointerInputEventData;
import ua.C4696b;
import w0.RotaryScrollEvent;
import x0.C5047a;
import y0.Z;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000®\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002©\u0004\b\u0000\u0018\u0000 â\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00029:B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0#H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b)\u0010*J'\u00100\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\u001c2\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\u000e*\u000202H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u0010\u001eJ%\u0010<\u001a\u00020;2\u0006\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001cH\u0002¢\u0006\u0004\bA\u0010\u001eJ\u0017\u0010C\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bC\u00105J\u0017\u0010D\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bD\u00105J\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u001d\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020EH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020E2\u0006\u0010M\u001a\u00020EH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bP\u0010HJ\u001d\u0010Q\u001a\u00020J2\u0006\u0010I\u001a\u00020EH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010LJ1\u0010V\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020E2\u0006\u0010R\u001a\u00020\u00142\u0006\u0010T\u001a\u00020S2\b\b\u0002\u0010U\u001a\u00020\u000eH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bX\u0010HJ\u000f\u0010Y\u001a\u00020\u001cH\u0002¢\u0006\u0004\bY\u0010\u001eJ\u0017\u0010Z\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\\\u0010\u001eJ\u000f\u0010]\u001a\u00020\u000eH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\b_\u0010HJ\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\b`\u0010HJ!\u0010c\u001a\u0004\u0018\u00010\u00162\u0006\u0010a\u001a\u00020\u00142\u0006\u0010b\u001a\u00020\u0016H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u001c2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020\u001c2\u0006\u0010j\u001a\u00020iH\u0016¢\u0006\u0004\bk\u0010lJ-\u0010s\u001a\u00020\u001c2\u0006\u0010m\u001a\u00020e2\u0006\u0010o\u001a\u00020n2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020q0pH\u0016¢\u0006\u0004\bs\u0010tJ\u0017\u0010w\u001a\u00020\u001c2\u0006\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bw\u0010xJ#\u0010z\u001a\u0004\u0018\u00010\u00162\b\u0010y\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\bz\u0010{J!\u0010|\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010eH\u0016¢\u0006\u0004\b|\u0010}J*\u0010\u007f\u001a\u00020\u001c2\u0006\u0010~\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010eH\u0014¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u00020\u001c2\u0007\u0010\u0081\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001b\u0010\u0085\u0001\u001a\u00020\u000e2\u0007\u0010F\u001a\u00030\u0084\u0001H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u000e2\u0007\u0010F\u001a\u00030\u0084\u0001H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u001b\u0010\u0089\u0001\u001a\u00020\u001c2\u0007\u0010\u0088\u0001\u001a\u00020SH\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0019\u0010\u008b\u0001\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0016¢\u0006\u0005\b\u008b\u0001\u00105J\u0019\u0010\u008c\u0001\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0016¢\u0006\u0005\b\u008c\u0001\u00105J\u000f\u0010\u008d\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u008d\u0001\u0010\u001eJ\u0011\u0010\u008e\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u008e\u0001\u0010\u001eJ\"\u0010\u0091\u0001\u001a\u00020\u001c2\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0\u008f\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u001d\u0010\u0094\u0001\u001a\u00020\u001c2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J&\u0010\u0094\u0001\u001a\u00020\u001c2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u0096\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0097\u0001J/\u0010\u0094\u0001\u001a\u00020\u001c2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u0098\u0001\u001a\u00020\u00142\u0007\u0010\u0099\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u009a\u0001J)\u0010\u0094\u0001\u001a\u00020\u001c2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00162\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u009d\u0001J2\u0010\u0094\u0001\u001a\u00020\u001c2\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u0096\u0001\u001a\u00020\u00142\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u009e\u0001J#\u0010¢\u0001\u001a\u00020\u001c2\b\u0010 \u0001\u001a\u00030\u009f\u00012\u0007\u0010¡\u0001\u001a\u000202¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001a\u0010¤\u0001\u001a\u00020\u001c2\b\u0010 \u0001\u001a\u00030\u009f\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001J$\u0010¨\u0001\u001a\u00020\u001c2\b\u0010 \u0001\u001a\u00030\u009f\u00012\b\u0010§\u0001\u001a\u00030¦\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u00109\u001a\u00020\u001c2\u0007\u0010ª\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b9\u0010\u0083\u0001J(\u0010\u00ad\u0001\u001a\u00020\u001c2\u0007\u0010¡\u0001\u001a\u0002022\b\u0010¬\u0001\u001a\u00030«\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J$\u0010°\u0001\u001a\u00020\u001c2\u0007\u0010¡\u0001\u001a\u0002022\u0007\u0010¯\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J6\u0010´\u0001\u001a\u00020\u001c2\u0007\u0010¡\u0001\u001a\u0002022\u0007\u0010¯\u0001\u001a\u00020\u000e2\u0007\u0010²\u0001\u001a\u00020\u000e2\u0007\u0010³\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J-\u0010¶\u0001\u001a\u00020\u001c2\u0007\u0010¡\u0001\u001a\u0002022\u0007\u0010¯\u0001\u001a\u00020\u000e2\u0007\u0010²\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001a\u0010¸\u0001\u001a\u00020\u001c2\u0007\u0010¡\u0001\u001a\u000202H\u0016¢\u0006\u0005\b¸\u0001\u00105J$\u0010»\u0001\u001a\u00020\u001c2\u0007\u0010¹\u0001\u001a\u00020\u00142\u0007\u0010º\u0001\u001a\u00020\u0014H\u0014¢\u0006\u0006\b»\u0001\u0010¼\u0001J>\u0010À\u0001\u001a\u00020\u001c2\u0007\u0010½\u0001\u001a\u00020\u000e2\u0007\u0010\u008c\u0001\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020\u00142\u0007\u0010¿\u0001\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u0014H\u0014¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001c\u0010Â\u0001\u001a\u00020\u001c2\b\u0010§\u0001\u001a\u00030¦\u0001H\u0014¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001JO\u0010Ë\u0001\u001a\u00030Ê\u00012\u001e\u0010Ç\u0001\u001a\u0019\u0012\u0005\u0012\u00030Å\u0001\u0012\u0007\u0012\u0005\u0018\u00010Æ\u0001\u0012\u0004\u0012\u00020\u001c0Ä\u00012\u000e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0\u008f\u00012\n\u0010É\u0001\u001a\u0005\u0018\u00010Æ\u0001H\u0016¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001c\u0010Î\u0001\u001a\u00020\u000e2\b\u0010Í\u0001\u001a\u00030Ê\u0001H\u0000¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0011\u0010Ð\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\bÐ\u0001\u0010\u001eJ\u001a\u0010Ñ\u0001\u001a\u00020\u001c2\u0007\u0010¡\u0001\u001a\u000202H\u0016¢\u0006\u0005\bÑ\u0001\u00105J \u0010Ó\u0001\u001a\u00020\u001c2\f\u0010 \u0001\u001a\u00070\u0016j\u0003`Ò\u0001H\u0016¢\u0006\u0006\bÓ\u0001\u0010\u0095\u0001J\u001c\u0010Õ\u0001\u001a\u00020\u001c2\b\u0010\u0090\u0001\u001a\u00030Ô\u0001H\u0016¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J!\u0010Ù\u0001\u001a\u0004\u0018\u00010\f2\b\u0010Ø\u0001\u001a\u00030×\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u001c\u0010Û\u0001\u001a\u00020\u001c2\b\u0010§\u0001\u001a\u00030¦\u0001H\u0014¢\u0006\u0006\bÛ\u0001\u0010Ã\u0001J%\u0010Ý\u0001\u001a\u00020\u001c2\b\u0010Í\u0001\u001a\u00030Ê\u00012\u0007\u0010Ü\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001J&\u0010á\u0001\u001a\u00020\u001c2\u0014\u0010à\u0001\u001a\u000f\u0012\u0005\u0012\u00030ß\u0001\u0012\u0004\u0012\u00020\u001c0#¢\u0006\u0006\bá\u0001\u0010â\u0001J\u0013\u0010ã\u0001\u001a\u00020\u001cH\u0086@¢\u0006\u0006\bã\u0001\u0010ä\u0001J\u0013\u0010å\u0001\u001a\u00020\u001cH\u0086@¢\u0006\u0006\bå\u0001\u0010ä\u0001J\u0011\u0010æ\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\bæ\u0001\u0010\u001eJ\u0011\u0010ç\u0001\u001a\u00020\u001cH\u0014¢\u0006\u0005\bç\u0001\u0010\u001eJ\u0011\u0010è\u0001\u001a\u00020\u001cH\u0014¢\u0006\u0005\bè\u0001\u0010\u001eJ%\u0010ê\u0001\u001a\u00020\u001c2\b\u0010j\u001a\u0004\u0018\u00010i2\u0007\u0010é\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\bê\u0001\u0010ë\u0001J#\u0010ï\u0001\u001a\u00020\u001c2\u000f\u0010î\u0001\u001a\n\u0012\u0005\u0012\u00030í\u00010ì\u0001H\u0016¢\u0006\u0006\bï\u0001\u0010ð\u0001J8\u0010÷\u0001\u001a\u00020\u001c2\b\u0010ò\u0001\u001a\u00030ñ\u00012\b\u0010ô\u0001\u001a\u00030ó\u00012\u0010\u0010ö\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010õ\u00010pH\u0017¢\u0006\u0006\b÷\u0001\u0010ø\u0001J%\u0010ü\u0001\u001a\u00020\u001c2\u0011\u0010û\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ú\u00010ù\u0001H\u0017¢\u0006\u0006\bü\u0001\u0010ý\u0001J\u0019\u0010þ\u0001\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0016¢\u0006\u0005\bþ\u0001\u0010HJ\u0019\u0010ÿ\u0001\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0016¢\u0006\u0005\bÿ\u0001\u0010HJ\u0019\u0010\u0080\u0002\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0080\u0002\u0010\u0010J\u0019\u0010\u0081\u0002\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0081\u0002\u0010\u0010J \u0010\u0084\u0002\u001a\u00030\u0082\u00022\b\u0010\u0083\u0002\u001a\u00030\u0082\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J\u001f\u0010¿\u0001\u001a\u00020\u001c2\b\u0010\u0087\u0002\u001a\u00030\u0086\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b¿\u0001\u0010\u0088\u0002J \u0010\u008a\u0002\u001a\u00030\u0082\u00022\b\u0010\u0089\u0002\u001a\u00030\u0082\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u008a\u0002\u0010\u0085\u0002J\u0011\u0010\u008b\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008b\u0002\u0010^J\u001f\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u008e\u00022\b\u0010\u008d\u0002\u001a\u00030\u008c\u0002H\u0016¢\u0006\u0006\b\u008f\u0002\u0010\u0090\u0002J \u0010\u0091\u0002\u001a\u00030\u0082\u00022\b\u0010\u0083\u0002\u001a\u00030\u0082\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0091\u0002\u0010\u0085\u0002J\u001c\u0010\u0094\u0002\u001a\u00020\u001c2\b\u0010\u0093\u0002\u001a\u00030\u0092\u0002H\u0014¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J\u001b\u0010\u0097\u0002\u001a\u00020\u001c2\u0007\u0010\u0096\u0002\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J\u0019\u0010\u0099\u0002\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0005\b\u0099\u0002\u0010HJ\u0019\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u00162\u0006\u0010a\u001a\u00020\u0014¢\u0006\u0005\b\u009a\u0002\u0010\u0018J\u0011\u0010\u009b\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u009b\u0002\u0010^R \u0010\u009e\u0002\u001a\u00030\u0082\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009d\u0002R\u0019\u0010 \u0002\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010¢\u0001R \u0010¦\u0002\u001a\u00030¡\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002R5\u0010¯\u0002\u001a\u00030§\u00022\b\u0010¨\u0002\u001a\u00030§\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0006\b«\u0002\u0010¬\u0002\"\u0006\b\u00ad\u0002\u0010®\u0002R\u0018\u0010³\u0002\u001a\u00030°\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\u0018\u0010·\u0002\u001a\u00030´\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R \u0010½\u0002\u001a\u00030¸\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¹\u0002\u0010º\u0002\u001a\u0006\b»\u0002\u0010¼\u0002R\u0018\u0010Á\u0002\u001a\u00030¾\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R1\u0010\t\u001a\u00020\b2\u0007\u0010Â\u0002\u001a\u00020\b8\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u009d\u0002\u0010Ã\u0002\u001a\u0006\bÄ\u0002\u0010Å\u0002\"\u0006\bÆ\u0002\u0010Ç\u0002R \u0010Í\u0002\u001a\u00030È\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÉ\u0002\u0010Ê\u0002\u001a\u0006\bË\u0002\u0010Ì\u0002R\u0018\u0010Ñ\u0002\u001a\u00030Î\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0002\u0010Ð\u0002R\u0018\u0010Õ\u0002\u001a\u00030Ò\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÓ\u0002\u0010Ô\u0002R\u0018\u0010×\u0002\u001a\u00030Ò\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0002\u0010Ô\u0002R\u0018\u0010Û\u0002\u001a\u00030Ø\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R\u001f\u0010à\u0002\u001a\u0002028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÜ\u0002\u0010Ý\u0002\u001a\u0006\bÞ\u0002\u0010ß\u0002R \u0010æ\u0002\u001a\u00030á\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bâ\u0002\u0010ã\u0002\u001a\u0006\bä\u0002\u0010å\u0002R \u0010ì\u0002\u001a\u00030ç\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bè\u0002\u0010é\u0002\u001a\u0006\bê\u0002\u0010ë\u0002R\u0018\u0010ð\u0002\u001a\u00030í\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0002\u0010ï\u0002R*\u0010ø\u0002\u001a\u00030ñ\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bò\u0002\u0010ó\u0002\u001a\u0006\bô\u0002\u0010õ\u0002\"\u0006\bö\u0002\u0010÷\u0002R \u0010þ\u0002\u001a\u00030ù\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bú\u0002\u0010û\u0002\u001a\u0006\bü\u0002\u0010ý\u0002R \u0010\u0084\u0003\u001a\u00030ÿ\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0080\u0003\u0010\u0081\u0003\u001a\u0006\b\u0082\u0003\u0010\u0083\u0003R \u0010\u008a\u0003\u001a\u00030\u0085\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0086\u0003\u0010\u0087\u0003\u001a\u0006\b\u0088\u0003\u0010\u0089\u0003R\u001e\u0010\u008d\u0003\u001a\n\u0012\u0005\u0012\u00030Ê\u00010\u008b\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010\u008c\u0003R\"\u0010\u008e\u0003\u001a\f\u0012\u0005\u0012\u00030Ê\u0001\u0018\u00010\u008b\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010\u008c\u0003R\u0019\u0010\u008f\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bå\u0001\u0010¢\u0001R\u0019\u0010\u0090\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010¢\u0001R\u0017\u0010\u0093\u0003\u001a\u00030\u0091\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010\u0092\u0003R\u0017\u0010\u0096\u0003\u001a\u00030\u0094\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0095\u0003R5\u0010\u009b\u0003\u001a\u000f\u0012\u0005\u0012\u00030\u0092\u0002\u0012\u0004\u0012\u00020\u001c0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b?\u0010\u0097\u0003\u001a\u0006\b\u0098\u0003\u0010\u0099\u0003\"\u0006\b\u009a\u0003\u0010â\u0001R\u0019\u0010\u009e\u0003\u001a\u0005\u0018\u00010\u009c\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010\u009d\u0003R\u0019\u0010\u009f\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010¢\u0001R\u001f\u0010¤\u0003\u001a\u00030 \u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0017\u0010¡\u0003\u001a\u0006\b¢\u0003\u0010£\u0003R\u001f\u0010©\u0003\u001a\u00030¥\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bc\u0010¦\u0003\u001a\u0006\b§\u0003\u0010¨\u0003R/\u0010\u00ad\u0003\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u001e\n\u0006\bÙ\u0001\u0010¢\u0001\u0012\u0005\b¬\u0003\u0010\u001e\u001a\u0005\bª\u0003\u0010^\"\u0006\b«\u0003\u0010\u0083\u0001R\u001c\u0010±\u0003\u001a\u0005\u0018\u00010®\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0003\u0010°\u0003R\u001c\u0010µ\u0003\u001a\u0005\u0018\u00010²\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0003\u0010´\u0003R!\u0010·\u0003\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bK\u0010¶\u0003R\u0018\u0010¸\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bG\u0010¢\u0001R\u0017\u0010»\u0003\u001a\u00030¹\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010º\u0003R \u0010À\u0003\u001a\u00030¼\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010½\u0003\u001a\u0006\b¾\u0003\u0010¿\u0003R\u001f\u0010Â\u0003\u001a\u00030Á\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bD\u0010\u009d\u0002R\u0017\u0010Ä\u0003\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010Ã\u0003R\u001d\u0010Æ\u0003\u001a\u00030\u0086\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b_\u0010Å\u0003R\u001d\u0010Ç\u0003\u001a\u00030\u0086\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bP\u0010Å\u0003R\u001d\u0010È\u0003\u001a\u00030\u0086\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bX\u0010Å\u0003R/\u0010Í\u0003\u001a\u00020S8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b`\u0010\u009d\u0002\u0012\u0005\bÌ\u0003\u0010\u001e\u001a\u0006\bÉ\u0003\u0010Ê\u0003\"\u0006\bË\u0003\u0010\u008a\u0001R\u0019\u0010Î\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010¢\u0001R\u001f\u0010Ï\u0003\u001a\u00030\u0082\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u001d\u0010\u009d\u0002R\u0018\u0010Ð\u0003\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010¢\u0001R8\u0010Õ\u0003\u001a\u0005\u0018\u00010ß\u00012\n\u0010¨\u0002\u001a\u0005\u0018\u00010ß\u00018B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u000f\u0010ª\u0002\u001a\u0006\bÑ\u0003\u0010Ò\u0003\"\u0006\bÓ\u0003\u0010Ô\u0003R\"\u0010Ø\u0003\u001a\u0005\u0018\u00010ß\u00018FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u001a\u0010Ö\u0003\u001a\u0006\b×\u0003\u0010Ò\u0003R'\u0010Ù\u0003\u001a\u0011\u0012\u0005\u0012\u00030ß\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010\u0097\u0003R\u0017\u0010Ü\u0003\u001a\u00030Ú\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bY\u0010Û\u0003R\u0017\u0010ß\u0003\u001a\u00030Ý\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bZ\u0010Þ\u0003R\u0017\u0010â\u0003\u001a\u00030à\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010á\u0003R\u0018\u0010å\u0003\u001a\u00030ã\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010ä\u0003R \u0010ê\u0003\u001a\u00030æ\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010ç\u0003\u001a\u0006\bè\u0003\u0010é\u0003R%\u0010î\u0003\u001a\n\u0012\u0005\u0012\u00030ì\u00030ë\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\b\u008d\u0001\u0010í\u0003R\u001f\u0010ó\u0003\u001a\u00030ï\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b4\u0010ð\u0003\u001a\u0006\bñ\u0003\u0010ò\u0003R'\u0010ú\u0003\u001a\u00030ô\u00038\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bõ\u0003\u0010ö\u0003\u0012\u0005\bù\u0003\u0010\u001e\u001a\u0006\b÷\u0003\u0010ø\u0003R5\u0010\u0081\u0004\u001a\u00030û\u00032\b\u0010¨\u0002\u001a\u00030û\u00038V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bü\u0003\u0010ª\u0002\u001a\u0006\bý\u0003\u0010þ\u0003\"\u0006\bÿ\u0003\u0010\u0080\u0004R\u0019\u0010\u0083\u0004\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0004\u0010¿\u0002R4\u0010\u0096\u0002\u001a\u00030\u0084\u00042\b\u0010¨\u0002\u001a\u00030\u0084\u00048V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\bQ\u0010ª\u0002\u001a\u0006\b\u0085\u0004\u0010\u0086\u0004\"\u0006\b\u0087\u0004\u0010\u0088\u0004R\u001f\u0010\u008d\u0004\u001a\u00030\u0089\u00048\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bV\u0010\u008a\u0004\u001a\u0006\b\u008b\u0004\u0010\u008c\u0004R\u0018\u0010\u0091\u0004\u001a\u00030\u008e\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0004\u0010\u0090\u0004R\u001f\u0010\u0096\u0004\u001a\u00030\u0092\u00048\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b&\u0010\u0093\u0004\u001a\u0006\b\u0094\u0004\u0010\u0095\u0004R \u0010\u009c\u0004\u001a\u00030\u0097\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0004\u0010\u0099\u0004\u001a\u0006\b\u009a\u0004\u0010\u009b\u0004R\u001a\u0010\u009e\u0004\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010\u009d\u0004R\u0019\u0010 \u0004\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0004\u0010\u009d\u0002R\u001f\u0010¤\u0004\u001a\n\u0012\u0005\u0012\u00030Ê\u00010¡\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0004\u0010£\u0004R'\u0010¨\u0004\u001a\u0012\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u008f\u00010¥\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0004\u0010§\u0004R\u0018\u0010¬\u0004\u001a\u00030©\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0004\u0010«\u0004R\u0018\u0010°\u0004\u001a\u00030\u00ad\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0004\u0010¯\u0004R\u0019\u0010²\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0004\u0010¢\u0001R\u001e\u0010µ\u0004\u001a\t\u0012\u0004\u0012\u00020\u001c0\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0004\u0010´\u0004R\u0018\u0010¹\u0004\u001a\u00030¶\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0004\u0010¸\u0004R\u0019\u0010»\u0004\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0004\u0010¢\u0001R\u001a\u0010¿\u0004\u001a\u0005\u0018\u00010¼\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0004\u0010¾\u0004R \u0010Å\u0004\u001a\u00030À\u00048\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÁ\u0004\u0010Â\u0004\u001a\u0006\bÃ\u0004\u0010Ä\u0004R\u001c\u0010Ç\u0004\u001a\u00020\u0014*\u00030\u0092\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0003\u0010Æ\u0004R\u0017\u0010 \u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\b\u001a\u0006\bÈ\u0004\u0010É\u0004R\u0018\u0010Í\u0004\u001a\u00030Ê\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0004\u0010Ì\u0004R\u001a\u0010ï\u0001\u001a\u0005\u0018\u00010Î\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0004\u0010Ð\u0004R\u0018\u0010Ó\u0004\u001a\u00030®\u00038@X\u0080\u0004¢\u0006\b\u001a\u0006\bÑ\u0004\u0010Ò\u0004R\u0017\u0010Õ\u0004\u001a\u00020S8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0004\u0010Ê\u0003R\u0016\u0010×\u0004\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0004\u0010^R\u0018\u0010Û\u0004\u001a\u00030Ø\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÙ\u0004\u0010Ú\u0004R\u0018\u0010ß\u0004\u001a\u00030Ü\u00048VX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0004\u0010Þ\u0004R\u0016\u0010á\u0004\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bà\u0004\u0010^\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ã\u0004"}, d2 = {"Landroidx/compose/ui/platform/q;", "Landroid/view/ViewGroup;", "LA0/m0;", "Landroidx/compose/ui/platform/o1;", "Lu0/N;", "Landroidx/lifecycle/e;", "Landroid/content/Context;", "context", "Lta/g;", "coroutineContext", "<init>", "(Landroid/content/Context;Lta/g;)V", "Landroidx/compose/ui/focus/b;", "focusDirection", "", "B0", "(I)Z", "Lh0/i;", "A0", "()Lh0/i;", "", "direction", "Landroid/view/View;", "j0", "(I)Landroid/view/View;", "previouslyFocusedRect", "C0", "(Landroidx/compose/ui/focus/b;Lh0/i;)Z", "Loa/F;", "z0", "()V", "Le0/h;", "transferData", "Lh0/m;", "decorationSize", "Lkotlin/Function1;", "Lk0/f;", "drawDragDecoration", "R0", "(Le0/h;JLBa/l;)Z", "viewGroup", "f0", "(Landroid/view/ViewGroup;)V", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "extraDataKey", "a0", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V", "LA0/G;", "nodeToRemeasure", "K0", "(LA0/G;)V", "e0", "(LA0/G;)Z", "h0", "a", "b", "Loa/A;", "D0", "(II)J", "measureSpec", "g0", "(I)J", "T0", "node", "t0", "s0", "Landroid/view/MotionEvent;", "event", "p0", "(Landroid/view/MotionEvent;)Z", "motionEvent", "Lu0/O;", "o0", "(Landroid/view/MotionEvent;)I", "lastEvent", "q0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", "v0", "O0", "action", "", "eventTime", "forceHover", "P0", "(Landroid/view/MotionEvent;IJZ)V", "w0", "E0", "F0", "(Landroid/view/MotionEvent;)V", "G0", "b0", "()Z", "u0", "x0", "accessibilityId", "currentView", "k0", "(ILandroid/view/View;)Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "localVisibleRect", "Landroid/graphics/Point;", "windowOffset", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "onScrollCaptureSearch", "(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V", "Landroidx/lifecycle/v;", "owner", "d", "(Landroidx/lifecycle/v;)V", "focused", "focusSearch", "(Landroid/view/View;I)Landroid/view/View;", "requestFocus", "(ILandroid/graphics/Rect;)Z", "gainFocus", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEventPreIme", "intervalMillis", "setAccessibilityEventBatchIntervalMillis", "(J)V", "u", "l", "J0", "v", "Lkotlin/Function0;", "listener", "k", "(LBa/a;)V", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroidx/compose/ui/viewinterop/c;", "view", "layoutNode", "Z", "(Landroidx/compose/ui/viewinterop/c;LA0/G;)V", "I0", "(Landroidx/compose/ui/viewinterop/c;)V", "Landroid/graphics/Canvas;", "canvas", "i0", "(Landroidx/compose/ui/viewinterop/c;Landroid/graphics/Canvas;)V", "sendPointerUpdate", "LU0/b;", "constraints", "A", "(LA0/G;J)V", "affectsLookahead", "g", "(LA0/G;Z)V", "forceRequest", "scheduleMeasureAndLayout", "n", "(LA0/G;ZZZ)V", "z", "(LA0/G;ZZ)V", "i", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "t", "r", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function2;", "Li0/l0;", "Ll0/c;", "drawBlock", "invalidateParentLayer", "explicitLayer", "LA0/l0;", "s", "(LBa/p;LBa/a;Ll0/c;)LA0/l0;", "layer", "H0", "(LA0/l0;)Z", "w", "c", "Landroidx/compose/ui/viewinterop/InteropView;", "m", "LA0/m0$b;", "p", "(LA0/m0$b;)V", "Ls0/b;", "keyEvent", "l0", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/b;", "dispatchDraw", "isDirty", "y0", "(LA0/l0;Z)V", "Landroidx/compose/ui/platform/q$b;", "callback", "setOnViewTreeOwnersAvailable", "(LBa/l;)V", "d0", "(Lta/d;)Ljava/lang/Object;", "c0", "r0", "onAttachedToWindow", "onDetachedFromWindow", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "", "virtualIds", "", "supportedFormats", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses", "(Landroid/util/LongSparseArray;)V", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Lh0/g;", "localPosition", "q", "(J)J", "Li0/L0;", "localTransform", "([F)V", "positionOnScreen", "x", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "h", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "B", "J", "lastDownPointerPosition", "C", "superclassInitComplete", "LA0/I;", "D", "LA0/I;", "getSharedDrawScope", "()LA0/I;", "sharedDrawScope", "LU0/d;", "<set-?>", "E", "LO/p0;", "getDensity", "()LU0/d;", "setDensity", "(LU0/d;)V", "density", "LF0/f;", "F", "LF0/f;", "rootSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "G", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsModifier", "Lg0/i;", "H", "Lg0/i;", "getFocusOwner", "()Lg0/i;", "focusOwner", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "I", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "dragAndDropModifierOnDragListener", "value", "Lta/g;", "getCoroutineContext", "()Lta/g;", "setCoroutineContext", "(Lta/g;)V", "Le0/c;", "K", "Le0/c;", "getDragAndDropManager", "()Le0/c;", "dragAndDropManager", "Landroidx/compose/ui/platform/r1;", "L", "Landroidx/compose/ui/platform/r1;", "_windowInfo", "Lb0/i;", "M", "Lb0/i;", "keyInputModifier", "N", "rotaryInputModifier", "Li0/m0;", "O", "Li0/m0;", "canvasHolder", "P", "LA0/G;", "getRoot", "()LA0/G;", "root", "LA0/u0;", "Q", "LA0/u0;", "getRootForTest", "()LA0/u0;", "rootForTest", "LF0/r;", "R", "LF0/r;", "getSemanticsOwner", "()LF0/r;", "semanticsOwner", "Landroidx/compose/ui/platform/w;", "S", "Landroidx/compose/ui/platform/w;", "composeAccessibilityDelegate", "Ld0/b;", "T", "Ld0/b;", "getContentCaptureManager$ui_release", "()Ld0/b;", "setContentCaptureManager$ui_release", "(Ld0/b;)V", "contentCaptureManager", "Landroidx/compose/ui/platform/j;", "U", "Landroidx/compose/ui/platform/j;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/j;", "accessibilityManager", "Li0/F0;", "V", "Li0/F0;", "getGraphicsContext", "()Li0/F0;", "graphicsContext", "Lc0/i;", "W", "Lc0/i;", "getAutofillTree", "()Lc0/i;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "postponedDirtyLayers", "isDrawingContent", "isPendingInteropViewLayoutChangeDispatch", "Lu0/h;", "Lu0/h;", "motionEventAdapter", "Lu0/D;", "Lu0/D;", "pointerInputEventProcessor", "LBa/l;", "getConfigurationChangeObserver", "()LBa/l;", "setConfigurationChangeObserver", "configurationChangeObserver", "Lc0/a;", "Lc0/a;", "_autofill", "observationClearRequested", "Landroidx/compose/ui/platform/k;", "Landroidx/compose/ui/platform/k;", "getClipboardManager", "()Landroidx/compose/ui/platform/k;", "clipboardManager", "LA0/o0;", "LA0/o0;", "getSnapshotObserver", "()LA0/o0;", "snapshotObserver", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "Landroidx/compose/ui/platform/W;", "m0", "Landroidx/compose/ui/platform/W;", "_androidViewsHandler", "Landroidx/compose/ui/platform/k0;", "n0", "Landroidx/compose/ui/platform/k0;", "viewLayersContainer", "LU0/b;", "onMeasureConstraints", "wasMeasuredWithMultipleConstraints", "LA0/S;", "LA0/S;", "measureAndLayoutDelegate", "Landroidx/compose/ui/platform/i1;", "Landroidx/compose/ui/platform/i1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/i1;", "viewConfiguration", "LU0/n;", "globalPosition", "[I", "tmpPositionArray", "[F", "tmpMatrix", "viewToWindowMatrix", "windowToViewMatrix", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "forceUseMatrixCache", "windowPosition", "isRenderNodeCompatible", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/q$b;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/q$b;)V", "_viewTreeOwners", "LO/x1;", "getViewTreeOwners", "viewTreeOwners", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "LM0/H;", "LM0/H;", "legacyTextInputServiceAndroid", "LM0/G;", "LM0/G;", "getTextInputService", "()LM0/G;", "textInputService", "Lb0/o;", "Landroidx/compose/ui/platform/O;", "Ljava/util/concurrent/atomic/AtomicReference;", "textInputSessionMutex", "Landroidx/compose/ui/platform/Y0;", "Landroidx/compose/ui/platform/Y0;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/Y0;", "softwareKeyboardController", "LL0/k$b;", "L0", "LL0/k$b;", "getFontLoader", "()LL0/k$b;", "getFontLoader$annotations", "fontLoader", "LL0/l$b;", "M0", "getFontFamilyResolver", "()LL0/l$b;", "setFontFamilyResolver", "(LL0/l$b;)V", "fontFamilyResolver", "N0", "currentFontWeightAdjustment", "LU0/t;", "getLayoutDirection", "()LU0/t;", "setLayoutDirection", "(LU0/t;)V", "Lq0/a;", "Lq0/a;", "getHapticFeedBack", "()Lq0/a;", "hapticFeedBack", "Lr0/c;", "Q0", "Lr0/c;", "_inputModeManager", "Lz0/f;", "Lz0/f;", "getModifierLocalManager", "()Lz0/f;", "modifierLocalManager", "Landroidx/compose/ui/platform/Z0;", "S0", "Landroidx/compose/ui/platform/Z0;", "getTextToolbar", "()Landroidx/compose/ui/platform/Z0;", "textToolbar", "Landroid/view/MotionEvent;", "previousMotionEvent", "U0", "relayoutTime", "Landroidx/compose/ui/platform/p1;", "V0", "Landroidx/compose/ui/platform/p1;", "layerCache", "LQ/b;", "W0", "LQ/b;", "endApplyChangesListeners", "androidx/compose/ui/platform/q$u", "X0", "Landroidx/compose/ui/platform/q$u;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "Y0", "Ljava/lang/Runnable;", "sendHoverExitEvent", "Z0", "hoverExitReceived", "a1", "LBa/a;", "resendMotionEventOnLayout", "Landroidx/compose/ui/platform/Y;", "b1", "Landroidx/compose/ui/platform/Y;", "matrixToWindow", "c1", "keyboardModifiersRequireUpdate", "LE0/l;", "d1", "LE0/l;", "scrollCapture", "Lu0/w;", "e1", "Lu0/w;", "getPointerIconService", "()Lu0/w;", "pointerIconService", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/q1;", "getWindowInfo", "()Landroidx/compose/ui/platform/q1;", "windowInfo", "Lc0/d;", "getAutofill", "()Lc0/d;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/W;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Ly0/Z$a;", "getPlacementScope", "()Ly0/Z$a;", "placementScope", "Lr0/b;", "getInputModeManager", "()Lr0/b;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "f1", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2036q extends ViewGroup implements A0.m0, o1, InterfaceC4628N, InterfaceC2097e {

    /* renamed from: f1, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g1, reason: collision with root package name */
    public static final int f23228g1 = 8;

    /* renamed from: h1, reason: collision with root package name */
    private static Class<?> f23229h1;

    /* renamed from: i1, reason: collision with root package name */
    private static Method f23230i1;

    /* renamed from: A0, reason: collision with root package name and from kotlin metadata */
    private boolean isRenderNodeCompatible;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private long lastDownPointerPosition;

    /* renamed from: B0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 _viewTreeOwners;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean superclassInitComplete;

    /* renamed from: C0, reason: collision with root package name and from kotlin metadata */
    private final kotlin.x1 viewTreeOwners;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final A0.I sharedDrawScope;

    /* renamed from: D0, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super b, C4153F> onViewTreeOwnersAvailable;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 density;

    /* renamed from: E0, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final F0.f rootSemanticsNode;

    /* renamed from: F0, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final EmptySemanticsElement semanticsModifier;

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final g0.i focusOwner;

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private final M0.H legacyTextInputServiceAndroid;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private final M0.G textInputService;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private ta.g coroutineContext;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference textInputSessionMutex;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3112c dragAndDropManager;

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    private final Y0 softwareKeyboardController;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final r1 _windowInfo;

    /* renamed from: L0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1340k.b fontLoader;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final b0.i keyInputModifier;

    /* renamed from: M0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 fontFamilyResolver;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final b0.i rotaryInputModifier;

    /* renamed from: N0, reason: collision with root package name and from kotlin metadata */
    private int currentFontWeightAdjustment;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final C3588m0 canvasHolder;

    /* renamed from: O0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 layoutDirection;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final A0.G root;

    /* renamed from: P0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4258a hapticFeedBack;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final A0.u0 rootForTest;

    /* renamed from: Q0, reason: collision with root package name and from kotlin metadata */
    private final C4333c _inputModeManager;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final F0.r semanticsOwner;

    /* renamed from: R0, reason: collision with root package name and from kotlin metadata */
    private final z0.f modifierLocalManager;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final C2047w composeAccessibilityDelegate;

    /* renamed from: S0, reason: collision with root package name and from kotlin metadata */
    private final Z0 textToolbar;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private ViewOnAttachStateChangeListenerC3012b contentCaptureManager;

    /* renamed from: T0, reason: collision with root package name and from kotlin metadata */
    private MotionEvent previousMotionEvent;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final C2022j accessibilityManager;

    /* renamed from: U0, reason: collision with root package name and from kotlin metadata */
    private long relayoutTime;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final i0.F0 graphicsContext;

    /* renamed from: V0, reason: collision with root package name and from kotlin metadata */
    private final p1<A0.l0> layerCache;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private final c0.i autofillTree;

    /* renamed from: W0, reason: collision with root package name and from kotlin metadata */
    private final Q.b<Ba.a<C4153F>> endApplyChangesListeners;

    /* renamed from: X0, reason: collision with root package name and from kotlin metadata */
    private final u resendMotionEventRunnable;

    /* renamed from: Y0, reason: collision with root package name and from kotlin metadata */
    private final Runnable sendHoverExitEvent;

    /* renamed from: Z0, reason: collision with root package name and from kotlin metadata */
    private boolean hoverExitReceived;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final List<A0.l0> dirtyLayers;

    /* renamed from: a1, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> resendMotionEventOnLayout;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private List<A0.l0> postponedDirtyLayers;

    /* renamed from: b1, reason: collision with root package name and from kotlin metadata */
    private final Y matrixToWindow;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private boolean isDrawingContent;

    /* renamed from: c1, reason: collision with root package name and from kotlin metadata */
    private boolean keyboardModifiersRequireUpdate;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private boolean isPendingInteropViewLayoutChangeDispatch;

    /* renamed from: d1, reason: collision with root package name and from kotlin metadata */
    private final E0.l scrollCapture;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final C4642h motionEventAdapter;

    /* renamed from: e1, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4657w pointerIconService;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final C4618D pointerInputEventProcessor;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super Configuration, C4153F> configurationChangeObserver;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final C2305a _autofill;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private boolean observationClearRequested;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private final C2024k clipboardManager;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private final A0.o0 snapshotObserver;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private boolean showLayoutBounds;

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private W _androidViewsHandler;

    /* renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private C2025k0 viewLayersContainer;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private U0.b onMeasureConstraints;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private boolean wasMeasuredWithMultipleConstraints;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private final A0.S measureAndLayoutDelegate;

    /* renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private final i1 viewConfiguration;

    /* renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private long globalPosition;

    /* renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final int[] tmpPositionArray;

    /* renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final float[] tmpMatrix;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final float[] viewToWindowMatrix;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final float[] windowToViewMatrix;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private long lastMatrixRecalculationAnimationTime;

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private boolean forceUseMatrixCache;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private long windowPosition;

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/q$a;", "", "<init>", "()V", "", "b", "()Z", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (C2036q.f23229h1 == null) {
                    C2036q.f23229h1 = Class.forName("android.os.SystemProperties");
                    Class cls = C2036q.f23229h1;
                    C2036q.f23230i1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = C2036q.f23230i1;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/q$b;", "", "Landroidx/lifecycle/v;", "lifecycleOwner", "Lt3/f;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/v;Lt3/f;)V", "a", "Landroidx/lifecycle/v;", "()Landroidx/lifecycle/v;", "b", "Lt3/f;", "()Lt3/f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC2114v lifecycleOwner;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC4549f savedStateRegistryOwner;

        public b(InterfaceC2114v interfaceC2114v, InterfaceC4549f interfaceC4549f) {
            this.lifecycleOwner = interfaceC2114v;
            this.savedStateRegistryOwner = interfaceC4549f;
        }

        /* renamed from: a, reason: from getter */
        public final InterfaceC2114v getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        /* renamed from: b, reason: from getter */
        public final InterfaceC4549f getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/a;", "it", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$c */
    static final class c extends AbstractC3864v implements Ba.l<C4331a, Boolean> {
        c() {
            super(1);
        }

        public final Boolean a(int i10) {
            C4331a.Companion companion = C4331a.INSTANCE;
            return Boolean.valueOf(C4331a.f(i10, companion.b()) ? C2036q.this.isInTouchMode() : C4331a.f(i10, companion.a()) ? C2036q.this.isInTouchMode() ? C2036q.this.requestFocusFromTouch() : true : false);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Boolean invoke(C4331a c4331a) {
            return a(c4331a.getValue());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/q$d", "Ls1/a;", "Landroid/view/View;", "host", "Lt1/t;", "info", "Loa/F;", "g", "(Landroid/view/View;Lt1/t;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$d */
    public static final class d extends C4421a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ A0.G f23314e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C2036q f23315f;

        /* compiled from: AndroidComposeView.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/G;", "it", "", "a", "(LA0/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.q$d$a */
        static final class a extends AbstractC3864v implements Ba.l<A0.G, Boolean> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f23316B = new a();

            a() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(A0.G g10) {
                return Boolean.valueOf(g10.getNodes().q(A0.e0.a(8)));
            }
        }

        d(A0.G g10, C2036q c2036q) {
            this.f23314e = g10;
            this.f23315f = c2036q;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
        @Override // s1.C4421a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(android.view.View r5, t1.t r6) {
            /*
                r4 = this;
                super.g(r5, r6)
                androidx.compose.ui.platform.q r5 = androidx.compose.ui.platform.C2036q.this
                androidx.compose.ui.platform.w r5 = androidx.compose.ui.platform.C2036q.J(r5)
                boolean r5 = r5.p0()
                if (r5 == 0) goto L13
                r5 = 0
                r6.W0(r5)
            L13:
                A0.G r5 = r4.f23314e
                androidx.compose.ui.platform.q$d$a r0 = androidx.compose.ui.platform.C2036q.d.a.f23316B
                A0.G r5 = F0.q.f(r5, r0)
                if (r5 == 0) goto L26
                int r5 = r5.getSemanticsId()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L27
            L26:
                r5 = 0
            L27:
                r0 = -1
                if (r5 == 0) goto L3e
                androidx.compose.ui.platform.q r1 = androidx.compose.ui.platform.C2036q.this
                F0.r r1 = r1.getSemanticsOwner()
                F0.p r1 = r1.a()
                int r1 = r1.getId()
                int r2 = r5.intValue()
                if (r2 != r1) goto L42
            L3e:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            L42:
                androidx.compose.ui.platform.q r1 = r4.f23315f
                int r5 = r5.intValue()
                r6.F0(r1, r5)
                A0.G r5 = r4.f23314e
                int r5 = r5.getSemanticsId()
                androidx.compose.ui.platform.q r1 = androidx.compose.ui.platform.C2036q.this
                androidx.compose.ui.platform.w r1 = androidx.compose.ui.platform.C2036q.J(r1)
                s.z r1 = r1.getIdToBeforeMap()
                int r1 = r1.e(r5, r0)
                if (r1 == r0) goto L89
                androidx.compose.ui.platform.q r2 = androidx.compose.ui.platform.C2036q.this
                androidx.compose.ui.platform.W r2 = r2.getAndroidViewsHandler$ui_release()
                android.view.View r2 = androidx.compose.ui.platform.W0.h(r2, r1)
                if (r2 == 0) goto L71
                r6.T0(r2)
                goto L76
            L71:
                androidx.compose.ui.platform.q r2 = r4.f23315f
                r6.U0(r2, r1)
            L76:
                androidx.compose.ui.platform.q r1 = androidx.compose.ui.platform.C2036q.this
                android.view.accessibility.AccessibilityNodeInfo r2 = r6.X0()
                androidx.compose.ui.platform.q r3 = androidx.compose.ui.platform.C2036q.this
                androidx.compose.ui.platform.w r3 = androidx.compose.ui.platform.C2036q.J(r3)
                java.lang.String r3 = r3.getExtraDataTestTraversalBeforeVal()
                androidx.compose.ui.platform.C2036q.G(r1, r5, r2, r3)
            L89:
                androidx.compose.ui.platform.q r1 = androidx.compose.ui.platform.C2036q.this
                androidx.compose.ui.platform.w r1 = androidx.compose.ui.platform.C2036q.J(r1)
                s.z r1 = r1.getIdToAfterMap()
                int r1 = r1.e(r5, r0)
                if (r1 == r0) goto Lc1
                androidx.compose.ui.platform.q r0 = androidx.compose.ui.platform.C2036q.this
                androidx.compose.ui.platform.W r0 = r0.getAndroidViewsHandler$ui_release()
                android.view.View r0 = androidx.compose.ui.platform.W0.h(r0, r1)
                if (r0 == 0) goto La9
                r6.R0(r0)
                goto Lae
            La9:
                androidx.compose.ui.platform.q r0 = r4.f23315f
                r6.S0(r0, r1)
            Lae:
                androidx.compose.ui.platform.q r0 = androidx.compose.ui.platform.C2036q.this
                android.view.accessibility.AccessibilityNodeInfo r6 = r6.X0()
                androidx.compose.ui.platform.q r1 = androidx.compose.ui.platform.C2036q.this
                androidx.compose.ui.platform.w r1 = androidx.compose.ui.platform.C2036q.J(r1)
                java.lang.String r1 = r1.getExtraDataTestTraversalAfterVal()
                androidx.compose.ui.platform.C2036q.G(r0, r5, r6, r1)
            Lc1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2036q.d.g(android.view.View, t1.t):void");
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$f */
    /* synthetic */ class f extends C3860q implements Ba.a<androidx.compose.ui.platform.coreshims.c> {
        f(Object obj) {
            super(0, obj, L.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        @Override // Ba.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.coreshims.c invoke() {
            return L.g((View) this.receiver);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$g */
    static final class g extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ KeyEvent f23319C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(KeyEvent keyEvent) {
            super(0);
            this.f23319C = keyEvent;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C2036q.super.dispatchKeyEvent(this.f23319C));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$h */
    /* synthetic */ class h extends C3860q implements Ba.q<C3117h, C3482m, Ba.l<? super k0.f, ? extends C4153F>, Boolean> {
        h(Object obj) {
            super(3, obj, C2036q.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public final Boolean c(C3117h c3117h, long j10, Ba.l<? super k0.f, C4153F> lVar) {
            return Boolean.valueOf(((C2036q) this.receiver).R0(c3117h, j10, lVar));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Boolean g(C3117h c3117h, C3482m c3482m, Ba.l<? super k0.f, ? extends C4153F> lVar) {
            return c(c3117h, c3482m.getPackedValue(), lVar);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$i */
    /* synthetic */ class i extends C3860q implements Ba.l<Ba.a<? extends C4153F>, C4153F> {
        i(Object obj) {
            super(1, obj, C2036q.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        public final void c(Ba.a<C4153F> aVar) {
            ((C2036q) this.receiver).k(aVar);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Ba.a<? extends C4153F> aVar) {
            c(aVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$j */
    /* synthetic */ class j extends C3860q implements Ba.p<androidx.compose.ui.focus.b, C3478i, Boolean> {
        j(Object obj) {
            super(2, obj, C2036q.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        }

        @Override // Ba.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(androidx.compose.ui.focus.b bVar, C3478i c3478i) {
            return Boolean.valueOf(((C2036q) this.receiver).C0(bVar, c3478i));
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$k */
    /* synthetic */ class k extends C3860q implements Ba.l<androidx.compose.ui.focus.b, Boolean> {
        k(Object obj) {
            super(1, obj, C2036q.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }

        public final Boolean c(int i10) {
            return Boolean.valueOf(((C2036q) this.receiver).B0(i10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.focus.b bVar) {
            return c(bVar.getValue());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$l */
    /* synthetic */ class l extends C3860q implements Ba.a<C4153F> {
        l(Object obj) {
            super(0, obj, C2036q.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        }

        public final void c() {
            ((C2036q) this.receiver).z0();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            c();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$m */
    /* synthetic */ class m extends C3860q implements Ba.a<C3478i> {
        m(Object obj) {
            super(0, obj, C2036q.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }

        @Override // Ba.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C3478i invoke() {
            return ((C2036q) this.receiver).A0();
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$o */
    static final class o extends AbstractC3864v implements Ba.l<FocusTargetNode, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final o f23320B = new o();

        o() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls0/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$p */
    static final class p extends AbstractC3864v implements Ba.l<C4417b, Boolean> {

        /* compiled from: AndroidComposeView.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.q$p$a */
        static final class a extends AbstractC3864v implements Ba.l<FocusTargetNode, Boolean> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.b f23322B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.b bVar) {
                super(1);
                this.f23322B = bVar;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolK = androidx.compose.ui.focus.m.k(focusTargetNode, this.f23322B.getValue());
                return Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        /* compiled from: AndroidComposeView.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.q$p$b */
        static final class b extends AbstractC3864v implements Ba.l<FocusTargetNode, Boolean> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.b f23323B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.focus.b bVar) {
                super(1);
                this.f23323B = bVar;
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolK = androidx.compose.ui.focus.m.k(focusTargetNode, this.f23323B.getValue());
                return Boolean.valueOf(boolK != null ? boolK.booleanValue() : true);
            }
        }

        p() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            androidx.compose.ui.focus.b bVarL0 = C2036q.this.l0(keyEvent);
            if (bVarL0 == null || !C4418c.e(C4419d.b(keyEvent), C4418c.INSTANCE.a())) {
                return Boolean.FALSE;
            }
            C3478i c3478iA0 = C2036q.this.A0();
            Boolean boolG = C2036q.this.getFocusOwner().g(bVarL0.getValue(), c3478iA0, new b(bVarL0));
            if (boolG != null ? boolG.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.f.a(bVarL0.getValue())) {
                return Boolean.FALSE;
            }
            Integer numC = androidx.compose.ui.focus.d.c(bVarL0.getValue());
            if (numC == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            Rect rectB = c3478iA0 != null ? i0.X0.b(c3478iA0) : null;
            if (rectB == null) {
                throw new IllegalStateException("Invalid rect");
            }
            View viewJ0 = C2036q.this.j0(iIntValue);
            if (C3862t.b(viewJ0, C2036q.this)) {
                viewJ0 = null;
            }
            if (viewJ0 != null && androidx.compose.ui.focus.d.b(viewJ0, Integer.valueOf(iIntValue), rectB)) {
                return Boolean.TRUE;
            }
            if (!C2036q.this.getFocusOwner().d(false, true, false, bVarL0.getValue())) {
                return Boolean.TRUE;
            }
            Boolean boolG2 = C2036q.this.getFocusOwner().g(bVarL0.getValue(), null, new a(bVarL0));
            return Boolean.valueOf(boolG2 != null ? boolG2.booleanValue() : true);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Boolean invoke(C4417b c4417b) {
            return a(c4417b.getNativeKeyEvent());
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/q$q", "Lu0/w;", "Lu0/u;", "value", "Loa/F;", "a", "(Lu0/u;)V", "Lu0/u;", "currentIcon", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$q, reason: collision with other inner class name */
    public static final class C0329q implements InterfaceC4657w {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private InterfaceC4655u currentIcon = InterfaceC4655u.INSTANCE.a();

        C0329q() {
        }

        @Override // u0.InterfaceC4657w
        public void a(InterfaceC4655u value) {
            if (value == null) {
                value = InterfaceC4655u.INSTANCE.a();
            }
            this.currentIcon = value;
            J.f22918a.a(C2036q.this, value);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$r */
    static final class r extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f23327C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(androidx.compose.ui.viewinterop.c cVar) {
            super(0);
            this.f23327C = cVar;
        }

        public final void a() {
            C2036q.this.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f23327C);
            HashMap<A0.G, androidx.compose.ui.viewinterop.c> layoutNodeToHolder = C2036q.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            kotlin.jvm.internal.W.d(layoutNodeToHolder).remove(C2036q.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f23327C));
            this.f23327C.setImportantForAccessibility(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$s */
    static final class s extends AbstractC3864v implements Ba.l<FocusTargetNode, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f23328B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(int i10) {
            super(1);
            this.f23328B = i10;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean boolK = androidx.compose.ui.focus.m.k(focusTargetNode, this.f23328B);
            return Boolean.valueOf(boolK != null ? boolK.booleanValue() : false);
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$t */
    static final class t extends AbstractC3864v implements Ba.a<C4153F> {
        t() {
            super(0);
        }

        public final void a() {
            MotionEvent motionEvent = C2036q.this.previousMotionEvent;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    C2036q.this.relayoutTime = SystemClock.uptimeMillis();
                    C2036q c2036q = C2036q.this;
                    c2036q.post(c2036q.resendMotionEventRunnable);
                }
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/q$u", "Ljava/lang/Runnable;", "Loa/F;", "run", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.q$u */
    public static final class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2036q.this.removeCallbacks(this);
            MotionEvent motionEvent = C2036q.this.previousMotionEvent;
            if (motionEvent != null) {
                boolean z10 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z10) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i10 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i10 = 2;
                }
                C2036q c2036q = C2036q.this;
                c2036q.P0(motionEvent, i10, c2036q.relayoutTime, false);
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw0/b;", "it", "", "a", "(Lw0/b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$v */
    static final class v extends AbstractC3864v implements Ba.l<RotaryScrollEvent, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final v f23331B = new v();

        v() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "command", "b", "(LBa/a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$w */
    static final class w extends AbstractC3864v implements Ba.l<Ba.a<? extends C4153F>, C4153F> {
        w() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Ba.a aVar) {
            aVar.invoke();
        }

        public final void b(final Ba.a<C4153F> aVar) {
            Handler handler = C2036q.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = C2036q.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: androidx.compose.ui.platform.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2036q.w.c(aVar);
                    }
                });
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Ba.a<? extends C4153F> aVar) {
            b(aVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/q$b;", "a", "()Landroidx/compose/ui/platform/q$b;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$x */
    static final class x extends AbstractC3864v implements Ba.a<b> {
        x() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return C2036q.this.get_viewTreeOwners();
        }
    }

    public C2036q(Context context, ta.g gVar) {
        super(context);
        C3476g.Companion companion = C3476g.INSTANCE;
        this.lastDownPointerPosition = companion.b();
        this.superclassInitComplete = true;
        byte b10 = 0;
        byte b11 = 0;
        this.sharedDrawScope = new A0.I(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        this.density = kotlin.m1.g(U0.a.a(context), kotlin.m1.l());
        F0.f fVar = new F0.f();
        this.rootSemanticsNode = fVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(fVar);
        this.semanticsModifier = emptySemanticsElement;
        this.focusOwner = new FocusOwnerImpl(new i(this), new j(this), new k(this), new l(this), new m(this), new kotlin.jvm.internal.y(this) { // from class: androidx.compose.ui.platform.q.n
            @Override // Ia.n
            public Object get() {
                return ((C2036q) this.receiver).getLayoutDirection();
            }
        });
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new h(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.coroutineContext = gVar;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new r1();
        i.Companion companion2 = b0.i.INSTANCE;
        b0.i iVarA = androidx.compose.ui.input.key.a.a(companion2, new p());
        this.keyInputModifier = iVarA;
        b0.i iVarA2 = androidx.compose.ui.input.rotary.a.a(companion2, v.f23331B);
        this.rotaryInputModifier = iVarA2;
        this.canvasHolder = new C3588m0();
        A0.G g10 = new A0.G(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        g10.f(y0.d0.f53020b);
        g10.c(getDensity());
        g10.e(companion2.e(emptySemanticsElement).e(iVarA2).e(iVarA).e(getFocusOwner().getModifier()).e(dragAndDropModifierOnDragListener.getModifier()));
        this.root = g10;
        this.rootForTest = this;
        this.semanticsOwner = new F0.r(getRoot(), fVar);
        C2047w c2047w = new C2047w(this);
        this.composeAccessibilityDelegate = c2047w;
        this.contentCaptureManager = new ViewOnAttachStateChangeListenerC3012b(this, new f(this));
        this.accessibilityManager = new C2022j(context);
        this.graphicsContext = C3550M.a(this);
        this.autofillTree = new c0.i();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new C4642h();
        this.pointerInputEventProcessor = new C4618D(getRoot());
        this.configurationChangeObserver = e.f23317B;
        this._autofill = b0() ? new C2305a(this, getAutofillTree()) : null;
        this.clipboardManager = new C2024k(context);
        this.snapshotObserver = new A0.o0(new w());
        this.measureAndLayoutDelegate = new A0.S(getRoot());
        this.viewConfiguration = new V(ViewConfiguration.get(context));
        this.globalPosition = U0.o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] fArrC = i0.L0.c(null, 1, null);
        this.tmpMatrix = fArrC;
        this.viewToWindowMatrix = i0.L0.c(null, 1, null);
        this.windowToViewMatrix = i0.L0.c(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.a();
        this.isRenderNodeCompatible = true;
        this._viewTreeOwners = kotlin.r1.c(null, null, 2, null);
        this.viewTreeOwners = kotlin.m1.d(new x());
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.m
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C2036q.n0(this.f23190B);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.n
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C2036q.M0(this.f23213a);
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.o
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                C2036q.S0(this.f23216B, z10);
            }
        };
        M0.H h10 = new M0.H(getView(), this);
        this.legacyTextInputServiceAndroid = h10;
        this.textInputService = new M0.G(L.h().invoke(h10));
        this.textInputSessionMutex = b0.o.a();
        this.softwareKeyboardController = new C2015f0(getTextInputService());
        this.fontLoader = new N(context);
        this.fontFamilyResolver = kotlin.m1.g(C1345p.a(context), kotlin.m1.l());
        this.currentFontWeightAdjustment = m0(context.getResources().getConfiguration());
        U0.t tVarE = androidx.compose.ui.focus.d.e(context.getResources().getConfiguration().getLayoutDirection());
        this.layoutDirection = kotlin.r1.c(tVarE == null ? U0.t.Ltr : tVarE, null, 2, null);
        this.hapticFeedBack = new C4259b(this);
        this._inputModeManager = new C4333c(isInTouchMode() ? C4331a.INSTANCE.b() : C4331a.INSTANCE.a(), new c(), b11 == true ? 1 : 0);
        this.modifierLocalManager = new z0.f(this);
        this.textToolbar = new P(this);
        this.layerCache = new p1<>();
        this.endApplyChangesListeners = new Q.b<>(new Ba.a[16], 0);
        this.resendMotionEventRunnable = new u();
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.p
            @Override // java.lang.Runnable
            public final void run() {
                C2036q.N0(this.f23222B);
            }
        };
        this.resendMotionEventOnLayout = new t();
        int i10 = Build.VERSION.SDK_INT;
        this.matrixToWindow = i10 < 29 ? new Z(fArrC, b10 == true ? 1 : 0) : new C2007b0();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        K.f22919a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        s1.X.n0(this, c2047w);
        Ba.l<o1, C4153F> lVarA = o1.INSTANCE.a();
        if (lVarA != null) {
            lVarA.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().u(this);
        if (i10 >= 29) {
            C.f22904a.a(this);
        }
        this.scrollCapture = i10 >= 31 ? new E0.l() : null;
        this.pointerIconService = new C0329q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3478i A0() {
        if (isFocused()) {
            return getFocusOwner().h();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return androidx.compose.ui.focus.d.a(viewFindFocus);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B0(int focusDirection) {
        b.Companion companion = androidx.compose.ui.focus.b.INSTANCE;
        if (androidx.compose.ui.focus.b.l(focusDirection, companion.b()) || androidx.compose.ui.focus.b.l(focusDirection, companion.c())) {
            return false;
        }
        Integer numC = androidx.compose.ui.focus.d.c(focusDirection);
        if (numC == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int iIntValue = numC.intValue();
        C3478i c3478iA0 = A0();
        Rect rectB = c3478iA0 != null ? i0.X0.b(c3478iA0) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = rectB == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, rectB, iIntValue);
        if (viewFindNextFocus != null) {
            return androidx.compose.ui.focus.d.b(viewFindNextFocus, Integer.valueOf(iIntValue), rectB);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C0(androidx.compose.ui.focus.b focusDirection, C3478i previouslyFocusedRect) {
        Integer numC;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numC = androidx.compose.ui.focus.d.c(focusDirection.getValue())) == null) ? 130 : numC.intValue(), previouslyFocusedRect != null ? i0.X0.b(previouslyFocusedRect) : null);
    }

    private final long D0(int a10, int b10) {
        return C4148A.j(C4148A.j(b10) | C4148A.j(C4148A.j(a10) << 32));
    }

    private final void E0() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            G0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = C3477h.a(f10 - iArr2[0], f11 - iArr2[1]);
        }
    }

    private final void F0(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        G0();
        long jF = i0.L0.f(this.viewToWindowMatrix, C3477h.a(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = C3477h.a(motionEvent.getRawX() - C3476g.m(jF), motionEvent.getRawY() - C3476g.n(jF));
    }

    private final void G0() {
        this.matrixToWindow.a(this, this.viewToWindowMatrix);
        C2044u0.a(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void K0(A0.G nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.g0() == G.g.InMeasureBlock && e0(nodeToRemeasure)) {
                nodeToRemeasure = nodeToRemeasure.o0();
            }
            if (nodeToRemeasure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void L0(C2036q c2036q, A0.G g10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = null;
        }
        c2036q.K0(g10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(C2036q c2036q) {
        c2036q.T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(C2036q c2036q) {
        c2036q.hoverExitReceived = false;
        MotionEvent motionEvent = c2036q.previousMotionEvent;
        C3862t.d(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        c2036q.O0(motionEvent);
    }

    private final int O0(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.a(C4626L.b(motionEvent.getMetaState()));
        }
        C4616B c4616bC = this.motionEventAdapter.c(motionEvent, this);
        if (c4616bC == null) {
            this.pointerInputEventProcessor.c();
            return C4619E.a(false, false);
        }
        List<PointerInputEventData> listB = c4616bC.b();
        int size = listB.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                pointerInputEventData = listB.get(size);
                if (pointerInputEventData.getDown()) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            pointerInputEventData = null;
        } else {
            pointerInputEventData = null;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.getPosition();
        }
        int iB = this.pointerInputEventProcessor.b(c4616bC, this, w0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || C4629O.c(iB)) {
            return iB;
        }
        this.motionEventAdapter.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerPropertiesArr[i10] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = ((actionIndex < 0 || i12 < actionIndex) ? 0 : 1) + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            long jQ = q(C3477h.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C3476g.m(jQ);
            pointerCoords.y = C3476g.n(jQ);
            i12++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C4616B c4616bC = this.motionEventAdapter.c(motionEventObtain, this);
        C3862t.d(c4616bC);
        this.pointerInputEventProcessor.b(c4616bC, this, true);
        motionEventObtain.recycle();
    }

    static /* synthetic */ void Q0(C2036q c2036q, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        c2036q.P0(motionEvent, i10, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R0(C3117h transferData, long decorationSize, Ba.l<? super k0.f, C4153F> drawDragDecoration) {
        Resources resources = getContext().getResources();
        return D.f22909a.a(this, transferData, new C3110a(U0.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), decorationSize, drawDragDecoration, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(C2036q c2036q, boolean z10) {
        c2036q._inputModeManager.b(z10 ? C4331a.INSTANCE.b() : C4331a.INSTANCE.a());
    }

    private final void T0() {
        getLocationOnScreen(this.tmpPositionArray);
        long j10 = this.globalPosition;
        int iH = U0.n.h(j10);
        int i10 = U0.n.i(j10);
        int[] iArr = this.tmpPositionArray;
        boolean z10 = false;
        int i11 = iArr[0];
        if (iH != i11 || i10 != iArr[1]) {
            this.globalPosition = U0.o.a(i11, iArr[1]);
            if (iH != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate().getMeasurePassDelegate().G1();
                z10 = true;
            }
        }
        this.measureAndLayoutDelegate.c(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey) {
        int iE;
        if (C3862t.b(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal())) {
            int iE2 = this.composeAccessibilityDelegate.getIdToBeforeMap().e(virtualViewId, -1);
            if (iE2 != -1) {
                info.getExtras().putInt(extraDataKey, iE2);
                return;
            }
            return;
        }
        if (!C3862t.b(extraDataKey, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal()) || (iE = this.composeAccessibilityDelegate.getIdToAfterMap().e(virtualViewId, -1)) == -1) {
            return;
        }
        info.getExtras().putInt(extraDataKey, iE);
    }

    private final boolean b0() {
        return true;
    }

    private final boolean e0(A0.G g10) {
        A0.G gO0;
        return this.wasMeasuredWithMultipleConstraints || !((gO0 = g10.o0()) == null || gO0.N());
    }

    private final void f0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof C2036q) {
                ((C2036q) childAt).v();
            } else if (childAt instanceof ViewGroup) {
                f0((ViewGroup) childAt);
            }
        }
    }

    private final long g0(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return D0(0, size);
        }
        if (mode == 0) {
            return D0(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return D0(size, size);
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final b get_viewTreeOwners() {
        return (b) this._viewTreeOwners.getValue();
    }

    private final void h0() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View j0(int direction) {
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            C3862t.e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, direction);
            if (viewFindNextFocus != null && !L.e(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    private final View k0(int accessibilityId, View currentView) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (C3862t.b(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View viewK0 = k0(accessibilityId, viewGroup.getChildAt(i10));
                    if (viewK0 != null) {
                        return viewK0;
                    }
                }
            }
        }
        return null;
    }

    private final int m0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(C2036q c2036q) {
        c2036q.T0();
    }

    private final int o0(MotionEvent motionEvent) {
        int i10;
        int i11;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            F0(motionEvent);
            this.forceUseMatrixCache = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z10 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 == null || !q0(motionEvent, motionEvent2)) {
                    i10 = 10;
                } else {
                    if (v0(motionEvent2)) {
                        this.pointerInputEventProcessor.c();
                    } else if (motionEvent2.getActionMasked() != 10 && z10) {
                        i10 = 10;
                        Q0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                    i10 = 10;
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (z10 || !z11 || actionMasked == 3 || actionMasked == 9 || !w0(motionEvent)) {
                    i11 = 9;
                } else {
                    i11 = 9;
                    Q0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.previousMotionEvent;
                if (motionEvent3 != null && motionEvent3.getAction() == i10) {
                    MotionEvent motionEvent4 = this.previousMotionEvent;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i11 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.motionEventAdapter.e(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.previousMotionEvent;
                        float x10 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.previousMotionEvent;
                        boolean z12 = (x10 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.previousMotionEvent;
                        boolean z13 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z12 || z13) {
                            if (pointerId >= 0) {
                                this.motionEventAdapter.e(pointerId);
                            }
                            this.pointerInputEventProcessor.a();
                        }
                    }
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int iO0 = O0(motionEvent);
                Trace.endSection();
                return iO0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean p0(MotionEvent event) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -event.getAxisValue(26);
        return getFocusOwner().i(new RotaryScrollEvent(f10 * C4422a0.h(viewConfiguration, getContext()), f10 * C4422a0.e(viewConfiguration, getContext()), event.getEventTime(), event.getDeviceId()));
    }

    private final boolean q0(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final void s0(A0.G node) {
        node.E0();
        Q.b<A0.G> bVarW0 = node.w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            A0.G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                s0(gArrT[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    private void setDensity(U0.d dVar) {
        this.density.setValue(dVar);
    }

    private void setFontFamilyResolver(AbstractC1341l.b bVar) {
        this.fontFamilyResolver.setValue(bVar);
    }

    private void setLayoutDirection(U0.t tVar) {
        this.layoutDirection.setValue(tVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this._viewTreeOwners.setValue(bVar);
    }

    private final void t0(A0.G node) {
        int i10 = 0;
        A0.S.H(this.measureAndLayoutDelegate, node, false, 2, null);
        Q.b<A0.G> bVarW0 = node.w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            A0.G[] gArrT = bVarW0.t();
            do {
                t0(gArrT[i10]);
                i10++;
            } while (i10 < size);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[LOOP:0: B:22:0x004c->B:39:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085 A[EDGE_INSN: B:41:0x0085->B:40:0x0085 BREAK  A[LOOP:0: B:22:0x004c->B:39:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean u0(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r7.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            androidx.compose.ui.platform.y0 r0 = androidx.compose.ui.platform.C2052y0.f23488a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C2036q.u0(android.view.MotionEvent):boolean");
    }

    private final boolean v0(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean w0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    private final boolean x0(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && motionEvent.getPointerCount() == event.getPointerCount() && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    @Override // A0.m0
    public void A(A0.G layoutNode, long constraints) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.s(layoutNode, constraints);
            if (!this.measureAndLayoutDelegate.m()) {
                A0.S.d(this.measureAndLayoutDelegate, false, 1, null);
                h0();
            }
            C4153F c4153f = C4153F.f46609a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean H0(A0.l0 layer) {
        if (this.viewLayersContainer != null) {
            j1.INSTANCE.b();
        }
        this.layerCache.c(layer);
        return true;
    }

    public final void I0(androidx.compose.ui.viewinterop.c view) {
        k(new r(view));
    }

    public final void J0() {
        this.observationClearRequested = true;
    }

    public final void Z(androidx.compose.ui.viewinterop.c view, A0.G layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        view.setImportantForAccessibility(1);
        s1.X.n0(view, new d(layoutNode, this));
    }

    @Override // A0.m0
    public void a(boolean sendPointerUpdate) {
        Ba.a<C4153F> aVar;
        if (this.measureAndLayoutDelegate.m() || this.measureAndLayoutDelegate.n()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (sendPointerUpdate) {
                try {
                    aVar = this.resendMotionEventOnLayout;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                aVar = null;
            }
            if (this.measureAndLayoutDelegate.r(aVar)) {
                requestLayout();
            }
            A0.S.d(this.measureAndLayoutDelegate, false, 1, null);
            h0();
            C4153F c4153f = C4153F.f46609a;
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        addView(child, -1);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> values) {
        C2305a c2305a;
        if (!b0() || (c2305a = this._autofill) == null) {
            return;
        }
        c0.c.a(c2305a, values);
    }

    @Override // A0.m0
    public void c(A0.G layoutNode) {
        this.composeAccessibilityDelegate.t0(layoutNode);
        this.contentCaptureManager.u(layoutNode);
    }

    public final Object c0(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objM = this.composeAccessibilityDelegate.M(interfaceC4588d);
        return objM == C4696b.e() ? objM : C4153F.f46609a;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.composeAccessibilityDelegate.N(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.composeAccessibilityDelegate.N(true, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.InterfaceC2097e
    public void d(InterfaceC2114v owner) {
        setShowLayoutBounds(INSTANCE.b());
    }

    public final Object d0(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objB = this.contentCaptureManager.b(interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            s0(getRoot());
        }
        A0.m0.y(this, false, 1, null);
        androidx.compose.runtime.snapshots.g.INSTANCE.n();
        this.isDrawingContent = true;
        C3588m0 c3588m0 = this.canvasHolder;
        Canvas canvasV = c3588m0.getAndroidCanvas().getInternalCanvas();
        c3588m0.getAndroidCanvas().w(canvas);
        getRoot().B(c3588m0.getAndroidCanvas(), null);
        c3588m0.getAndroidCanvas().w(canvasV);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.dirtyLayers.get(i10).j();
            }
        }
        if (j1.INSTANCE.b()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<A0.l0> list = this.postponedDirtyLayers;
        if (list != null) {
            C3862t.d(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        return motionEvent.getActionMasked() == 8 ? (u0(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : motionEvent.isFromSource(4194304) ? p0(motionEvent) : C4629O.c(o0(motionEvent)) : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (u0(event) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.V(event);
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && w0(event)) {
                if (event.getToolType(0) == 3 && event.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent = this.previousMotionEvent;
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                this.hoverExitReceived = true;
                postDelayed(this.sendHoverExitEvent, 8L);
                return false;
            }
        } else if (!x0(event)) {
            return false;
        }
        return C4629O.c(o0(event));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (!isFocused()) {
            return getFocusOwner().m(C4417b.b(event), new g(event));
        }
        this._windowInfo.a(C4626L.b(event.getMetaState()));
        return g0.i.c(getFocusOwner(), C4417b.b(event), null, 2, null) || super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent event) {
        return (isFocused() && getFocusOwner().k(C4417b.b(event))) || super.dispatchKeyEventPreIme(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        if (Build.VERSION.SDK_INT < 28) {
            A.f22876a.a(structure, getView());
        } else {
            super.dispatchProvideStructure(structure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            C3862t.d(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || q0(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (u0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !x0(motionEvent)) {
            return false;
        }
        int iO0 = o0(motionEvent);
        if (C4629O.b(iO0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return C4629O.c(iO0);
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View viewK0 = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                if (objInvoke instanceof View) {
                    viewK0 = (View) objInvoke;
                }
            } else {
                viewK0 = k0(accessibilityId, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewK0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View focused, int direction) {
        if (focused != null) {
            C3478i c3478iA = androidx.compose.ui.focus.d.a(focused);
            androidx.compose.ui.focus.b bVarD = androidx.compose.ui.focus.d.d(direction);
            if (C3862t.b(getFocusOwner().g(bVarD != null ? bVarD.getValue() : androidx.compose.ui.focus.b.INSTANCE.a(), c3478iA, o.f23320B), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(focused, direction);
    }

    @Override // A0.m0
    public void g(A0.G layoutNode, boolean affectsLookahead) {
        this.measureAndLayoutDelegate.i(layoutNode, affectsLookahead);
    }

    public final W getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            W w10 = new W(getContext());
            this._androidViewsHandler = w10;
            addView(w10);
            requestLayout();
        }
        W w11 = this._androidViewsHandler;
        C3862t.d(w11);
        return w11;
    }

    @Override // A0.m0
    public c0.d getAutofill() {
        return this._autofill;
    }

    @Override // A0.m0
    public c0.i getAutofillTree() {
        return this.autofillTree;
    }

    public final Ba.l<Configuration, C4153F> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    /* renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final ViewOnAttachStateChangeListenerC3012b getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // A0.m0
    public ta.g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // A0.m0
    public U0.d getDensity() {
        return (U0.d) this.density.getValue();
    }

    @Override // A0.m0
    public InterfaceC3112c getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // A0.m0
    public g0.i getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        C4153F c4153f;
        C3478i c3478iA0 = A0();
        if (c3478iA0 != null) {
            rect.left = Math.round(c3478iA0.getLeft());
            rect.top = Math.round(c3478iA0.getTop());
            rect.right = Math.round(c3478iA0.getRight());
            rect.bottom = Math.round(c3478iA0.getBottom());
            c4153f = C4153F.f46609a;
        } else {
            c4153f = null;
        }
        if (c4153f == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // A0.m0
    public AbstractC1341l.b getFontFamilyResolver() {
        return (AbstractC1341l.b) this.fontFamilyResolver.getValue();
    }

    @Override // A0.m0
    public InterfaceC1340k.b getFontLoader() {
        return this.fontLoader;
    }

    @Override // A0.m0
    public i0.F0 getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // A0.m0
    public InterfaceC4258a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.m();
    }

    @Override // A0.m0
    public InterfaceC4332b getInputModeManager() {
        return this._inputModeManager;
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, A0.m0
    public U0.t getLayoutDirection() {
        return (U0.t) this.layoutDirection.getValue();
    }

    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.q();
    }

    @Override // A0.m0
    public z0.f getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // A0.m0
    public Z.a getPlacementScope() {
        return y0.a0.b(this);
    }

    @Override // A0.m0
    public InterfaceC4657w getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // A0.m0
    public A0.G getRoot() {
        return this.root;
    }

    public A0.u0 getRootForTest() {
        return this.rootForTest;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        E0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.scrollCapture) == null) {
            return false;
        }
        return lVar.c();
    }

    public F0.r getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // A0.m0
    public A0.I getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // A0.m0
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // A0.m0
    public A0.o0 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // A0.m0
    public Y0 getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // A0.m0
    public M0.G getTextInputService() {
        return this.textInputService;
    }

    @Override // A0.m0
    public Z0 getTextToolbar() {
        return this.textToolbar;
    }

    @Override // A0.m0
    public i1 getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final b getViewTreeOwners() {
        return (b) this.viewTreeOwners.getValue();
    }

    @Override // A0.m0
    public q1 getWindowInfo() {
        return this._windowInfo;
    }

    @Override // A0.m0
    public long h(long localPosition) {
        E0();
        return i0.L0.f(this.viewToWindowMatrix, localPosition);
    }

    @Override // A0.m0
    public void i(A0.G layoutNode) {
        this.measureAndLayoutDelegate.E(layoutNode);
        L0(this, null, 1, null);
    }

    public final void i0(androidx.compose.ui.viewinterop.c view, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(view, canvas);
    }

    @Override // A0.m0
    public void k(Ba.a<C4153F> listener) {
        if (this.endApplyChangesListeners.m(listener)) {
            return;
        }
        this.endApplyChangesListeners.c(listener);
    }

    @Override // A0.m0
    public void l(A0.G node) {
        this.measureAndLayoutDelegate.v(node);
        J0();
    }

    public androidx.compose.ui.focus.b l0(KeyEvent keyEvent) {
        long jA = C4419d.a(keyEvent);
        C4416a.Companion companion = C4416a.INSTANCE;
        if (C4416a.p(jA, companion.l())) {
            return androidx.compose.ui.focus.b.i(C4419d.d(keyEvent) ? androidx.compose.ui.focus.b.INSTANCE.f() : androidx.compose.ui.focus.b.INSTANCE.e());
        }
        if (C4416a.p(jA, companion.e())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.INSTANCE.g());
        }
        if (C4416a.p(jA, companion.d())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.INSTANCE.d());
        }
        if (C4416a.p(jA, companion.f()) ? true : C4416a.p(jA, companion.k())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.INSTANCE.h());
        }
        if (C4416a.p(jA, companion.c()) ? true : C4416a.p(jA, companion.j())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.INSTANCE.a());
        }
        if (C4416a.p(jA, companion.b()) ? true : C4416a.p(jA, companion.g()) ? true : C4416a.p(jA, companion.i())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.INSTANCE.b());
        }
        if (C4416a.p(jA, companion.a()) ? true : C4416a.p(jA, companion.h())) {
            return androidx.compose.ui.focus.b.i(androidx.compose.ui.focus.b.INSTANCE.c());
        }
        return null;
    }

    @Override // A0.m0
    public void m(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // A0.m0
    public void n(A0.G layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.D(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
                K0(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.G(layoutNode, forceRequest) && scheduleMeasureAndLayout) {
            K0(layoutNode);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        InterfaceC2114v lifecycleOwner;
        AbstractC2106m lifecycle;
        InterfaceC2114v lifecycleOwner2;
        C2305a c2305a;
        super.onAttachedToWindow();
        this._windowInfo.b(hasWindowFocus());
        t0(getRoot());
        s0(getRoot());
        getSnapshotObserver().k();
        if (b0() && (c2305a = this._autofill) != null) {
            c0.g.f30825a.a(c2305a);
        }
        InterfaceC2114v interfaceC2114vA = android.view.View.a(this);
        InterfaceC4549f interfaceC4549fA = C4550g.a(this);
        b viewTreeOwners = getViewTreeOwners();
        AbstractC2106m lifecycle2 = null;
        if (viewTreeOwners == null || (interfaceC2114vA != null && interfaceC4549fA != null && (interfaceC2114vA != viewTreeOwners.getLifecycleOwner() || interfaceC4549fA != viewTreeOwners.getLifecycleOwner()))) {
            if (interfaceC2114vA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC4549fA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            interfaceC2114vA.getLifecycle().a(this);
            b bVar = new b(interfaceC2114vA, interfaceC4549fA);
            set_viewTreeOwners(bVar);
            Ba.l<? super b, C4153F> lVar = this.onViewTreeOwnersAvailable;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.b(isInTouchMode() ? C4331a.INSTANCE.b() : C4331a.INSTANCE.a());
        b viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (lifecycleOwner2 = viewTreeOwners2.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 == null) {
            C5047a.c("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle2.a(this);
        lifecycle2.a(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            I.f22917a.b(this);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        O o10 = (O) b0.o.c(this.textInputSessionMutex);
        return o10 == null ? this.legacyTextInputServiceAndroid.getEditorHasFocus() : o10.b();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setDensity(U0.a.a(getContext()));
        if (m0(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = m0(newConfig);
            setFontFamilyResolver(C1345p.a(getContext()));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        O o10 = (O) b0.o.c(this.textInputSessionMutex);
        return o10 == null ? this.legacyTextInputServiceAndroid.f(outAttrs) : o10.a(outAttrs);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        this.contentCaptureManager.s(virtualIds, supportedFormats, requestsCollector);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C2305a c2305a;
        InterfaceC2114v lifecycleOwner;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        b viewTreeOwners = getViewTreeOwners();
        AbstractC2106m lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null) ? null : lifecycleOwner.getLifecycle();
        if (lifecycle == null) {
            C5047a.c("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle.d(this.contentCaptureManager);
        lifecycle.d(this);
        if (b0() && (c2305a = this._autofill) != null) {
            c0.g.f30825a.b(c2305a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            I.f22917a.a(this);
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (gainFocus || hasFocus()) {
            return;
        }
        getFocusOwner().l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        this.measureAndLayoutDelegate.r(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        T0();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, r10 - l10, b10 - t10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                t0(getRoot());
            }
            long jG0 = g0(widthMeasureSpec);
            int iJ = (int) C4148A.j(jG0 >>> 32);
            int iJ2 = (int) C4148A.j(jG0 & 4294967295L);
            long jG02 = g0(heightMeasureSpec);
            long jA = U0.b.INSTANCE.a(iJ, iJ2, (int) C4148A.j(jG02 >>> 32), (int) C4148A.j(4294967295L & jG02));
            U0.b bVar = this.onMeasureConstraints;
            boolean zF = false;
            if (bVar == null) {
                this.onMeasureConstraints = U0.b.a(jA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (bVar != null) {
                    zF = U0.b.f(bVar.getValue(), jA);
                }
                if (!zF) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.I(jA);
            this.measureAndLayoutDelegate.t();
            setMeasuredDimension(getRoot().t0(), getRoot().O());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().t0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().O(), 1073741824));
            }
            C4153F c4153f = C4153F.f46609a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        C2305a c2305a;
        if (!b0() || structure == null || (c2305a = this._autofill) == null) {
            return;
        }
        c0.c.b(c2305a, structure);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        if (this.superclassInitComplete) {
            U0.t tVarE = androidx.compose.ui.focus.d.e(layoutDirection);
            if (tVarE == null) {
                tVarE = U0.t.Ltr;
            }
            setLayoutDirection(tVarE);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(Rect localVisibleRect, Point windowOffset, Consumer<ScrollCaptureTarget> targets) {
        E0.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.scrollCapture) == null) {
            return;
        }
        lVar.d(this, getSemanticsOwner(), getCoroutineContext(), targets);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> response) {
        ViewOnAttachStateChangeListenerC3012b viewOnAttachStateChangeListenerC3012b = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC3012b.x(viewOnAttachStateChangeListenerC3012b, response);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean zB;
        this._windowInfo.b(hasWindowFocus);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || getShowLayoutBounds() == (zB = INSTANCE.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        r0();
    }

    @Override // A0.m0
    public void p(m0.b listener) {
        this.measureAndLayoutDelegate.x(listener);
        L0(this, null, 1, null);
    }

    @Override // u0.InterfaceC4628N
    public long q(long localPosition) {
        E0();
        long jF = i0.L0.f(this.viewToWindowMatrix, localPosition);
        return C3477h.a(C3476g.m(jF) + C3476g.m(this.windowPosition), C3476g.n(jF) + C3476g.n(this.windowPosition));
    }

    @Override // u0.InterfaceC4628N
    public void r(float[] localTransform) {
        E0();
        i0.L0.n(localTransform, this.viewToWindowMatrix);
        L.j(localTransform, C3476g.m(this.windowPosition), C3476g.n(this.windowPosition), this.tmpMatrix);
    }

    public void r0() {
        s0(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().e().c()) {
            return super.requestFocus(direction, previouslyFocusedRect);
        }
        androidx.compose.ui.focus.b bVarD = androidx.compose.ui.focus.d.d(direction);
        int value = bVarD != null ? bVarD.getValue() : androidx.compose.ui.focus.b.INSTANCE.b();
        Boolean boolG = getFocusOwner().g(value, previouslyFocusedRect != null ? i0.X0.e(previouslyFocusedRect) : null, new s(value));
        if (boolG != null) {
            return boolG.booleanValue();
        }
        return false;
    }

    @Override // A0.m0
    public A0.l0 s(Ba.p<? super InterfaceC3586l0, ? super C3870c, C4153F> drawBlock, Ba.a<C4153F> invalidateParentLayer, C3870c explicitLayer) {
        if (explicitLayer != null) {
            return new C2029m0(explicitLayer, null, this, drawBlock, invalidateParentLayer);
        }
        A0.l0 l0VarB = this.layerCache.b();
        if (l0VarB != null) {
            l0VarB.c(drawBlock, invalidateParentLayer);
            return l0VarB;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new C2029m0(getGraphicsContext().b(), getGraphicsContext(), this, drawBlock, invalidateParentLayer);
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new Q0(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            j1.Companion companion = j1.INSTANCE;
            if (!companion.a()) {
                companion.d(new View(getContext()));
            }
            C2025k0 c2025k0 = companion.b() ? new C2025k0(getContext()) : new k1(getContext());
            this.viewLayersContainer = c2025k0;
            addView(c2025k0);
        }
        C2025k0 c2025k02 = this.viewLayersContainer;
        C3862t.d(c2025k02);
        return new j1(this, c2025k02, drawBlock, invalidateParentLayer);
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.composeAccessibilityDelegate.S0(intervalMillis);
    }

    public final void setConfigurationChangeObserver(Ba.l<? super Configuration, C4153F> lVar) {
        this.configurationChangeObserver = lVar;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC3012b viewOnAttachStateChangeListenerC3012b) {
        this.contentCaptureManager = viewOnAttachStateChangeListenerC3012b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [b0.i$c] */
    public void setCoroutineContext(ta.g gVar) {
        this.coroutineContext = gVar;
        InterfaceC0831j head = getRoot().getNodes().getHead();
        if (head instanceof InterfaceC4633T) {
            ((InterfaceC4633T) head).F1();
        }
        int iA = A0.e0.a(16);
        if (!head.getNode().getIsAttached()) {
            C5047a.b("visitSubtree called on an unattached node");
        }
        i.c child = head.getNode().getChild();
        A0.G gK = C0832k.k(head);
        A0.Z z10 = new A0.Z();
        while (gK != null) {
            if (child == null) {
                child = gK.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & iA) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = child;
                        Q.b bVar = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof A0.s0) {
                                A0.s0 s0Var = (A0.s0) abstractC0834mG;
                                if (s0Var instanceof InterfaceC4633T) {
                                    ((InterfaceC4633T) s0Var).F1();
                                }
                            } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                i.c cVarK2 = abstractC0834mG.getDelegate();
                                int i10 = 0;
                                abstractC0834mG = abstractC0834mG;
                                while (cVarK2 != null) {
                                    if ((cVarK2.getKindSet() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            abstractC0834mG = cVarK2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new Q.b(new i.c[16], 0);
                                            }
                                            if (abstractC0834mG != 0) {
                                                bVar.c(abstractC0834mG);
                                                abstractC0834mG = 0;
                                            }
                                            bVar.c(cVarK2);
                                        }
                                    }
                                    cVarK2 = cVarK2.getChild();
                                    abstractC0834mG = abstractC0834mG;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC0834mG = C0832k.g(bVar);
                        }
                    }
                    child = child.getChild();
                }
            }
            z10.c(gK.w0());
            gK = z10.a() ? (A0.G) z10.b() : null;
            child = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.lastMatrixRecalculationAnimationTime = j10;
    }

    public final void setOnViewTreeOwnersAvailable(Ba.l<? super b, C4153F> callback) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    @Override // A0.m0
    public void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // A0.m0
    public void v() {
        if (this.observationClearRequested) {
            getSnapshotObserver().b();
            this.observationClearRequested = false;
        }
        W w10 = this._androidViewsHandler;
        if (w10 != null) {
            f0(w10);
        }
        while (this.endApplyChangesListeners.y()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                Ba.a<C4153F> aVar = this.endApplyChangesListeners.t()[i10];
                this.endApplyChangesListeners.H(i10, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.endApplyChangesListeners.F(0, size);
        }
    }

    @Override // A0.m0
    public void w() {
        this.composeAccessibilityDelegate.u0();
        this.contentCaptureManager.v();
    }

    @Override // u0.InterfaceC4628N
    public long x(long positionOnScreen) {
        E0();
        return i0.L0.f(this.windowToViewMatrix, C3477h.a(C3476g.m(positionOnScreen) - C3476g.m(this.windowPosition), C3476g.n(positionOnScreen) - C3476g.n(this.windowPosition)));
    }

    public final void y0(A0.l0 layer, boolean isDirty) {
        if (!isDirty) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(layer);
            List<A0.l0> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(layer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(layer);
            return;
        }
        List arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(layer);
    }

    @Override // A0.m0
    public void z(A0.G layoutNode, boolean affectsLookahead, boolean forceRequest) {
        if (affectsLookahead) {
            if (this.measureAndLayoutDelegate.C(layoutNode, forceRequest)) {
                L0(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.F(layoutNode, forceRequest)) {
            L0(this, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        C3862t.d(child);
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(child, index, layoutParams);
    }

    @Override // A0.m0
    public C2022j getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // A0.m0
    public C2024k getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int width, int height) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = width;
        layoutParamsGenerateDefaultLayoutParams.height = height;
        C4153F c4153f = C4153F.f46609a;
        addView(child, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        addView(child, -1, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        addViewInLayout(child, index, params, true);
    }

    @InterfaceC4156a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Loa/F;", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.q$e */
    static final class e extends AbstractC3864v implements Ba.l<Configuration, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f23317B = new e();

        e() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Configuration configuration) {
            a(configuration);
            return C4153F.f46609a;
        }

        public final void a(Configuration configuration) {
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // A0.m0
    public void u(A0.G node) {
    }
}
