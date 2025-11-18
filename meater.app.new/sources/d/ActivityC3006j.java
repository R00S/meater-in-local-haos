package d;

import Q1.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.AbstractC2106m;
import android.view.C2098e0;
import android.view.C2116x;
import android.view.InterfaceC2104k;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import android.view.Menu;
import android.view.MenuItem;
import android.view.S;
import android.view.V;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.a0;
import android.view.b0;
import android.view.c0;
import android.window.OnBackInvokedDispatcher;
import d.ActivityC3006j;
import f.C3298a;
import f.InterfaceC3299b;
import f1.C3309b;
import f1.C3310c;
import g.AbstractC3371c;
import g.AbstractC3373e;
import g.C3375g;
import g.InterfaceC3370b;
import g.InterfaceC3374f;
import g1.InterfaceC3378b;
import g1.InterfaceC3379c;
import h.AbstractC3466a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.InterfaceC4156a;
import oa.InterfaceC4164i;
import r1.InterfaceC4334a;
import s1.C4468y;
import s1.InterfaceC4420A;
import s1.InterfaceC4464w;
import t3.C4547d;
import t3.C4548e;
import t3.C4550g;
import t3.InterfaceC4549f;
import y3.C5123a;

/* compiled from: ComponentActivity.kt */
@Metadata(d1 = {"\u0000à\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 ß\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u00022\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u000e:\nà\u0001Ì\u0001\u0089\u0001á\u0001â\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001aH\u0015¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\"\u0010!J\u0019\u0010%\u001a\u00020\u00112\b\b\u0001\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010%\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b%\u0010)J#\u0010%\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b%\u0010,J#\u0010-\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b-\u0010,J\u000f\u0010.\u001a\u00020\u0011H\u0017¢\u0006\u0004\b.\u0010\u0010J\u0015\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J)\u00107\u001a\u0002062\u0006\u00103\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u0002062\u0006\u00103\u001a\u00020#2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u0002062\u0006\u00103\u001a\u00020#2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u00112\u0006\u00103\u001a\u00020#2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00112\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ'\u0010H\u001a\u00020\u00112\u0006\u0010B\u001a\u00020A2\u0006\u0010E\u001a\u00020\u00032\u0006\u0010G\u001a\u00020FH\u0017¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00112\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bJ\u0010DJ\u000f\u0010K\u001a\u00020\u0011H\u0016¢\u0006\u0004\bK\u0010\u0010J\u000f\u0010L\u001a\u00020\u0011H\u0017¢\u0006\u0004\bL\u0010\u0010J\u001f\u0010P\u001a\u00020\u00112\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020#H\u0017¢\u0006\u0004\bP\u0010QJ)\u0010P\u001a\u00020\u00112\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020#2\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0017¢\u0006\u0004\bP\u0010SJA\u0010Y\u001a\u00020\u00112\u0006\u0010N\u001a\u00020T2\u0006\u0010O\u001a\u00020#2\b\u0010U\u001a\u0004\u0018\u00010M2\u0006\u0010V\u001a\u00020#2\u0006\u0010W\u001a\u00020#2\u0006\u0010X\u001a\u00020#H\u0017¢\u0006\u0004\bY\u0010ZJK\u0010Y\u001a\u00020\u00112\u0006\u0010N\u001a\u00020T2\u0006\u0010O\u001a\u00020#2\b\u0010U\u001a\u0004\u0018\u00010M2\u0006\u0010V\u001a\u00020#2\u0006\u0010W\u001a\u00020#2\u0006\u0010X\u001a\u00020#2\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0017¢\u0006\u0004\bY\u0010[J)\u0010^\u001a\u00020\u00112\u0006\u0010O\u001a\u00020#2\u0006\u0010\\\u001a\u00020#2\b\u0010]\u001a\u0004\u0018\u00010MH\u0015¢\u0006\u0004\b^\u0010_J-\u0010e\u001a\u00020\u00112\u0006\u0010O\u001a\u00020#2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`2\u0006\u0010d\u001a\u00020cH\u0017¢\u0006\u0004\be\u0010fJI\u0010p\u001a\b\u0012\u0004\u0012\u00028\u00000o\"\u0004\b\u0000\u0010g\"\u0004\b\u0001\u0010h2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010i2\u0006\u0010l\u001a\u00020k2\f\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00010m¢\u0006\u0004\bp\u0010qJA\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000o\"\u0004\b\u0000\u0010g\"\u0004\b\u0001\u0010h2\u0012\u0010j\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010i2\f\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00010m¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u00112\u0006\u0010u\u001a\u00020tH\u0017¢\u0006\u0004\bv\u0010wJ\u001b\u0010y\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00020t0x¢\u0006\u0004\by\u0010zJ\u001b\u0010{\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00020t0x¢\u0006\u0004\b{\u0010zJ\u0017\u0010}\u001a\u00020\u00112\u0006\u0010|\u001a\u00020#H\u0017¢\u0006\u0004\b}\u0010&J\u001b\u0010~\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00020#0x¢\u0006\u0004\b~\u0010zJ\u001b\u0010\u007f\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00020#0x¢\u0006\u0004\b\u007f\u0010zJ\u001a\u0010\u0080\u0001\u001a\u00020\u00112\u0006\u0010N\u001a\u00020MH\u0015¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001d\u0010\u0082\u0001\u001a\u00020\u00112\f\u00100\u001a\b\u0012\u0004\u0012\u00020M0x¢\u0006\u0005\b\u0082\u0001\u0010zJ\u001b\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0083\u0001\u001a\u000206H\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J#\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0083\u0001\u001a\u0002062\u0006\u0010u\u001a\u00020tH\u0017¢\u0006\u0006\b\u0084\u0001\u0010\u0086\u0001J\u001e\u0010\u0088\u0001\u001a\u00020\u00112\r\u00100\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010x¢\u0006\u0005\b\u0088\u0001\u0010zJ\u001e\u0010\u0089\u0001\u001a\u00020\u00112\r\u00100\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010x¢\u0006\u0005\b\u0089\u0001\u0010zJ\u001b\u0010\u008b\u0001\u001a\u00020\u00112\u0007\u0010\u008a\u0001\u001a\u000206H\u0017¢\u0006\u0006\b\u008b\u0001\u0010\u0085\u0001J#\u0010\u008b\u0001\u001a\u00020\u00112\u0007\u0010\u008a\u0001\u001a\u0002062\u0006\u0010u\u001a\u00020tH\u0017¢\u0006\u0006\b\u008b\u0001\u0010\u0086\u0001J\u001e\u0010\u008d\u0001\u001a\u00020\u00112\r\u00100\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010x¢\u0006\u0005\b\u008d\u0001\u0010zJ\u001e\u0010\u008e\u0001\u001a\u00020\u00112\r\u00100\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010x¢\u0006\u0005\b\u008e\u0001\u0010zJ\u0011\u0010\u008f\u0001\u001a\u00020\u0011H\u0015¢\u0006\u0005\b\u008f\u0001\u0010\u0010J\u0011\u0010\u0090\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u0090\u0001\u0010\u0010R\u0017\u0010\u0093\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001f\u0010\u009c\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u0012\u0005\b\u009b\u0001\u0010\u0010R\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010£\u0001\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R \u0010¨\u0001\u001a\u00030¤\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\bg\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010ª\u0001\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b©\u0001\u0010gR\u0018\u0010®\u0001\u001a\u00030«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001c\u0010³\u0001\u001a\u00020k8\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R$\u0010¶\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0x0´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010µ\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0x0´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010µ\u0001R#\u0010¹\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0x0´\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bh\u0010µ\u0001R%\u0010»\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010x0´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010µ\u0001R%\u0010½\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008c\u00010x0´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010µ\u0001R\u001f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¾\u00010´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010µ\u0001R\u0019\u0010Ã\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Å\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Â\u0001R!\u0010Ê\u0001\u001a\u00030Æ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÇ\u0001\u0010¥\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R'\u0010Ï\u0001\u001a\u00020\u00138FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bË\u0001\u0010¥\u0001\u0012\u0005\bÎ\u0001\u0010\u0010\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ð\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Ö\u0001\u001a\u00030\u009d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0015\u0010Þ\u0001\u001a\u00030Û\u00018F¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001¨\u0006ã\u0001"}, d2 = {"Ld/j;", "Lf1/h;", "", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/k;", "Lt3/f;", "Ld/J;", "Lg/f;", "Lg1/b;", "Lg1/c;", "Lf1/r;", "Lf1/s;", "Ls1/w;", "Ld/E;", "<init>", "()V", "Loa/F;", "j0", "Ld/G;", "dispatcher", "e0", "(Ld/G;)V", "Ld/j$e;", "i0", "()Ld/j$e;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "o0", "", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "l0", "Lf/b;", "listener", "g0", "(Lf/b;)V", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Ls1/A;", "provider", "C", "(Ls1/A;)V", "owner", "Landroidx/lifecycle/m$b;", "state", "d0", "(Ls1/A;Landroidx/lifecycle/v;Landroidx/lifecycle/m$b;)V", "o", "m0", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lh/a;", "contract", "Lg/e;", "registry", "Lg/b;", "callback", "Lg/c;", "q0", "(Lh/a;Lg/e;Lg/b;)Lg/c;", "p0", "(Lh/a;Lg/b;)Lg/c;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lr1/a;", "j", "(Lr1/a;)V", "u", "level", "onTrimMemory", "g", "D", "onNewIntent", "(Landroid/content/Intent;)V", "h0", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Lf1/j;", "z", "d", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Lf1/v;", "x", "M", "onUserLeaveHint", "reportFullyDrawn", "Lf/a;", "Lf/a;", "contextAwareHelper", "Ls1/y;", "E", "Ls1/y;", "menuHostHelper", "Lt3/e;", "F", "Lt3/e;", "getSavedStateRegistryController$annotations", "savedStateRegistryController", "Landroidx/lifecycle/b0;", "G", "Landroidx/lifecycle/b0;", "_viewModelStore", "H", "Ld/j$e;", "reportFullyDrawnExecutor", "Ld/D;", "Loa/i;", "k0", "()Ld/D;", "fullyDrawnReporter", "J", "contentLayoutId", "Ljava/util/concurrent/atomic/AtomicInteger;", "K", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "L", "Lg/e;", "r", "()Lg/e;", "activityResultRegistry", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "N", "onTrimMemoryListeners", "onNewIntentListeners", "P", "onMultiWindowModeChangedListeners", "Q", "onPictureInPictureModeChangedListeners", "Ljava/lang/Runnable;", "R", "onUserLeaveHintListeners", "S", "Z", "dispatchingOnMultiWindowModeChanged", "T", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/a0$c;", "U", "l", "()Landroidx/lifecycle/a0$c;", "defaultViewModelProviderFactory", "V", "c", "()Ld/G;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "Landroidx/lifecycle/m;", "getLifecycle", "()Landroidx/lifecycle/m;", "lifecycle", "v", "()Landroidx/lifecycle/b0;", "viewModelStore", "LQ1/a;", "m", "()LQ1/a;", "defaultViewModelCreationExtras", "Lt3/d;", "B", "()Lt3/d;", "savedStateRegistry", "W", "b", "e", "f", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC3006j extends f1.h implements InterfaceC2114v, c0, InterfaceC2104k, InterfaceC4549f, J, InterfaceC3374f, InterfaceC3378b, InterfaceC3379c, f1.r, f1.s, InterfaceC4464w, InterfaceC2993E {

    /* renamed from: W, reason: collision with root package name */
    private static final c f39567W = new c(null);

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final C3298a contextAwareHelper = new C3298a();

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final C4468y menuHostHelper = new C4468y(new Runnable() { // from class: d.d
        @Override // java.lang.Runnable
        public final void run() {
            ActivityC3006j.n0(this.f39560B);
        }
    });

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final C4548e savedStateRegistryController;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private b0 _viewModelStore;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final e reportFullyDrawnExecutor;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i fullyDrawnReporter;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private int contentLayoutId;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger nextLocalRequestCode;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3373e activityResultRegistry;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<InterfaceC4334a<Configuration>> onConfigurationChangedListeners;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<InterfaceC4334a<Integer>> onTrimMemoryListeners;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<InterfaceC4334a<Intent>> onNewIntentListeners;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<InterfaceC4334a<f1.j>> onMultiWindowModeChangedListeners;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<InterfaceC4334a<f1.v>> onPictureInPictureModeChangedListeners;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchingOnMultiWindowModeChanged;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i defaultViewModelProviderFactory;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i onBackPressedDispatcher;

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"d/j$a", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.j$a */
    public static final class a implements InterfaceC2111s {
        a() {
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v source, AbstractC2106m.a event) {
            C3862t.g(source, "source");
            C3862t.g(event, "event");
            ActivityC3006j.this.j0();
            ActivityC3006j.this.getLifecycle().d(this);
        }
    }

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ld/j$b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/window/OnBackInvokedDispatcher;", "a", "(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.j$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f39588a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            C3862t.g(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            C3862t.f(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld/j$c;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.j$c */
    private static final class c {
        public /* synthetic */ c(C3854k c3854k) {
            this();
        }

        private c() {
        }
    }

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ld/j$d;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "getCustom", "()Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", "custom", "Landroidx/lifecycle/b0;", "Landroidx/lifecycle/b0;", "()Landroidx/lifecycle/b0;", "c", "(Landroidx/lifecycle/b0;)V", "viewModelStore", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.j$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object custom;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private b0 viewModelStore;

        /* renamed from: a, reason: from getter */
        public final b0 getViewModelStore() {
            return this.viewModelStore;
        }

        public final void b(Object obj) {
            this.custom = obj;
        }

        public final void c(b0 b0Var) {
            this.viewModelStore = b0Var;
        }
    }

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Ld/j$e;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "Loa/F;", "W", "(Landroid/view/View;)V", "j", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.j$e */
    private interface e extends Executor {
        void W(View view);

        void j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Ld/j$f;", "Ld/j$e;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Ld/j;)V", "Landroid/view/View;", "view", "Loa/F;", "W", "(Landroid/view/View;)V", "j", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "B", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "C", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "D", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.j$f */
    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + 10000;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private Runnable currentRunnable;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private boolean onDrawScheduled;

        public f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(f this$0) {
            C3862t.g(this$0, "this$0");
            Runnable runnable = this$0.currentRunnable;
            if (runnable != null) {
                C3862t.d(runnable);
                runnable.run();
                this$0.currentRunnable = null;
            }
        }

        @Override // d.ActivityC3006j.e
        public void W(View view) {
            C3862t.g(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C3862t.g(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ActivityC3006j.this.getWindow().getDecorView();
            C3862t.f(decorView, "window.decorView");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: d.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC3006j.f.b(this.f39600B);
                    }
                });
            } else if (C3862t.b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // d.ActivityC3006j.e
        public void j() {
            ActivityC3006j.this.getWindow().getDecorView().removeCallbacks(this);
            ActivityC3006j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ActivityC3006j.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ActivityC3006j.this.k0().c()) {
                this.onDrawScheduled = false;
                ActivityC3006j.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityC3006j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"d/j$g", "Lg/e;", "I", "O", "", "requestCode", "Lh/a;", "contract", "input", "Lf1/c;", "options", "Loa/F;", "i", "(ILh/a;Ljava/lang/Object;Lf1/c;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d.j$g */
    public static final class g extends AbstractC3373e {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(g this$0, int i10, AbstractC3466a.C0539a c0539a) {
            C3862t.g(this$0, "this$0");
            this$0.f(i10, c0539a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(g this$0, int i10, IntentSender.SendIntentException e10) {
            C3862t.g(this$0, "this$0");
            C3862t.g(e10, "$e");
            this$0.e(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e10));
        }

        @Override // g.AbstractC3373e
        public <I, O> void i(final int requestCode, AbstractC3466a<I, O> contract, I input, C3310c options) {
            Bundle bundle;
            C3862t.g(contract, "contract");
            ActivityC3006j activityC3006j = ActivityC3006j.this;
            final AbstractC3466a.C0539a<O> c0539aB = contract.b(activityC3006j, input);
            if (c0539aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC3006j.g.s(this.f39601B, requestCode, c0539aB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(activityC3006j, input);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                C3862t.d(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(activityC3006j.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (C3862t.b("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C3309b.t(activityC3006j, stringArrayExtra, requestCode);
                return;
            }
            if (!C3862t.b("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                C3309b.w(activityC3006j, intentA, requestCode, bundle);
                return;
            }
            C3375g c3375g = (C3375g) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                C3862t.d(c3375g);
                C3309b.x(activityC3006j, c3375g.getIntentSender(), requestCode, c3375g.getFillInIntent(), c3375g.getFlagsMask(), c3375g.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC3006j.g.t(this.f39604B, requestCode, e10);
                    }
                });
            }
        }
    }

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/V;", "a", "()Landroidx/lifecycle/V;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d.j$h */
    static final class h extends AbstractC3864v implements Ba.a<V> {
        h() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V invoke() {
            Application application = ActivityC3006j.this.getApplication();
            ActivityC3006j activityC3006j = ActivityC3006j.this;
            return new V(application, activityC3006j, activityC3006j.getIntent() != null ? ActivityC3006j.this.getIntent().getExtras() : null);
        }
    }

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld/D;", "a", "()Ld/D;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d.j$i */
    static final class i extends AbstractC3864v implements Ba.a<C2992D> {

        /* compiled from: ComponentActivity.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: d.j$i$a */
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ ActivityC3006j f39598B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ActivityC3006j activityC3006j) {
                super(0);
                this.f39598B = activityC3006j;
            }

            public final void a() {
                this.f39598B.reportFullyDrawn();
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        i() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2992D invoke() {
            return new C2992D(ActivityC3006j.this.reportFullyDrawnExecutor, new a(ActivityC3006j.this));
        }
    }

    /* compiled from: ComponentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ld/G;", "c", "()Ld/G;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d.j$j, reason: collision with other inner class name */
    static final class C0504j extends AbstractC3864v implements Ba.a<C2995G> {
        C0504j() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ActivityC3006j this$0) {
            C3862t.g(this$0, "this$0");
            try {
                ActivityC3006j.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!C3862t.b(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!C3862t.b(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(ActivityC3006j this$0, C2995G dispatcher) {
            C3862t.g(this$0, "this$0");
            C3862t.g(dispatcher, "$dispatcher");
            this$0.e0(dispatcher);
        }

        @Override // Ba.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C2995G invoke() {
            final ActivityC3006j activityC3006j = ActivityC3006j.this;
            final C2995G c2995g = new C2995G(new Runnable() { // from class: d.n
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC3006j.C0504j.d(activityC3006j);
                }
            });
            final ActivityC3006j activityC3006j2 = ActivityC3006j.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (C3862t.b(Looper.myLooper(), Looper.getMainLooper())) {
                    activityC3006j2.e0(c2995g);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC3006j.C0504j.i(activityC3006j2, c2995g);
                        }
                    });
                }
            }
            return c2995g;
        }
    }

    public ActivityC3006j() {
        C4548e c4548eA = C4548e.INSTANCE.a(this);
        this.savedStateRegistryController = c4548eA;
        this.reportFullyDrawnExecutor = i0();
        this.fullyDrawnReporter = C4165j.a(new i());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new g();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new InterfaceC2111s() { // from class: d.e
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                ActivityC3006j.V(this.f39561B, interfaceC2114v, aVar);
            }
        });
        getLifecycle().a(new InterfaceC2111s() { // from class: d.f
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                ActivityC3006j.W(this.f39562B, interfaceC2114v, aVar);
            }
        });
        getLifecycle().a(new a());
        c4548eA.c();
        S.c(this);
        B().h("android:support:activity-result", new C4547d.c() { // from class: d.g
            @Override // t3.C4547d.c
            public final Bundle a() {
                return ActivityC3006j.X(this.f39563a);
            }
        });
        g0(new InterfaceC3299b() { // from class: d.h
            @Override // f.InterfaceC3299b
            public final void a(Context context) {
                ActivityC3006j.Y(this.f39564a, context);
            }
        });
        this.defaultViewModelProviderFactory = C4165j.a(new h());
        this.onBackPressedDispatcher = C4165j.a(new C0504j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(ActivityC3006j this$0, InterfaceC2114v interfaceC2114v, AbstractC2106m.a event) {
        Window window;
        View viewPeekDecorView;
        C3862t.g(this$0, "this$0");
        C3862t.g(interfaceC2114v, "<anonymous parameter 0>");
        C3862t.g(event, "event");
        if (event != AbstractC2106m.a.ON_STOP || (window = this$0.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(ActivityC3006j this$0, InterfaceC2114v interfaceC2114v, AbstractC2106m.a event) {
        C3862t.g(this$0, "this$0");
        C3862t.g(interfaceC2114v, "<anonymous parameter 0>");
        C3862t.g(event, "event");
        if (event == AbstractC2106m.a.ON_DESTROY) {
            this$0.contextAwareHelper.b();
            if (!this$0.isChangingConfigurations()) {
                this$0.v().a();
            }
            this$0.reportFullyDrawnExecutor.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle X(ActivityC3006j this$0) {
        C3862t.g(this$0, "this$0");
        Bundle bundle = new Bundle();
        this$0.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(ActivityC3006j this$0, Context it) {
        C3862t.g(this$0, "this$0");
        C3862t.g(it, "it");
        Bundle bundleB = this$0.B().b("android:support:activity-result");
        if (bundleB != null) {
            this$0.activityResultRegistry.j(bundleB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(final C2995G dispatcher) {
        getLifecycle().a(new InterfaceC2111s() { // from class: d.i
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                ActivityC3006j.f0(dispatcher, this, interfaceC2114v, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(C2995G dispatcher, ActivityC3006j this$0, InterfaceC2114v interfaceC2114v, AbstractC2106m.a event) {
        C3862t.g(dispatcher, "$dispatcher");
        C3862t.g(this$0, "this$0");
        C3862t.g(interfaceC2114v, "<anonymous parameter 0>");
        C3862t.g(event, "event");
        if (event == AbstractC2106m.a.ON_CREATE) {
            dispatcher.o(b.f39588a.a(this$0));
        }
    }

    private final e i0() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new b0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(ActivityC3006j this$0) {
        C3862t.g(this$0, "this$0");
        this$0.m0();
    }

    @Override // t3.InterfaceC4549f
    public final C4547d B() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // s1.InterfaceC4464w
    public void C(InterfaceC4420A provider) {
        C3862t.g(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    @Override // g1.InterfaceC3379c
    public final void D(InterfaceC4334a<Integer> listener) {
        C3862t.g(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // f1.s
    public final void M(InterfaceC4334a<f1.v> listener) {
        C3862t.g(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        l0();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C3862t.f(decorView, "window.decorView");
        eVar.W(decorView);
        super.addContentView(view, params);
    }

    @Override // d.J
    /* renamed from: c */
    public final C2995G getOnBackPressedDispatcher() {
        return (C2995G) this.onBackPressedDispatcher.getValue();
    }

    @Override // f1.r
    public final void d(InterfaceC4334a<f1.j> listener) {
        C3862t.g(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @SuppressLint({"LambdaLast"})
    public void d0(InterfaceC4420A provider, InterfaceC2114v owner, AbstractC2106m.b state) {
        C3862t.g(provider, "provider");
        C3862t.g(owner, "owner");
        C3862t.g(state, "state");
        this.menuHostHelper.c(provider, owner, state);
    }

    @Override // g1.InterfaceC3379c
    public final void g(InterfaceC4334a<Integer> listener) {
        C3862t.g(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void g0(InterfaceC3299b listener) {
        C3862t.g(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // f1.h, android.view.InterfaceC2114v
    public AbstractC2106m getLifecycle() {
        return super.getLifecycle();
    }

    public final void h0(InterfaceC4334a<Intent> listener) {
        C3862t.g(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // g1.InterfaceC3378b
    public final void j(InterfaceC4334a<Configuration> listener) {
        C3862t.g(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public C2992D k0() {
        return (C2992D) this.fullyDrawnReporter.getValue();
    }

    @Override // android.view.InterfaceC2104k
    /* renamed from: l */
    public a0.c getDefaultViewModelProviderFactory() {
        return (a0.c) this.defaultViewModelProviderFactory.getValue();
    }

    public void l0() {
        View decorView = getWindow().getDecorView();
        C3862t.f(decorView, "window.decorView");
        android.view.View.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        C3862t.f(decorView2, "window.decorView");
        C2098e0.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        C3862t.f(decorView3, "window.decorView");
        C4550g.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        C3862t.f(decorView4, "window.decorView");
        N.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        C3862t.f(decorView5, "window.decorView");
        M.a(decorView5, this);
    }

    @Override // android.view.InterfaceC2104k
    public Q1.a m() {
        Q1.d dVar = new Q1.d(null, 1, null);
        if (getApplication() != null) {
            a.b<Application> bVar = a0.a.f25931h;
            Application application = getApplication();
            C3862t.f(application, "application");
            dVar.c(bVar, application);
        }
        dVar.c(S.f25904a, this);
        dVar.c(S.f25905b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.c(S.f25906c, extras);
        }
        return dVar;
    }

    public void m0() {
        invalidateOptionsMenu();
    }

    @Override // s1.InterfaceC4464w
    public void o(InterfaceC4420A provider) {
        C3862t.g(provider, "provider");
        this.menuHostHelper.i(provider);
    }

    @InterfaceC4156a
    public Object o0() {
        return null;
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.e(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    public void onBackPressed() {
        getOnBackPressedDispatcher().l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC4334a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // f1.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.d(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        android.view.L.INSTANCE.c(this);
        int i10 = this.contentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        C3862t.g(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.e(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        C3862t.g(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.g(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC4334a<f1.j>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new f1.j(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        C3862t.g(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC4334a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        C3862t.g(menu, "menu");
        this.menuHostHelper.f(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC4334a<f1.v>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new f1.v(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        C3862t.g(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.h(menu);
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        C3862t.g(permissions, "permissions");
        C3862t.g(grantResults, "grantResults");
        if (this.activityResultRegistry.e(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objO0 = o0();
        b0 viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            viewModelStore = dVar.getViewModelStore();
        }
        if (viewModelStore == null && objO0 == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.b(objO0);
        dVar2.c(viewModelStore);
        return dVar2;
    }

    @Override // f1.h, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        C3862t.g(outState, "outState");
        if (getLifecycle() instanceof C2116x) {
            AbstractC2106m lifecycle = getLifecycle();
            C3862t.e(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C2116x) lifecycle).n(AbstractC2106m.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<InterfaceC4334a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final <I, O> AbstractC3371c<I> p0(AbstractC3466a<I, O> contract, InterfaceC3370b<O> callback) {
        C3862t.g(contract, "contract");
        C3862t.g(callback, "callback");
        return q0(contract, this.activityResultRegistry, callback);
    }

    public final <I, O> AbstractC3371c<I> q0(AbstractC3466a<I, O> contract, AbstractC3373e registry, InterfaceC3370b<O> callback) {
        C3862t.g(contract, "contract");
        C3862t.g(registry, "registry");
        C3862t.g(callback, "callback");
        return registry.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // g.InterfaceC3374f
    /* renamed from: r, reason: from getter */
    public final AbstractC3373e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C5123a.d()) {
                C5123a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            k0().b();
            C5123a.b();
        } catch (Throwable th) {
            C5123a.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        l0();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C3862t.f(decorView, "window.decorView");
        eVar.W(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    public void startActivityForResult(Intent intent, int requestCode) {
        C3862t.g(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        C3862t.g(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // g1.InterfaceC3378b
    public final void u(InterfaceC4334a<Configuration> listener) {
        C3862t.g(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // android.view.c0
    public b0 v() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        j0();
        b0 b0Var = this._viewModelStore;
        C3862t.d(b0Var);
        return b0Var;
    }

    @Override // f1.s
    public final void x(InterfaceC4334a<f1.v> listener) {
        C3862t.g(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // f1.r
    public final void z(InterfaceC4334a<f1.j> listener) {
        C3862t.g(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        C3862t.g(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @InterfaceC4156a
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        C3862t.g(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC4334a<f1.j>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new f1.j(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        C3862t.g(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC4334a<f1.v>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new f1.v(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        l0();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C3862t.f(decorView, "window.decorView");
        eVar.W(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        l0();
        e eVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        C3862t.f(decorView, "window.decorView");
        eVar.W(decorView);
        super.setContentView(view, params);
    }
}
