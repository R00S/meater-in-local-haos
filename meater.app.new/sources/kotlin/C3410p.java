package kotlin;

import Ba.a;
import ac.C1972g;
import ac.H;
import ac.InterfaceC1970e;
import ac.J;
import ac.s;
import ac.t;
import ac.z;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2113u;
import android.view.InterfaceC2114v;
import android.view.b0;
import d.AbstractC2994F;
import j3.C3738c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3389F;
import kotlin.C3407m;
import kotlin.C3411q;
import kotlin.C3414t;
import kotlin.C3420z;
import kotlin.Metadata;
import kotlin.collections.C3830k;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3846c;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.W;
import oa.C4153F;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u0000 ý\u00012\u00020\u0001:\u0006\u0090\u0001\u0095\u0001\u0099\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJS\u0010\u0016\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001b\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b \u0010!J3\u0010$\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u00012\u0006\u0010#\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00192\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000e2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010,J1\u00100\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0019H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u000106H\u0003¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u0004\u0018\u00010&2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020>*\b\u0012\u0004\u0012\u00020\u00060-H\u0002¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020&\"\b\b\u0000\u0010\"*\u00020\u00012\u0006\u0010#\u001a\u00028\u0000H\u0002¢\u0006\u0004\bA\u0010BJ5\u0010E\u001a\u00020\t2\u0006\u0010C\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\bE\u0010FJ!\u0010G\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bG\u0010HJ5\u0010J\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u001d2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bJ\u0010KJ;\u0010L\u001a\u00020\u00192\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002¢\u0006\u0004\bO\u0010PJ9\u0010T\u001a\u00020\t2\u0006\u0010C\u001a\u00020\r2\b\u0010Q\u001a\u0004\u0018\u0001062\u0006\u0010R\u001a\u00020\u00062\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0019H\u0017¢\u0006\u0004\bZ\u00105J!\u0010[\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0017¢\u0006\u0004\b[\u0010\\J)\u0010]\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b]\u0010!J)\u0010^\u001a\u00020\u00192\u0006\u0010#\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b^\u0010(J%\u0010a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\t0_H\u0000¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\tH\u0000¢\u0006\u0004\bc\u0010WJ\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\bd\u0010eJ\u0019\u0010g\u001a\u00020\t2\b\b\u0001\u0010f\u001a\u00020\u001dH\u0017¢\u0006\u0004\bg\u0010hJ#\u0010i\u001a\u00020\t2\b\b\u0001\u0010f\u001a\u00020\u001d2\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\bi\u0010jJ!\u0010l\u001a\u00020\t2\u0006\u0010k\u001a\u00020>2\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\bl\u0010mJ\u0019\u0010p\u001a\u00020\u00192\b\u0010o\u001a\u0004\u0018\u00010nH\u0017¢\u0006\u0004\bp\u0010qJ'\u0010s\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bs\u0010tJ3\u0010v\u001a\u0004\u0018\u00010\r*\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010u\u001a\u00020\u00192\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\bv\u0010wJ\u0019\u0010y\u001a\u00020\t2\b\b\u0001\u0010x\u001a\u00020\u001dH\u0017¢\u0006\u0004\by\u0010hJ#\u0010z\u001a\u00020\t2\b\b\u0001\u0010x\u001a\u00020\u001d2\b\u0010D\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\bz\u0010jJ-\u0010\"\u001a\u00020\t2\b\b\u0001\u0010x\u001a\u00020\u001d2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\"\u0010{J7\u0010|\u001a\u00020\t2\b\b\u0001\u0010x\u001a\u00020\u001d2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b|\u0010}J\u001a\u0010\u0080\u0001\u001a\u00020\t2\u0006\u0010\u007f\u001a\u00020~H\u0017¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001c\u0010\u0085\u0001\u001a\u00020\t2\t\u0010\u0084\u0001\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0005\b\u0085\u0001\u00109J\u001c\u0010\u0088\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008c\u0001\u001a\u00020\t2\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0017¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001c\u0010\u008e\u0001\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0098\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001b\u0010¡\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R#\u0010¦\u0001\u001a\f\u0012\u0005\u0012\u00030£\u0001\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010¨\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b§\u0001\u0010ZR\u001d\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R$\u0010¯\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R,\u0010µ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0°\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R$\u0010·\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010®\u0001R)\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0°\u00018\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010²\u0001\u001a\u0006\b¹\u0001\u0010´\u0001R$\u0010¾\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R%\u0010Á\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030¿\u00010»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010½\u0001R&\u0010Ã\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010&0»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010½\u0001R)\u0010Ä\u0001\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0»\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bT\u0010½\u0001R\u001c\u0010Ç\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001b\u0010Ê\u0001\u001a\u0005\u0018\u00010È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010É\u0001R\u001e\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030Ì\u00010Ë\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010Í\u0001R)\u0010Õ\u0001\u001a\u00030Ï\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b+\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R\u0017\u0010Ø\u0001\u001a\u00030Ö\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010×\u0001R\u0017\u0010Û\u0001\u001a\u00030Ù\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bs\u0010Ú\u0001R\u0018\u0010Ý\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÜ\u0001\u0010ZR\u0019\u0010à\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010ß\u0001R1\u0010ã\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\t\u0012\u00070á\u0001R\u00020\u00000»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010½\u0001R&\u0010å\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010ä\u0001R&\u0010æ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010ä\u0001R$\u0010ç\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010½\u0001R\u0019\u0010è\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010Ñ\u0001R\u001e\u0010ë\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010ê\u0001R!\u0010ð\u0001\u001a\u00030\u0098\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001R\u001e\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R#\u0010ú\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060õ\u00018\u0006¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R\u0017\u0010ü\u0001\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010û\u0001R(\u0010k\u001a\u00020>2\u0006\u0010k\u001a\u00020>8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bý\u0001\u0010þ\u0001\"\u0006\bÿ\u0001\u0010\u0080\u0002R,\u0010\u0081\u0002\u001a\u00030Þ\u00012\b\u0010\u0081\u0002\u001a\u00030Þ\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002\"\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0019\u0010\u0087\u0002\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010\u0086\u0002R\u0019\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010\u0088\u0002¨\u0006\u008a\u0002"}, d2 = {"Lg3/p;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lg3/m;", "child", "parent", "Loa/F;", "Q", "(Lg3/m;Lg3/m;)V", "Lg3/F;", "Lg3/t;", "", "entries", "Lg3/z;", "navOptions", "Lg3/F$a;", "navigatorExtras", "Lkotlin/Function1;", "handler", "X", "(Lg3/F;Ljava/util/List;Lg3/z;Lg3/F$a;LBa/l;)V", "popUpTo", "", "saveState", "f0", "(Lg3/F;Lg3/m;ZLBa/l;)V", "", "destinationId", "inclusive", "g0", "(IZZ)Z", "T", "route", "h0", "(Ljava/lang/Object;ZZ)Z", "", "i0", "(Ljava/lang/String;ZZ)Z", "popOperations", "foundDestination", "t", "(Ljava/util/List;Lg3/t;ZZ)Z", "Lkotlin/collections/k;", "Lg3/n;", "savedState", "k0", "(Lg3/m;ZLkotlin/collections/k;)V", "r", "(I)Z", "s", "()Z", "Landroid/os/Bundle;", "startDestinationArgs", "Y", "(Landroid/os/Bundle;)V", "", "deepLink", "z", "([I)Ljava/lang/String;", "Lg3/v;", "L", "(Lkotlin/collections/k;)Lg3/v;", "A", "(Ljava/lang/Object;)Ljava/lang/String;", "node", "args", "V", "(Lg3/t;Landroid/os/Bundle;Lg3/z;Lg3/F$a;)V", "O", "(Lg3/t;Landroid/os/Bundle;)Z", "id", "o0", "(ILandroid/os/Bundle;Lg3/z;Lg3/F$a;)Z", "u", "(Ljava/util/List;Landroid/os/Bundle;Lg3/z;Lg3/F$a;)Z", "backStackState", "N", "(Lkotlin/collections/k;)Ljava/util/List;", "finalArgs", "backStackEntry", "restoredEntries", "p", "(Lg3/t;Landroid/os/Bundle;Lg3/m;Ljava/util/List;)V", "x0", "()V", "v0", "(Lg3/m;)Lg3/m;", "Z", "a0", "(IZ)Z", "b0", "c0", "Lkotlin/Function0;", "onComplete", "e0", "(Lg3/m;LBa/a;)V", "w0", "m0", "()Ljava/util/List;", "graphResId", "q0", "(I)V", "r0", "(ILandroid/os/Bundle;)V", "graph", "s0", "(Lg3/v;Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "M", "(Landroid/content/Intent;)Z", "matchingDest", "v", "(ILg3/t;)Lg3/t;", "searchChildren", "x", "(Lg3/t;IZLg3/t;)Lg3/t;", "resId", "R", "S", "(ILandroid/os/Bundle;Lg3/z;)V", "U", "(ILandroid/os/Bundle;Lg3/z;Lg3/F$a;)V", "Lg3/u;", "directions", "W", "(Lg3/u;)V", "p0", "()Landroid/os/Bundle;", "navState", "n0", "Landroidx/lifecycle/v;", "owner", "t0", "(Landroidx/lifecycle/v;)V", "Landroidx/lifecycle/b0;", "viewModelStore", "u0", "(Landroidx/lifecycle/b0;)V", "B", "(I)Lg3/m;", "a", "Landroid/content/Context;", "C", "()Landroid/content/Context;", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "Lg3/y;", "c", "Lg3/y;", "inflater", "d", "Lg3/v;", "_graph", "e", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "f", "[Landroid/os/Parcelable;", "backStackToRestore", "g", "deepLinkHandled", "h", "Lkotlin/collections/k;", "backQueue", "Lac/t;", "i", "Lac/t;", "_currentBackStack", "Lac/H;", "j", "Lac/H;", "D", "()Lac/H;", "currentBackStack", "k", "_visibleEntries", "l", "getVisibleEntries", "visibleEntries", "", "m", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "n", "parentToChildCount", "o", "backStackMap", "backStackStates", "q", "Landroidx/lifecycle/v;", "lifecycleOwner", "Lg3/q;", "Lg3/q;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lg3/p$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/m$b;", "Landroidx/lifecycle/m$b;", "I", "()Landroidx/lifecycle/m$b;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/m$b;)V", "hostLifecycleState", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/u;", "lifecycleObserver", "Ld/F;", "Ld/F;", "onBackPressedCallback", "w", "enableOnBackPressedCallback", "Lg3/G;", "Lg3/G;", "_navigatorProvider", "Lg3/p$b;", "y", "navigatorState", "LBa/l;", "addToBackStackHandler", "popFromBackStackHandler", "entrySavedState", "dispatchReentrantCount", "", "Ljava/util/List;", "backStackEntriesToDispatch", "E", "Loa/i;", "J", "()Lg3/y;", "navInflater", "Lac/s;", "F", "Lac/s;", "_currentBackStackEntryFlow", "Lac/e;", "G", "Lac/e;", "getCurrentBackStackEntryFlow", "()Lac/e;", "currentBackStackEntryFlow", "()I", "destinationCountOnBackStack", "H", "()Lg3/v;", "setGraph", "(Lg3/v;)V", "navigatorProvider", "K", "()Lg3/G;", "setNavigatorProvider", "(Lg3/G;)V", "()Lg3/t;", "currentDestination", "()Lg3/m;", "currentBackStackEntry", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3410p {

    /* renamed from: I, reason: collision with root package name */
    private static boolean f41673I = true;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super C3407m, C4153F> popFromBackStackHandler;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Map<C3407m, Boolean> entrySavedState;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int dispatchReentrantCount;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final List<C3407m> backStackEntriesToDispatch;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i navInflater;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final s<C3407m> _currentBackStackEntryFlow;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1970e<C3407m> currentBackStackEntryFlow;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Activity activity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C3419y inflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C3416v _graph;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Bundle navigatorStateToRestore;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Parcelable[] backStackToRestore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean deepLinkHandled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C3830k<C3407m> backQueue;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final t<List<C3407m>> _currentBackStack;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final H<List<C3407m>> currentBackStack;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<List<C3407m>> _visibleEntries;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final H<List<C3407m>> visibleEntries;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<C3407m, C3407m> childToParentEntries;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Map<C3407m, AtomicInteger> parentToChildCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> backStackMap;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Map<String, C3830k<C3408n>> backStackStates;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC2114v lifecycleOwner;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private C3411q viewModel;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<c> onDestinationChangedListeners;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AbstractC2106m.b hostLifecycleState;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2113u lifecycleObserver;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final AbstractC2994F onBackPressedCallback;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean enableOnBackPressedCallback;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private C3390G _navigatorProvider;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Map<AbstractC3389F<? extends C3414t>, b> navigatorState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super C3407m, C4153F> addToBackStackHandler;

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lg3/p$b;", "Lg3/H;", "Lg3/F;", "Lg3/t;", "navigator", "<init>", "(Lg3/p;Lg3/F;)V", "Lg3/m;", "backStackEntry", "Loa/F;", "k", "(Lg3/m;)V", "o", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Lg3/t;Landroid/os/Bundle;)Lg3/m;", "popUpTo", "", "saveState", "h", "(Lg3/m;Z)V", "i", "entry", "e", "j", "g", "Lg3/F;", "getNavigator", "()Lg3/F;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.p$b */
    private final class b extends AbstractC3391H {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final AbstractC3389F<? extends C3414t> navigator;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C3410p f41708h;

        /* compiled from: NavController.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: g3.p$b$a */
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C3407m f41710C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ boolean f41711D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3407m c3407m, boolean z10) {
                super(0);
                this.f41710C = c3407m;
                this.f41711D = z10;
            }

            public final void a() {
                b.super.h(this.f41710C, this.f41711D);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        public b(C3410p c3410p, AbstractC3389F<? extends C3414t> navigator) {
            C3862t.g(navigator, "navigator");
            this.f41708h = c3410p;
            this.navigator = navigator;
        }

        @Override // kotlin.AbstractC3391H
        public C3407m a(C3414t destination, Bundle arguments) {
            C3862t.g(destination, "destination");
            return C3407m.Companion.b(C3407m.INSTANCE, this.f41708h.getContext(), destination, arguments, this.f41708h.I(), this.f41708h.viewModel, null, null, 96, null);
        }

        @Override // kotlin.AbstractC3391H
        public void e(C3407m entry) {
            C3411q c3411q;
            C3862t.g(entry, "entry");
            boolean zB = C3862t.b(this.f41708h.entrySavedState.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f41708h.entrySavedState.remove(entry);
            if (this.f41708h.backQueue.contains(entry)) {
                if (getIsNavigating()) {
                    return;
                }
                this.f41708h.w0();
                this.f41708h._currentBackStack.i(r.Z0(this.f41708h.backQueue));
                this.f41708h._visibleEntries.i(this.f41708h.m0());
                return;
            }
            this.f41708h.v0(entry);
            if (entry.getLifecycle().getState().j(AbstractC2106m.b.CREATED)) {
                entry.n(AbstractC2106m.b.DESTROYED);
            }
            C3830k c3830k = this.f41708h.backQueue;
            if (c3830k == null || !c3830k.isEmpty()) {
                Iterator<E> it = c3830k.iterator();
                while (it.hasNext()) {
                    if (C3862t.b(((C3407m) it.next()).getId(), entry.getId())) {
                        break;
                    }
                }
                if (!zB && (c3411q = this.f41708h.viewModel) != null) {
                    c3411q.i(entry.getId());
                }
            } else if (!zB) {
                c3411q.i(entry.getId());
            }
            this.f41708h.w0();
            this.f41708h._visibleEntries.i(this.f41708h.m0());
        }

        @Override // kotlin.AbstractC3391H
        public void h(C3407m popUpTo, boolean saveState) throws Resources.NotFoundException {
            C3862t.g(popUpTo, "popUpTo");
            AbstractC3389F abstractC3389FD = this.f41708h._navigatorProvider.d(popUpTo.getDestination().getNavigatorName());
            this.f41708h.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
            if (!C3862t.b(abstractC3389FD, this.navigator)) {
                Object obj = this.f41708h.navigatorState.get(abstractC3389FD);
                C3862t.d(obj);
                ((b) obj).h(popUpTo, saveState);
            } else {
                Ba.l lVar = this.f41708h.popFromBackStackHandler;
                if (lVar == null) {
                    this.f41708h.e0(popUpTo, new a(popUpTo, saveState));
                } else {
                    lVar.invoke(popUpTo);
                    super.h(popUpTo, saveState);
                }
            }
        }

        @Override // kotlin.AbstractC3391H
        public void i(C3407m popUpTo, boolean saveState) {
            C3862t.g(popUpTo, "popUpTo");
            super.i(popUpTo, saveState);
        }

        @Override // kotlin.AbstractC3391H
        public void j(C3407m entry) {
            C3862t.g(entry, "entry");
            super.j(entry);
            if (!this.f41708h.backQueue.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.n(AbstractC2106m.b.STARTED);
        }

        @Override // kotlin.AbstractC3391H
        public void k(C3407m backStackEntry) {
            C3862t.g(backStackEntry, "backStackEntry");
            AbstractC3389F abstractC3389FD = this.f41708h._navigatorProvider.d(backStackEntry.getDestination().getNavigatorName());
            if (!C3862t.b(abstractC3389FD, this.navigator)) {
                Object obj = this.f41708h.navigatorState.get(abstractC3389FD);
                if (obj != null) {
                    ((b) obj).k(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            Ba.l lVar = this.f41708h.addToBackStackHandler;
            if (lVar != null) {
                lVar.invoke(backStackEntry);
                o(backStackEntry);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
        }

        public final void o(C3407m backStackEntry) {
            C3862t.g(backStackEntry, "backStackEntry");
            super.k(backStackEntry);
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lg3/p$c;", "", "Lg3/p;", "controller", "Lg3/t;", "destination", "Landroid/os/Bundle;", "arguments", "Loa/F;", "a", "(Lg3/p;Lg3/t;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.p$c */
    public interface c {
        void a(C3410p controller, C3414t destination, Bundle arguments);
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$d */
    static final class d extends AbstractC3864v implements Ba.l<Context, Context> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f41712B = new d();

        d() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            C3862t.g(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg3/A;", "Loa/F;", "a", "(Lg3/A;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$e */
    static final class e extends AbstractC3864v implements Ba.l<C3384A, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f41713B = new e();

        e() {
            super(1);
        }

        public final void a(C3384A navOptions) {
            C3862t.g(navOptions, "$this$navOptions");
            navOptions.g(true);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3384A c3384a) {
            a(c3384a);
            return C4153F.f46609a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/m;", "entry", "Loa/F;", "a", "(Lg3/m;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$f */
    static final class f extends AbstractC3864v implements Ba.l<C3407m, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ K f41714B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ K f41715C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C3410p f41716D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f41717E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C3830k<C3408n> f41718F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(K k10, K k11, C3410p c3410p, boolean z10, C3830k<C3408n> c3830k) {
            super(1);
            this.f41714B = k10;
            this.f41715C = k11;
            this.f41716D = c3410p;
            this.f41717E = z10;
            this.f41718F = c3830k;
        }

        public final void a(C3407m entry) {
            C3862t.g(entry, "entry");
            this.f41714B.f43974B = true;
            this.f41715C.f43974B = true;
            this.f41716D.k0(entry, this.f41717E, this.f41718F);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3407m c3407m) {
            a(c3407m);
            return C4153F.f46609a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg3/t;", "destination", "a", "(Lg3/t;)Lg3/t;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$g */
    static final class g extends AbstractC3864v implements Ba.l<C3414t, C3414t> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f41719B = new g();

        g() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3414t invoke(C3414t destination) {
            C3862t.g(destination, "destination");
            C3416v parent = destination.getParent();
            if (parent == null || parent.getStartDestId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/t;", "destination", "", "a", "(Lg3/t;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$h */
    static final class h extends AbstractC3864v implements Ba.l<C3414t, Boolean> {
        h() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3414t destination) {
            C3862t.g(destination, "destination");
            return Boolean.valueOf(!C3410p.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg3/t;", "destination", "a", "(Lg3/t;)Lg3/t;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$i */
    static final class i extends AbstractC3864v implements Ba.l<C3414t, C3414t> {

        /* renamed from: B, reason: collision with root package name */
        public static final i f41721B = new i();

        i() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3414t invoke(C3414t destination) {
            C3862t.g(destination, "destination");
            C3416v parent = destination.getParent();
            if (parent == null || parent.getStartDestId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/t;", "destination", "", "a", "(Lg3/t;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$j */
    static final class j extends AbstractC3864v implements Ba.l<C3414t, Boolean> {
        j() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C3414t destination) {
            C3862t.g(destination, "destination");
            return Boolean.valueOf(!C3410p.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/m;", "entry", "Loa/F;", "a", "(Lg3/m;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$k */
    static final class k extends AbstractC3864v implements Ba.l<C3407m, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ K f41723B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ List<C3407m> f41724C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ M f41725D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C3410p f41726E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Bundle f41727F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(K k10, List<C3407m> list, M m10, C3410p c3410p, Bundle bundle) {
            super(1);
            this.f41723B = k10;
            this.f41724C = list;
            this.f41725D = m10;
            this.f41726E = c3410p;
            this.f41727F = bundle;
        }

        public final void a(C3407m entry) {
            List<C3407m> listM;
            C3862t.g(entry, "entry");
            this.f41723B.f43974B = true;
            int iIndexOf = this.f41724C.indexOf(entry);
            if (iIndexOf != -1) {
                int i10 = iIndexOf + 1;
                listM = this.f41724C.subList(this.f41725D.f43976B, i10);
                this.f41725D.f43976B = i10;
            } else {
                listM = r.m();
            }
            this.f41726E.p(entry.getDestination(), this.f41727F, entry, listM);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3407m c3407m) {
            a(c3407m);
            return C4153F.f46609a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg3/A;", "Loa/F;", "a", "(Lg3/A;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$l */
    static final class l extends AbstractC3864v implements Ba.l<C3384A, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3414t f41728B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3410p f41729C;

        /* compiled from: NavController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg3/d;", "Loa/F;", "a", "(Lg3/d;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: g3.p$l$a */
        static final class a extends AbstractC3864v implements Ba.l<C3398d, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f41730B = new a();

            a() {
                super(1);
            }

            public final void a(C3398d anim) {
                C3862t.g(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C3398d c3398d) {
                a(c3398d);
                return C4153F.f46609a;
            }
        }

        /* compiled from: NavController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg3/I;", "Loa/F;", "a", "(Lg3/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: g3.p$l$b */
        static final class b extends AbstractC3864v implements Ba.l<C3392I, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final b f41731B = new b();

            b() {
                super(1);
            }

            public final void a(C3392I popUpTo) {
                C3862t.g(popUpTo, "$this$popUpTo");
                popUpTo.c(true);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(C3392I c3392i) {
                a(c3392i);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C3414t c3414t, C3410p c3410p) {
            super(1);
            this.f41728B = c3414t;
            this.f41729C = c3410p;
        }

        public final void a(C3384A navOptions) {
            C3862t.g(navOptions, "$this$navOptions");
            navOptions.a(a.f41730B);
            C3414t c3414t = this.f41728B;
            if (c3414t instanceof C3416v) {
                Tb.h<C3414t> hVarC = C3414t.INSTANCE.c(c3414t);
                C3410p c3410p = this.f41729C;
                for (C3414t c3414t2 : hVarC) {
                    C3414t c3414tF = c3410p.F();
                    if (C3862t.b(c3414t2, c3414tF != null ? c3414tF.getParent() : null)) {
                        return;
                    }
                }
                if (C3410p.f41673I) {
                    navOptions.c(C3416v.INSTANCE.b(this.f41729C.H()).getId(), b.f41731B);
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3384A c3384a) {
            a(c3384a);
            return C4153F.f46609a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/t;", "it", "", "a", "(Lg3/t;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$m */
    static final class m extends AbstractC3864v implements Ba.l<C3414t, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final m f41732B = new m();

        m() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C3414t it) {
            C3862t.g(it, "it");
            return Integer.valueOf(it.getId());
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg3/y;", "a", "()Lg3/y;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$n */
    static final class n extends AbstractC3864v implements a<C3419y> {
        n() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3419y invoke() {
            C3419y c3419y = C3410p.this.inflater;
            return c3419y == null ? new C3419y(C3410p.this.getContext(), C3410p.this._navigatorProvider) : c3419y;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/m;", "it", "Loa/F;", "a", "(Lg3/m;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$o */
    static final class o extends AbstractC3864v implements Ba.l<C3407m, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ K f41734B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3410p f41735C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C3414t f41736D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Bundle f41737E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(K k10, C3410p c3410p, C3414t c3414t, Bundle bundle) {
            super(1);
            this.f41734B = k10;
            this.f41735C = c3410p;
            this.f41736D = c3414t;
            this.f41737E = bundle;
        }

        public final void a(C3407m it) {
            C3862t.g(it, "it");
            this.f41734B.f43974B = true;
            C3410p.q(this.f41735C, this.f41736D, this.f41737E, it, null, 8, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C3407m c3407m) {
            a(c3407m);
            return C4153F.f46609a;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"g3/p$p", "Ld/F;", "Loa/F;", "d", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.p$p, reason: collision with other inner class name */
    public static final class C0526p extends AbstractC2994F {
        C0526p() {
            super(false);
        }

        @Override // d.AbstractC2994F
        public void d() {
            C3410p.this.Z();
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.p$q */
    static final class q extends AbstractC3864v implements Ba.l<String, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f41739B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f41739B = str;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(C3862t.b(str, this.f41739B));
        }
    }

    public C3410p(Context context) {
        Object next;
        C3862t.g(context, "context");
        this.context = context;
        Iterator it = Tb.k.i(context, d.f41712B).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.backQueue = new C3830k<>();
        t<List<C3407m>> tVarA = J.a(r.m());
        this._currentBackStack = tVarA;
        this.currentBackStack = C1972g.b(tVarA);
        t<List<C3407m>> tVarA2 = J.a(r.m());
        this._visibleEntries = tVarA2;
        this.visibleEntries = C1972g.b(tVarA2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = AbstractC2106m.b.INITIALIZED;
        this.lifecycleObserver = new InterfaceC2111s() { // from class: g3.o
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                C3410p.P(this.f41671B, interfaceC2114v, aVar);
            }
        };
        this.onBackPressedCallback = new C0526p();
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new C3390G();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        C3390G c3390g = this._navigatorProvider;
        c3390g.b(new C3417w(c3390g));
        this._navigatorProvider.b(new C3397c(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = C4165j.a(new n());
        s<C3407m> sVarB = z.b(1, 0, Zb.d.f19651C, 2, null);
        this._currentBackStackEntryFlow = sVarB;
        this.currentBackStackEntryFlow = C1972g.a(sVarB);
    }

    private final <T> String A(T route) {
        C3414t c3414tY = y(this, H(), C3738c.b(ic.g.a(P.b(route.getClass()))), true, null, 4, null);
        if (c3414tY == null) {
            throw new IllegalArgumentException(("Destination with route " + P.b(route.getClass()).r() + " cannot be found in navigation graph " + this._graph).toString());
        }
        Map<String, C3405k> mapZ = c3414tY.z();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.M.d(mapZ.size()));
        Iterator<T> it = mapZ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((C3405k) entry.getValue()).a());
        }
        return C3738c.c(route, linkedHashMap);
    }

    private final int G() {
        C3830k<C3407m> c3830k = this.backQueue;
        int i10 = 0;
        if (c3830k == null || !c3830k.isEmpty()) {
            Iterator<C3407m> it = c3830k.iterator();
            while (it.hasNext()) {
                if (!(it.next().getDestination() instanceof C3416v) && (i10 = i10 + 1) < 0) {
                    r.v();
                }
            }
        }
        return i10;
    }

    private final C3416v L(C3830k<C3407m> c3830k) {
        C3414t destination;
        C3407m c3407mY = c3830k.y();
        if (c3407mY == null || (destination = c3407mY.getDestination()) == null) {
            destination = this._graph;
            C3862t.d(destination);
        }
        if (destination instanceof C3416v) {
            return (C3416v) destination;
        }
        C3416v parent = destination.getParent();
        C3862t.d(parent);
        return parent;
    }

    private final List<C3407m> N(C3830k<C3408n> backStackState) throws Resources.NotFoundException {
        C3414t c3414tH;
        ArrayList arrayList = new ArrayList();
        C3407m c3407mY = this.backQueue.y();
        if (c3407mY == null || (c3414tH = c3407mY.getDestination()) == null) {
            c3414tH = H();
        }
        if (backStackState != null) {
            for (C3408n c3408n : backStackState) {
                C3414t c3414tY = y(this, c3414tH, c3408n.getDestinationId(), true, null, 4, null);
                if (c3414tY == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + C3414t.INSTANCE.b(this.context, c3408n.getDestinationId()) + " cannot be found from the current destination " + c3414tH).toString());
                }
                arrayList.add(c3408n.c(this.context, c3414tY, I(), this.viewModel));
                c3414tH = c3414tY;
            }
        }
        return arrayList;
    }

    private final boolean O(C3414t node, Bundle args) {
        int iNextIndex;
        C3414t destination;
        C3407m c3407mE = E();
        C3830k<C3407m> c3830k = this.backQueue;
        ListIterator<C3407m> listIterator = c3830k.listIterator(c3830k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().getDestination() == node) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (node instanceof C3416v) {
            List listH = Tb.k.H(Tb.k.A(C3416v.INSTANCE.a((C3416v) node), m.f41732B));
            if (this.backQueue.size() - iNextIndex != listH.size()) {
                return false;
            }
            C3830k<C3407m> c3830k2 = this.backQueue;
            List<C3407m> listSubList = c3830k2.subList(iNextIndex, c3830k2.size());
            ArrayList arrayList = new ArrayList(r.x(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C3407m) it.next()).getDestination().getId()));
            }
            if (!C3862t.b(arrayList, listH)) {
                return false;
            }
        } else if (c3407mE == null || (destination = c3407mE.getDestination()) == null || node.getId() != destination.getId()) {
            return false;
        }
        C3830k<C3407m> c3830k3 = new C3830k();
        while (r.o(this.backQueue) >= iNextIndex) {
            C3407m c3407m = (C3407m) r.M(this.backQueue);
            v0(c3407m);
            c3830k3.addFirst(new C3407m(c3407m, c3407m.getDestination().j(args)));
        }
        for (C3407m c3407m2 : c3830k3) {
            C3416v parent = c3407m2.getDestination().getParent();
            if (parent != null) {
                Q(c3407m2, B(parent.getId()));
            }
            this.backQueue.add(c3407m2);
        }
        for (C3407m c3407m3 : c3830k3) {
            this._navigatorProvider.d(c3407m3.getDestination().getNavigatorName()).g(c3407m3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(C3410p this$0, InterfaceC2114v interfaceC2114v, AbstractC2106m.a event) {
        C3862t.g(this$0, "this$0");
        C3862t.g(interfaceC2114v, "<anonymous parameter 0>");
        C3862t.g(event, "event");
        this$0.hostLifecycleState = event.n();
        if (this$0._graph != null) {
            Iterator it = r.Z0(this$0.backQueue).iterator();
            while (it.hasNext()) {
                ((C3407m) it.next()).i(event);
            }
        }
    }

    private final void Q(C3407m child, C3407m parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(parent);
        C3862t.d(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    private final void V(C3414t node, Bundle args, C3420z navOptions, AbstractC3389F.a navigatorExtras) throws Resources.NotFoundException {
        boolean z10;
        boolean z11;
        boolean zG0;
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        K k10 = new K();
        if (navOptions == null) {
            z10 = false;
        } else {
            if (navOptions.getPopUpToRoute() != null) {
                String popUpToRoute = navOptions.getPopUpToRoute();
                C3862t.d(popUpToRoute);
                zG0 = i0(popUpToRoute, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.g() != null) {
                Ia.d<?> dVarG = navOptions.g();
                C3862t.d(dVarG);
                zG0 = g0(C3738c.b(ic.g.a(dVarG)), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteObject() != null) {
                Object popUpToRouteObject = navOptions.getPopUpToRouteObject();
                C3862t.d(popUpToRouteObject);
                zG0 = h0(popUpToRouteObject, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else {
                if (navOptions.getPopUpToId() != -1) {
                    zG0 = g0(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
                }
                z10 = false;
            }
            z10 = zG0;
        }
        Bundle bundleJ = node.j(args);
        if (navOptions != null && navOptions.getRestoreState() && this.backStackMap.containsKey(Integer.valueOf(node.getId()))) {
            k10.f43974B = o0(node.getId(), bundleJ, navOptions, navigatorExtras);
            z11 = false;
        } else {
            z11 = navOptions != null && navOptions.getSingleTop() && O(node, args);
            if (!z11) {
                X(this._navigatorProvider.d(node.getNavigatorName()), r.e(C3407m.Companion.b(C3407m.INSTANCE, this.context, node, bundleJ, I(), this.viewModel, null, null, 96, null)), navOptions, navigatorExtras, new o(k10, this, node, bundleJ));
            }
        }
        x0();
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        if (z10 || k10.f43974B || z11) {
            s();
        } else {
            w0();
        }
    }

    private final void X(AbstractC3389F<? extends C3414t> abstractC3389F, List<C3407m> list, C3420z c3420z, AbstractC3389F.a aVar, Ba.l<? super C3407m, C4153F> lVar) {
        this.addToBackStackHandler = lVar;
        abstractC3389F.e(list, c3420z, aVar);
        this.addToBackStackHandler = null;
    }

    private final void Y(Bundle startDestinationArgs) throws Resources.NotFoundException {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String name = it.next();
                C3390G c3390g = this._navigatorProvider;
                C3862t.f(name, "name");
                AbstractC3389F abstractC3389FD = c3390g.d(name);
                Bundle bundle2 = bundle.getBundle(name);
                if (bundle2 != null) {
                    abstractC3389FD.h(bundle2);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                C3862t.e(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                C3408n c3408n = (C3408n) parcelable;
                C3414t c3414tW = w(this, c3408n.getDestinationId(), null, 2, null);
                if (c3414tW == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + C3414t.INSTANCE.b(this.context, c3408n.getDestinationId()) + " cannot be found from the current destination " + F());
                }
                C3407m c3407mC = c3408n.c(this.context, c3414tW, I(), this.viewModel);
                AbstractC3389F<? extends C3414t> abstractC3389FD2 = this._navigatorProvider.d(c3414tW.getNavigatorName());
                Map<AbstractC3389F<? extends C3414t>, b> map = this.navigatorState;
                b bVar = map.get(abstractC3389FD2);
                if (bVar == null) {
                    bVar = new b(this, abstractC3389FD2);
                    map.put(abstractC3389FD2, bVar);
                }
                this.backQueue.add(c3407mC);
                bVar.o(c3407mC);
                C3416v parent = c3407mC.getDestination().getParent();
                if (parent != null) {
                    Q(c3407mC, B(parent.getId()));
                }
            }
            x0();
            this.backStackToRestore = null;
        }
        Collection<AbstractC3389F<? extends C3414t>> collectionValues = this._navigatorProvider.e().values();
        ArrayList<AbstractC3389F<? extends C3414t>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((AbstractC3389F) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (AbstractC3389F<? extends C3414t> abstractC3389F : arrayList) {
            Map<AbstractC3389F<? extends C3414t>, b> map2 = this.navigatorState;
            b bVar2 = map2.get(abstractC3389F);
            if (bVar2 == null) {
                bVar2 = new b(this, abstractC3389F);
                map2.put(abstractC3389F, bVar2);
            }
            abstractC3389F.f(bVar2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            s();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            C3862t.d(activity);
            if (M(activity.getIntent())) {
                return;
            }
        }
        C3416v c3416v = this._graph;
        C3862t.d(c3416v);
        V(c3416v, startDestinationArgs, null, null);
    }

    public static /* synthetic */ boolean d0(C3410p c3410p, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return c3410p.c0(str, z10, z11);
    }

    private final void f0(AbstractC3389F<? extends C3414t> abstractC3389F, C3407m c3407m, boolean z10, Ba.l<? super C3407m, C4153F> lVar) {
        this.popFromBackStackHandler = lVar;
        abstractC3389F.j(c3407m, z10);
        this.popFromBackStackHandler = null;
    }

    private final boolean g0(int destinationId, boolean inclusive, boolean saveState) throws Resources.NotFoundException {
        C3414t destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = r.H0(this.backQueue).iterator();
        while (true) {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((C3407m) it.next()).getDestination();
            AbstractC3389F abstractC3389FD = this._navigatorProvider.d(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(abstractC3389FD);
            }
            if (destination.getId() == destinationId) {
                break;
            }
        }
        if (destination != null) {
            return t(arrayList, destination, inclusive, saveState);
        }
        Log.i("NavController", "Ignoring popBackStack to destination " + C3414t.INSTANCE.b(this.context, destinationId) + " as it was not found on the current back stack");
        return false;
    }

    private final <T> boolean h0(T route, boolean inclusive, boolean saveState) {
        return i0(A(route), inclusive, saveState);
    }

    private final boolean i0(String route, boolean inclusive, boolean saveState) {
        C3407m c3407mPrevious;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        C3830k<C3407m> c3830k = this.backQueue;
        ListIterator<C3407m> listIterator = c3830k.listIterator(c3830k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c3407mPrevious = null;
                break;
            }
            c3407mPrevious = listIterator.previous();
            C3407m c3407m = c3407mPrevious;
            boolean zH = c3407m.getDestination().H(route, c3407m.d());
            if (inclusive || !zH) {
                arrayList.add(this._navigatorProvider.d(c3407m.getDestination().getNavigatorName()));
            }
            if (zH) {
                break;
            }
        }
        C3407m c3407m2 = c3407mPrevious;
        C3414t destination = c3407m2 != null ? c3407m2.getDestination() : null;
        if (destination != null) {
            return t(arrayList, destination, inclusive, saveState);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean j0(C3410p c3410p, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return c3410p.g0(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(C3407m popUpTo, boolean saveState, C3830k<C3408n> savedState) {
        C3411q c3411q;
        H<Set<C3407m>> hC;
        Set<C3407m> value;
        C3407m c3407mLast = this.backQueue.last();
        if (!C3862t.b(c3407mLast, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + c3407mLast.getDestination() + ')').toString());
        }
        r.M(this.backQueue);
        b bVar = this.navigatorState.get(get_navigatorProvider().d(c3407mLast.getDestination().getNavigatorName()));
        boolean z10 = true;
        if ((bVar == null || (hC = bVar.c()) == null || (value = hC.getValue()) == null || !value.contains(c3407mLast)) && !this.parentToChildCount.containsKey(c3407mLast)) {
            z10 = false;
        }
        AbstractC2106m.b state = c3407mLast.getLifecycle().getState();
        AbstractC2106m.b bVar2 = AbstractC2106m.b.CREATED;
        if (state.j(bVar2)) {
            if (saveState) {
                c3407mLast.n(bVar2);
                savedState.addFirst(new C3408n(c3407mLast));
            }
            if (z10) {
                c3407mLast.n(bVar2);
            } else {
                c3407mLast.n(AbstractC2106m.b.DESTROYED);
                v0(c3407mLast);
            }
        }
        if (saveState || z10 || (c3411q = this.viewModel) == null) {
            return;
        }
        c3411q.i(c3407mLast.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void l0(C3410p c3410p, C3407m c3407m, boolean z10, C3830k c3830k, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            c3830k = new C3830k();
        }
        c3410p.k0(c3407m, z10, c3830k);
    }

    private final boolean o0(int id2, Bundle args, C3420z navOptions, AbstractC3389F.a navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id2))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(id2));
        r.I(this.backStackMap.values(), new q(str));
        return u(N((C3830k) W.d(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(C3414t node, Bundle finalArgs, C3407m backStackEntry, List<C3407m> restoredEntries) {
        C3830k<C3407m> c3830k;
        C3414t destination;
        List<C3407m> list;
        C3407m c3407m;
        Bundle bundle;
        C3407m c3407mPrevious;
        C3416v c3416v;
        C3407m c3407mPrevious2;
        List<C3407m> list2;
        Bundle bundle2;
        Bundle bundle3 = finalArgs;
        C3407m c3407m2 = backStackEntry;
        List<C3407m> list3 = restoredEntries;
        C3414t destination2 = backStackEntry.getDestination();
        if (!(destination2 instanceof InterfaceC3400f)) {
            while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof InterfaceC3400f) && j0(this, this.backQueue.last().getDestination().getId(), true, false, 4, null)) {
            }
        }
        C3830k c3830k2 = new C3830k();
        C3407m c3407m3 = null;
        if (node instanceof C3416v) {
            C3414t c3414t = destination2;
            while (true) {
                C3862t.d(c3414t);
                C3416v parent = c3414t.getParent();
                if (parent != null) {
                    ListIterator<C3407m> listIterator = list3.listIterator(restoredEntries.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c3407mPrevious2 = listIterator.previous();
                            if (C3862t.b(c3407mPrevious2.getDestination(), parent)) {
                                break;
                            }
                        } else {
                            c3407mPrevious2 = null;
                            break;
                        }
                    }
                    C3407m c3407mB = c3407mPrevious2;
                    if (c3407mB == null) {
                        destination = destination2;
                        list2 = list3;
                        bundle2 = bundle3;
                        c3407m = c3407m2;
                        c3407mB = C3407m.Companion.b(C3407m.INSTANCE, this.context, parent, finalArgs, I(), this.viewModel, null, null, 96, null);
                    } else {
                        destination = destination2;
                        list2 = list3;
                        c3407m = c3407m2;
                        bundle2 = bundle3;
                    }
                    c3830k2.addFirst(c3407mB);
                    if (this.backQueue.isEmpty() || this.backQueue.last().getDestination() != parent) {
                        list = list2;
                        bundle = bundle2;
                        c3416v = parent;
                        c3830k = c3830k2;
                    } else {
                        list = list2;
                        bundle = bundle2;
                        c3416v = parent;
                        c3830k = c3830k2;
                        l0(this, this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    c3416v = parent;
                    c3830k = c3830k2;
                    destination = destination2;
                    list = list3;
                    c3407m = c3407m2;
                    bundle = bundle3;
                }
                if (c3416v == null || c3416v == node) {
                    break;
                }
                c3407m2 = c3407m;
                c3830k2 = c3830k;
                c3414t = c3416v;
                bundle3 = bundle;
                list3 = list;
                destination2 = destination;
            }
        } else {
            c3830k = c3830k2;
            destination = destination2;
            list = list3;
            c3407m = c3407m2;
            bundle = bundle3;
        }
        C3414t destination3 = c3830k.isEmpty() ? destination : ((C3407m) c3830k.first()).getDestination();
        while (destination3 != null && v(destination3.getId(), destination3) != destination3) {
            destination3 = destination3.getParent();
            if (destination3 != null) {
                Bundle bundle4 = (bundle == null || !finalArgs.isEmpty()) ? bundle : null;
                ListIterator<C3407m> listIterator2 = list.listIterator(restoredEntries.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        c3407mPrevious = listIterator2.previous();
                        if (C3862t.b(c3407mPrevious.getDestination(), destination3)) {
                            break;
                        }
                    } else {
                        c3407mPrevious = null;
                        break;
                    }
                }
                C3407m c3407mB2 = c3407mPrevious;
                if (c3407mB2 == null) {
                    c3407mB2 = C3407m.Companion.b(C3407m.INSTANCE, this.context, destination3, destination3.j(bundle4), I(), this.viewModel, null, null, 96, null);
                }
                c3830k.addFirst(c3407mB2);
            }
        }
        if (!c3830k.isEmpty()) {
            destination = ((C3407m) c3830k.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof C3416v)) {
            C3414t destination4 = this.backQueue.last().getDestination();
            C3862t.e(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((C3416v) destination4).a0().g(destination.getId()) != null) {
                break;
            } else {
                l0(this, this.backQueue.last(), false, null, 6, null);
            }
        }
        C3407m c3407mW = this.backQueue.w();
        if (c3407mW == null) {
            c3407mW = (C3407m) c3830k.w();
        }
        if (!C3862t.b(c3407mW != null ? c3407mW.getDestination() : null, this._graph)) {
            ListIterator<C3407m> listIterator3 = list.listIterator(restoredEntries.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                C3407m c3407mPrevious3 = listIterator3.previous();
                C3414t destination5 = c3407mPrevious3.getDestination();
                C3416v c3416v2 = this._graph;
                C3862t.d(c3416v2);
                if (C3862t.b(destination5, c3416v2)) {
                    c3407m3 = c3407mPrevious3;
                    break;
                }
            }
            C3407m c3407mB3 = c3407m3;
            if (c3407mB3 == null) {
                C3407m.Companion companion = C3407m.INSTANCE;
                Context context = this.context;
                C3416v c3416v3 = this._graph;
                C3862t.d(c3416v3);
                C3416v c3416v4 = this._graph;
                C3862t.d(c3416v4);
                c3407mB3 = C3407m.Companion.b(companion, context, c3416v3, c3416v4.j(bundle), I(), this.viewModel, null, null, 96, null);
            }
            c3830k.addFirst(c3407mB3);
        }
        for (C3407m c3407m4 : c3830k) {
            b bVar = this.navigatorState.get(this._navigatorProvider.d(c3407m4.getDestination().getNavigatorName()));
            if (bVar == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            bVar.o(c3407m4);
        }
        this.backQueue.addAll(c3830k);
        this.backQueue.add(c3407m);
        for (C3407m c3407m5 : r.G0(c3830k, c3407m)) {
            C3416v parent2 = c3407m5.getDestination().getParent();
            if (parent2 != null) {
                Q(c3407m5, B(parent2.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q(C3410p c3410p, C3414t c3414t, Bundle bundle, C3407m c3407m, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i10 & 8) != 0) {
            list = r.m();
        }
        c3410p.p(c3414t, bundle, c3407m, list);
    }

    private final boolean r(int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).m(true);
        }
        boolean zO0 = o0(destinationId, null, C3385B.a(e.f41713B), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).m(false);
        }
        return zO0 && g0(destinationId, true, false);
    }

    private final boolean s() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof C3416v)) {
            l0(this, this.backQueue.last(), false, null, 6, null);
        }
        C3407m c3407mY = this.backQueue.y();
        if (c3407mY != null) {
            this.backStackEntriesToDispatch.add(c3407mY);
        }
        this.dispatchReentrantCount++;
        w0();
        int i10 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i10;
        if (i10 == 0) {
            List<C3407m> listZ0 = r.Z0(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (C3407m c3407m : listZ0) {
                Iterator<c> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().a(this, c3407m.getDestination(), c3407m.d());
                }
                this._currentBackStackEntryFlow.i(c3407m);
            }
            this._currentBackStack.i(r.Z0(this.backQueue));
            this._visibleEntries.i(m0());
        }
        return c3407mY != null;
    }

    private final boolean t(List<? extends AbstractC3389F<?>> popOperations, C3414t foundDestination, boolean inclusive, boolean saveState) {
        K k10 = new K();
        C3830k<C3408n> c3830k = new C3830k<>();
        Iterator<? extends AbstractC3389F<?>> it = popOperations.iterator();
        while (it.hasNext()) {
            AbstractC3389F<? extends C3414t> abstractC3389F = (AbstractC3389F) it.next();
            K k11 = new K();
            f0(abstractC3389F, this.backQueue.last(), saveState, new f(k11, k10, this, saveState, c3830k));
            if (!k11.f43974B) {
                break;
            }
        }
        if (saveState) {
            if (!inclusive) {
                for (C3414t c3414t : Tb.k.F(Tb.k.i(foundDestination, g.f41719B), new h())) {
                    Map<Integer, String> map = this.backStackMap;
                    Integer numValueOf = Integer.valueOf(c3414t.getId());
                    C3408n c3408nW = c3830k.w();
                    map.put(numValueOf, c3408nW != null ? c3408nW.getId() : null);
                }
            }
            if (!c3830k.isEmpty()) {
                C3408n c3408nFirst = c3830k.first();
                Iterator it2 = Tb.k.F(Tb.k.i(w(this, c3408nFirst.getDestinationId(), null, 2, null), i.f41721B), new j()).iterator();
                while (it2.hasNext()) {
                    this.backStackMap.put(Integer.valueOf(((C3414t) it2.next()).getId()), c3408nFirst.getId());
                }
                if (this.backStackMap.values().contains(c3408nFirst.getId())) {
                    this.backStackStates.put(c3408nFirst.getId(), c3830k);
                }
            }
        }
        x0();
        return k10.f43974B;
    }

    private final boolean u(List<C3407m> entries, Bundle args, C3420z navOptions, AbstractC3389F.a navigatorExtras) {
        C3407m c3407m;
        C3414t destination;
        ArrayList<List<C3407m>> arrayList = new ArrayList();
        ArrayList<C3407m> arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (!(((C3407m) obj).getDestination() instanceof C3416v)) {
                arrayList2.add(obj);
            }
        }
        for (C3407m c3407m2 : arrayList2) {
            List list = (List) r.w0(arrayList);
            if (C3862t.b((list == null || (c3407m = (C3407m) r.u0(list)) == null || (destination = c3407m.getDestination()) == null) ? null : destination.getNavigatorName(), c3407m2.getDestination().getNavigatorName())) {
                list.add(c3407m2);
            } else {
                arrayList.add(r.s(c3407m2));
            }
        }
        K k10 = new K();
        for (List<C3407m> list2 : arrayList) {
            X(this._navigatorProvider.d(((C3407m) r.j0(list2)).getDestination().getNavigatorName()), list2, navOptions, navigatorExtras, new k(k10, entries, new M(), this, args));
        }
        return k10.f43974B;
    }

    public static /* synthetic */ C3414t w(C3410p c3410p, int i10, C3414t c3414t, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i11 & 2) != 0) {
            c3414t = null;
        }
        return c3410p.v(i10, c3414t);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void x0() {
        /*
            r3 = this;
            d.F r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.G()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C3410p.x0():void");
    }

    public static /* synthetic */ C3414t y(C3410p c3410p, C3414t c3414t, int i10, boolean z10, C3414t c3414t2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i11 & 4) != 0) {
            c3414t2 = null;
        }
        return c3410p.x(c3414t, i10, z10, c3414t2);
    }

    private final String z(int[] deepLink) {
        C3416v c3416v;
        C3416v c3416v2 = this._graph;
        int length = deepLink.length;
        int i10 = 0;
        while (true) {
            C3414t c3414tT = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = deepLink[i10];
            if (i10 == 0) {
                C3416v c3416v3 = this._graph;
                C3862t.d(c3416v3);
                if (c3416v3.getId() == i11) {
                    c3414tT = this._graph;
                }
            } else {
                C3862t.d(c3416v2);
                c3414tT = c3416v2.T(i11);
            }
            if (c3414tT == null) {
                return C3414t.INSTANCE.b(this.context, i11);
            }
            if (i10 != deepLink.length - 1 && (c3414tT instanceof C3416v)) {
                while (true) {
                    c3416v = (C3416v) c3414tT;
                    C3862t.d(c3416v);
                    if (!(c3416v.T(c3416v.getStartDestId()) instanceof C3416v)) {
                        break;
                    }
                    c3414tT = c3416v.T(c3416v.getStartDestId());
                }
                c3416v2 = c3416v;
            }
            i10++;
        }
    }

    public C3407m B(int destinationId) {
        C3407m c3407mPrevious;
        C3830k<C3407m> c3830k = this.backQueue;
        ListIterator<C3407m> listIterator = c3830k.listIterator(c3830k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c3407mPrevious = null;
                break;
            }
            c3407mPrevious = listIterator.previous();
            if (c3407mPrevious.getDestination().getId() == destinationId) {
                break;
            }
        }
        C3407m c3407m = c3407mPrevious;
        if (c3407m != null) {
            return c3407m;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + F()).toString());
    }

    /* renamed from: C, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final H<List<C3407m>> D() {
        return this.currentBackStack;
    }

    public C3407m E() {
        return this.backQueue.y();
    }

    public C3414t F() {
        C3407m c3407mE = E();
        if (c3407mE != null) {
            return c3407mE.getDestination();
        }
        return null;
    }

    public C3416v H() {
        C3416v c3416v = this._graph;
        if (c3416v == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        C3862t.e(c3416v, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return c3416v;
    }

    public final AbstractC2106m.b I() {
        return this.lifecycleOwner == null ? AbstractC2106m.b.CREATED : this.hostLifecycleState;
    }

    public C3419y J() {
        return (C3419y) this.navInflater.getValue();
    }

    /* renamed from: K, reason: from getter */
    public C3390G get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public boolean M(Intent intent) throws Resources.NotFoundException {
        int[] intArray;
        C3416v c3416vL;
        C3414t.b bVarE0;
        C3414t c3414tT;
        C3416v c3416v;
        Bundle bundle;
        int i10 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e10) {
                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if ((intArray == null || intArray.length == 0) && (bVarE0 = (c3416vL = L(this.backQueue)).e0(new C3413s(intent), true, true, c3416vL)) != null) {
            C3414t destination = bVarE0.getDestination();
            int[] iArrX = C3414t.x(destination, null, 1, null);
            Bundle bundleJ = destination.j(bVarE0.getMatchingArgs());
            if (bundleJ != null) {
                bundle2.putAll(bundleJ);
            }
            intArray = iArrX;
            parcelableArrayList = null;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strZ = z(intArray);
        if (strZ != null) {
            Log.i("NavController", "Could not find destination " + strZ + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i11 = 0; i11 < length; i11++) {
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle2);
            if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i11)) != null) {
                bundle4.putAll(bundle);
            }
            bundleArr[i11] = bundle4;
        }
        int flags = intent.getFlags();
        int i12 = 268435456 & flags;
        if (i12 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            f1.z zVarF = f1.z.j(this.context).f(intent);
            C3862t.f(zVarF, "create(context).addNextI…ntWithParentStack(intent)");
            zVarF.r();
            Activity activity = this.activity;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i12 != 0) {
            if (!this.backQueue.isEmpty()) {
                C3416v c3416v2 = this._graph;
                C3862t.d(c3416v2);
                j0(this, c3416v2.getId(), true, false, 4, null);
            }
            while (i10 < intArray.length) {
                int i13 = intArray[i10];
                int i14 = i10 + 1;
                Bundle bundle5 = bundleArr[i10];
                C3414t c3414tW = w(this, i13, null, 2, null);
                if (c3414tW == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + C3414t.INSTANCE.b(this.context, i13) + " cannot be found from the current destination " + F());
                }
                V(c3414tW, bundle5, C3385B.a(new l(c3414tW, this)), null);
                i10 = i14;
            }
            this.deepLinkHandled = true;
            return true;
        }
        C3416v c3416v3 = this._graph;
        int length2 = intArray.length;
        for (int i15 = 0; i15 < length2; i15++) {
            int i16 = intArray[i15];
            Bundle bundle6 = bundleArr[i15];
            if (i15 == 0) {
                c3414tT = this._graph;
            } else {
                C3862t.d(c3416v3);
                c3414tT = c3416v3.T(i16);
            }
            if (c3414tT == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + C3414t.INSTANCE.b(this.context, i16) + " cannot be found in graph " + c3416v3);
            }
            if (i15 == intArray.length - 1) {
                C3420z.a aVar = new C3420z.a();
                C3416v c3416v4 = this._graph;
                C3862t.d(c3416v4);
                V(c3414tT, bundle6, C3420z.a.k(aVar, c3416v4.getId(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (c3414tT instanceof C3416v) {
                while (true) {
                    c3416v = (C3416v) c3414tT;
                    C3862t.d(c3416v);
                    if (!(c3416v.T(c3416v.getStartDestId()) instanceof C3416v)) {
                        break;
                    }
                    c3414tT = c3416v.T(c3416v.getStartDestId());
                }
                c3416v3 = c3416v;
            }
        }
        this.deepLinkHandled = true;
        return true;
    }

    public void R(int resId) throws Resources.NotFoundException {
        S(resId, null);
    }

    public void S(int resId, Bundle args) throws Resources.NotFoundException {
        T(resId, args, null);
    }

    public void T(int resId, Bundle args, C3420z navOptions) throws Resources.NotFoundException {
        U(resId, args, navOptions, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void U(int r12, android.os.Bundle r13, kotlin.C3420z r14, kotlin.AbstractC3389F.a r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C3410p.U(int, android.os.Bundle, g3.z, g3.F$a):void");
    }

    public void W(InterfaceC3415u directions) throws Resources.NotFoundException {
        C3862t.g(directions, "directions");
        T(directions.getActionId(), directions.getArguments(), null);
    }

    public boolean Z() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        C3414t c3414tF = F();
        C3862t.d(c3414tF);
        return a0(c3414tF.getId(), true);
    }

    public boolean a0(int destinationId, boolean inclusive) {
        return b0(destinationId, inclusive, false);
    }

    public boolean b0(int destinationId, boolean inclusive, boolean saveState) {
        return g0(destinationId, inclusive, saveState) && s();
    }

    public final boolean c0(String route, boolean inclusive, boolean saveState) {
        C3862t.g(route, "route");
        return i0(route, inclusive, saveState) && s();
    }

    public final void e0(C3407m popUpTo, a<C4153F> onComplete) throws Resources.NotFoundException {
        C3862t.g(popUpTo, "popUpTo");
        C3862t.g(onComplete, "onComplete");
        int iIndexOf = this.backQueue.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != this.backQueue.size()) {
            g0(this.backQueue.get(i10).getDestination().getId(), true, false);
        }
        l0(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        x0();
        s();
    }

    public final List<C3407m> m0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<C3407m> value = ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                C3407m c3407m = (C3407m) obj;
                if (!arrayList.contains(c3407m) && !c3407m.getMaxLifecycle().j(AbstractC2106m.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            r.D(arrayList, arrayList2);
        }
        C3830k<C3407m> c3830k = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (C3407m c3407m2 : c3830k) {
            C3407m c3407m3 = c3407m2;
            if (!arrayList.contains(c3407m3) && c3407m3.getMaxLifecycle().j(AbstractC2106m.b.STARTED)) {
                arrayList3.add(c3407m2);
            }
        }
        r.D(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((C3407m) obj2).getDestination() instanceof C3416v)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void n0(Bundle navState) {
        if (navState == null) {
            return;
        }
        navState.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = navState.getBundle("android-support-nav:controller:navigatorState");
        this.backStackToRestore = navState.getParcelableArray("android-support-nav:controller:backStack");
        this.backStackStates.clear();
        int[] intArray = navState.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = navState.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                i10++;
                i11++;
            }
        }
        ArrayList<String> stringArrayList2 = navState.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = navState.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                if (parcelableArray != null) {
                    Map<String, C3830k<C3408n>> map = this.backStackStates;
                    C3862t.f(id2, "id");
                    C3830k<C3408n> c3830k = new C3830k<>(parcelableArray.length);
                    Iterator itA = C3846c.a(parcelableArray);
                    while (itA.hasNext()) {
                        Parcelable parcelable = (Parcelable) itA.next();
                        C3862t.e(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        c3830k.add((C3408n) parcelable);
                    }
                    map.put(id2, c3830k);
                }
            }
        }
        this.deepLinkHandled = navState.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle p0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, AbstractC3389F<? extends C3414t>> entry : this._navigatorProvider.e().entrySet()) {
            String key = entry.getKey();
            Bundle bundleI = entry.getValue().i();
            if (bundleI != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleI);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.backQueue.size()];
            Iterator<C3407m> it = this.backQueue.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new C3408n(it.next());
                i10++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i11] = iIntValue;
                arrayList2.add(value);
                i11++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, C3830k<C3408n>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                C3830k<C3408n> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i12 = 0;
                for (C3408n c3408n : value2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        r.w();
                    }
                    parcelableArr2[i12] = c3408n;
                    i12 = i13;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + key2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundle;
    }

    public void q0(int graphResId) {
        s0(J().b(graphResId), null);
    }

    public void r0(int graphResId, Bundle startDestinationArgs) {
        s0(J().b(graphResId), startDestinationArgs);
    }

    public void s0(C3416v graph, Bundle startDestinationArgs) {
        C3862t.g(graph, "graph");
        if (!this.backQueue.isEmpty() && I() == AbstractC2106m.b.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (!C3862t.b(this._graph, graph)) {
            C3416v c3416v = this._graph;
            if (c3416v != null) {
                for (Integer id2 : new ArrayList(this.backStackMap.keySet())) {
                    C3862t.f(id2, "id");
                    r(id2.intValue());
                }
                j0(this, c3416v.getId(), true, false, 4, null);
            }
            this._graph = graph;
            Y(startDestinationArgs);
            return;
        }
        int iQ = graph.a0().q();
        for (int i10 = 0; i10 < iQ; i10++) {
            C3414t c3414tR = graph.a0().r(i10);
            C3416v c3416v2 = this._graph;
            C3862t.d(c3416v2);
            int iM = c3416v2.a0().m(i10);
            C3416v c3416v3 = this._graph;
            C3862t.d(c3416v3);
            c3416v3.a0().p(iM, c3414tR);
        }
        for (C3407m c3407m : this.backQueue) {
            List<C3414t> listS = r.S(Tb.k.H(C3414t.INSTANCE.c(c3407m.getDestination())));
            C3414t c3414tT = this._graph;
            C3862t.d(c3414tT);
            for (C3414t c3414t : listS) {
                if (!C3862t.b(c3414t, this._graph) || !C3862t.b(c3414tT, graph)) {
                    if (c3414tT instanceof C3416v) {
                        c3414tT = ((C3416v) c3414tT).T(c3414t.getId());
                        C3862t.d(c3414tT);
                    }
                }
            }
            c3407m.k(c3414tT);
        }
    }

    public void t0(InterfaceC2114v owner) {
        AbstractC2106m lifecycle;
        C3862t.g(owner, "owner");
        if (C3862t.b(owner, this.lifecycleOwner)) {
            return;
        }
        InterfaceC2114v interfaceC2114v = this.lifecycleOwner;
        if (interfaceC2114v != null && (lifecycle = interfaceC2114v.getLifecycle()) != null) {
            lifecycle.d(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().a(this.lifecycleObserver);
    }

    public void u0(b0 viewModelStore) {
        C3862t.g(viewModelStore, "viewModelStore");
        C3411q c3411q = this.viewModel;
        C3411q.Companion companion = C3411q.INSTANCE;
        if (C3862t.b(c3411q, companion.a(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = companion.a(viewModelStore);
    }

    public final C3414t v(int destinationId, C3414t matchingDest) {
        C3414t destination;
        C3416v c3416v = this._graph;
        if (c3416v == null) {
            return null;
        }
        C3862t.d(c3416v);
        if (c3416v.getId() == destinationId) {
            if (matchingDest == null) {
                return this._graph;
            }
            if (C3862t.b(this._graph, matchingDest) && matchingDest.getParent() == null) {
                return this._graph;
            }
        }
        C3407m c3407mY = this.backQueue.y();
        if (c3407mY == null || (destination = c3407mY.getDestination()) == null) {
            destination = this._graph;
            C3862t.d(destination);
        }
        return x(destination, destinationId, false, matchingDest);
    }

    public final C3407m v0(C3407m child) {
        C3862t.g(child, "child");
        C3407m c3407mRemove = this.childToParentEntries.remove(child);
        if (c3407mRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(c3407mRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            b bVar = this.navigatorState.get(this._navigatorProvider.d(c3407mRemove.getDestination().getNavigatorName()));
            if (bVar != null) {
                bVar.e(c3407mRemove);
            }
            this.parentToChildCount.remove(c3407mRemove);
        }
        return c3407mRemove;
    }

    public final void w0() {
        AtomicInteger atomicInteger;
        H<Set<C3407m>> hC;
        Set<C3407m> value;
        List<C3407m> listZ0 = r.Z0(this.backQueue);
        if (listZ0.isEmpty()) {
            return;
        }
        C3414t destination = ((C3407m) r.u0(listZ0)).getDestination();
        ArrayList arrayList = new ArrayList();
        if (destination instanceof InterfaceC3400f) {
            Iterator it = r.H0(listZ0).iterator();
            while (it.hasNext()) {
                C3414t destination2 = ((C3407m) it.next()).getDestination();
                arrayList.add(destination2);
                if (!(destination2 instanceof InterfaceC3400f) && !(destination2 instanceof C3416v)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C3407m c3407m : r.H0(listZ0)) {
            AbstractC2106m.b maxLifecycle = c3407m.getMaxLifecycle();
            C3414t destination3 = c3407m.getDestination();
            if (destination != null && destination3.getId() == destination.getId()) {
                AbstractC2106m.b bVar = AbstractC2106m.b.RESUMED;
                if (maxLifecycle != bVar) {
                    b bVar2 = this.navigatorState.get(get_navigatorProvider().d(c3407m.getDestination().getNavigatorName()));
                    if (C3862t.b((bVar2 == null || (hC = bVar2.c()) == null || (value = hC.getValue()) == null) ? null : Boolean.valueOf(value.contains(c3407m)), Boolean.TRUE) || ((atomicInteger = this.parentToChildCount.get(c3407m)) != null && atomicInteger.get() == 0)) {
                        map.put(c3407m, AbstractC2106m.b.STARTED);
                    } else {
                        map.put(c3407m, bVar);
                    }
                }
                C3414t c3414t = (C3414t) r.l0(arrayList);
                if (c3414t != null && c3414t.getId() == destination3.getId()) {
                    r.K(arrayList);
                }
                destination = destination.getParent();
            } else if (arrayList.isEmpty() || destination3.getId() != ((C3414t) r.j0(arrayList)).getId()) {
                c3407m.n(AbstractC2106m.b.CREATED);
            } else {
                C3414t c3414t2 = (C3414t) r.K(arrayList);
                if (maxLifecycle == AbstractC2106m.b.RESUMED) {
                    c3407m.n(AbstractC2106m.b.STARTED);
                } else {
                    AbstractC2106m.b bVar3 = AbstractC2106m.b.STARTED;
                    if (maxLifecycle != bVar3) {
                        map.put(c3407m, bVar3);
                    }
                }
                C3416v parent = c3414t2.getParent();
                if (parent != null && !arrayList.contains(parent)) {
                    arrayList.add(parent);
                }
            }
        }
        for (C3407m c3407m2 : listZ0) {
            AbstractC2106m.b bVar4 = (AbstractC2106m.b) map.get(c3407m2);
            if (bVar4 != null) {
                c3407m2.n(bVar4);
            } else {
                c3407m2.o();
            }
        }
    }

    public final C3414t x(C3414t c3414t, int i10, boolean z10, C3414t c3414t2) {
        C3416v c3416v;
        C3862t.g(c3414t, "<this>");
        if (c3414t.getId() == i10 && (c3414t2 == null || (C3862t.b(c3414t, c3414t2) && C3862t.b(c3414t.getParent(), c3414t2.getParent())))) {
            return c3414t;
        }
        if (c3414t instanceof C3416v) {
            c3416v = (C3416v) c3414t;
        } else {
            C3416v parent = c3414t.getParent();
            C3862t.d(parent);
            c3416v = parent;
        }
        return c3416v.Y(i10, c3416v, z10, c3414t2);
    }
}
