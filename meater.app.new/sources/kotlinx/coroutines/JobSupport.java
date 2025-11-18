package kotlinx.coroutines;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10775u;
import kotlin.C9821b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.coroutines.p442j.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9788f0;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.C10976d0;
import kotlinx.coroutines.internal.C10998q;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import okhttp3.HttpUrl;

/* compiled from: JobSupport.kt */
@Metadata(m32266d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u00002\u00020X2\u00020\u00172\u00020\u007f2\u00030Ã\u0001:\u0006Ò\u0001Ó\u0001Ô\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b!\u0010%J\u0017\u0010&\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\r¢\u0006\u0004\b&\u0010\"J\u0019\u0010)\u001a\u00020\u00012\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\"J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b2\u0010\"J!\u00105\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u0002072\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010=\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b=\u0010>J(\u0010C\u001a\u00020@2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\rH\u0080\b¢\u0006\u0004\bA\u0010BJ#\u0010D\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0004\u0018\u0001082\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bF\u0010GJ\u0011\u0010H\u001a\u00060#j\u0002`$¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00060#j\u0002`$H\u0016¢\u0006\u0004\bJ\u0010IJ\u0011\u0010M\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bN\u0010OJ'\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u0002072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u000203H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020\u00012\u0006\u0010T\u001a\u00020\rH\u0014¢\u0006\u0004\bU\u0010\"J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020\rH\u0010¢\u0006\u0004\bV\u0010+J\u0019\u0010Z\u001a\u00020\u00112\b\u0010Y\u001a\u0004\u0018\u00010XH\u0004¢\u0006\u0004\bZ\u0010[JF\u0010d\u001a\u00020c2\u0006\u0010\\\u001a\u00020\u00012\u0006\u0010]\u001a\u00020\u00012'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010eJ6\u0010d\u001a\u00020c2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a¢\u0006\u0004\bd\u0010fJ\u0013\u0010g\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\bg\u0010\u001dJ\u000f\u0010h\u001a\u00020\u0001H\u0002¢\u0006\u0004\bh\u0010iJ\u0013\u0010j\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\bj\u0010\u001dJ&\u0010m\u001a\u00020l2\u0014\u0010k\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00110^H\u0082\b¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\bo\u0010-J\u0019\u0010q\u001a\u00020\u00012\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\bp\u0010(J\u001b\u0010s\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\br\u0010-J@\u0010t\u001a\u00020\t2'\u0010b\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b_\u0012\b\b`\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00110^j\u0002`a2\u0006\u0010\\\u001a\u00020\u0001H\u0002¢\u0006\u0004\bt\u0010uJ\u000f\u0010w\u001a\u00020/H\u0010¢\u0006\u0004\bv\u00101J\u001f\u0010x\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\bx\u0010yJ.\u0010{\u001a\u00020\u0011\"\n\b\u0000\u0010z\u0018\u0001*\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0082\b¢\u0006\u0004\b{\u0010yJ\u0019\u0010\\\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\\\u0010+J\u0019\u0010|\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b|\u0010\u0016J\u000f\u0010}\u001a\u00020\u0011H\u0014¢\u0006\u0004\b}\u0010~J\u0019\u0010\u0081\u0001\u001a\u00020\u00112\u0007\u0010\u0080\u0001\u001a\u00020\u007f¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020\u00112\u0007\u0010\u0014\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001JI\u0010\u008c\u0001\u001a\u00020\u0011\"\u0005\b\u0000\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u00012\u001d\u0010k\u001a\u0019\b\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050^ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001JX\u0010\u0091\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0093\u0001\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0087\u0001JX\u0010\u0095\u0001\u001a\u00020\u0011\"\u0004\b\u0000\u0010z\"\u0005\b\u0001\u0010\u0088\u00012\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u00012$\u0010k\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00010\u008b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u008e\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0094\u0001\u0010\u0090\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\u0001¢\u0006\u0005\b\u0096\u0001\u0010iJ\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u00020/2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009c\u0001\u001a\u00020/H\u0007¢\u0006\u0005\b\u009c\u0001\u00101J\u0011\u0010\u009d\u0001\u001a\u00020/H\u0016¢\u0006\u0005\b\u009d\u0001\u00101J$\u0010\u009e\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\"\u0010 \u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J(\u0010¢\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J&\u0010¤\u0001\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J-\u0010¦\u0001\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u0002072\u0006\u0010\u0018\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0082\u0010¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010©\u0001\u001a\u0004\u0018\u000108*\u00030¨\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001f\u0010«\u0001\u001a\u00020\u0011*\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0005\b«\u0001\u0010yJ&\u0010¬\u0001\u001a\u00060#j\u0002`$*\u00020\r2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010/H\u0004¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001R\u001b\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020X0®\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010³\u0001\u001a\u0004\u0018\u00010\r8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010OR\u0016\u0010µ\u0001\u001a\u00020\u00018DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010iR\u0016\u0010·\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010iR\u0016\u0010¸\u0001\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010iR\u0013\u0010¹\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010iR\u0013\u0010º\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\bº\u0001\u0010iR\u0013\u0010»\u0001\u001a\u00020\u00018F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010iR\u0016\u0010¼\u0001\u001a\u00020\u00018TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010iR\u0019\u0010À\u0001\u001a\u0007\u0012\u0002\b\u00030½\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010Â\u0001\u001a\u00020\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010iR\u0015\u0010Æ\u0001\u001a\u00030Ã\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R.\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00192\t\u0010Ç\u0001\u001a\u0004\u0018\u00010\u00198@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00058@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010LR\u001e\u0010Ï\u0001\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010>R\u001b\u0010Ð\u0001\u001a\u00020\u0001*\u0002038BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Õ\u0001"}, m32267d2 = {"Lkotlinx/coroutines/JobSupport;", HttpUrl.FRAGMENT_ENCODE_SET, "active", "<init>", "(Z)V", HttpUrl.FRAGMENT_ENCODE_SET, "expect", "Lkotlinx/coroutines/NodeList;", "list", "Lkotlinx/coroutines/JobNode;", "node", "addLastAtomic", "(Ljava/lang/Object;Lkotlinx/coroutines/NodeList;Lkotlinx/coroutines/JobNode;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "rootCause", HttpUrl.FRAGMENT_ENCODE_SET, "exceptions", HttpUrl.FRAGMENT_ENCODE_SET, "addSuppressedExceptions", "(Ljava/lang/Throwable;Ljava/util/List;)V", "state", "afterCompletion", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/ChildJob;", "child", "Lkotlinx/coroutines/ChildHandle;", "attachChild", "(Lkotlinx/coroutines/ChildJob;)Lkotlinx/coroutines/ChildHandle;", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitInternal", "awaitSuspend", "cause", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "(Ljava/util/concurrent/CancellationException;)V", "cancelCoroutine", "cancelImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "cancelImpl", "cancelInternal", "(Ljava/lang/Throwable;)V", "cancelMakeCompleting", "(Ljava/lang/Object;)Ljava/lang/Object;", "cancelParent", HttpUrl.FRAGMENT_ENCODE_SET, "cancellationExceptionMessage", "()Ljava/lang/String;", "childCancelled", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)V", "Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/ChildHandleNode;", "lastChild", "proposedUpdate", "continueCompleting", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "createCauseException", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "message", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException", "finalizeFinishingState", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/lang/Object;)Ljava/lang/Object;", "firstChild", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/ChildHandleNode;", "getCancellationException", "()Ljava/util/concurrent/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal$kotlinx_coroutines_core", "()Ljava/lang/Object;", "getCompletedInternal", "getCompletionExceptionOrNull", "()Ljava/lang/Throwable;", "getFinalRootCause", "(Lkotlinx/coroutines/JobSupport$Finishing;Ljava/util/List;)Ljava/lang/Throwable;", "getOrPromoteCancellingList", "(Lkotlinx/coroutines/Incomplete;)Lkotlinx/coroutines/NodeList;", "exception", "handleJobException", "handleOnCompletionException$kotlinx_coroutines_core", "handleOnCompletionException", "Lkotlinx/coroutines/Job;", "parent", "initParentJob", "(Lkotlinx/coroutines/Job;)V", "onCancelling", "invokeImmediately", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "join", "joinInternal", "()Z", "joinSuspend", "block", HttpUrl.FRAGMENT_ENCODE_SET, "loopOnState", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "makeCancelling", "makeCompleting$kotlinx_coroutines_core", "makeCompleting", "makeCompletingOnce$kotlinx_coroutines_core", "makeCompletingOnce", "makeNode", "(Lkotlin/jvm/functions/Function1;Z)Lkotlinx/coroutines/JobNode;", "nameString$kotlinx_coroutines_core", "nameString", "notifyCancelling", "(Lkotlinx/coroutines/NodeList;Ljava/lang/Throwable;)V", "T", "notifyHandlers", "onCompletionInternal", "onStart", "()V", "Lkotlinx/coroutines/ParentJob;", "parentJob", "parentCancelled", "(Lkotlinx/coroutines/ParentJob;)V", "Lkotlinx/coroutines/Empty;", "promoteEmptyToNodeList", "(Lkotlinx/coroutines/Empty;)V", "promoteSingleToNodeList", "(Lkotlinx/coroutines/JobNode;)V", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/coroutines/Continuation;", "registerSelectClause0", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "registerSelectClause1Internal", "removeNode$kotlinx_coroutines_core", "removeNode", "selectAwaitCompletion$kotlinx_coroutines_core", "selectAwaitCompletion", "start", HttpUrl.FRAGMENT_ENCODE_SET, "startInternal", "(Ljava/lang/Object;)I", "stateString", "(Ljava/lang/Object;)Ljava/lang/String;", "toDebugString", "toString", "tryFinalizeSimpleState", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Z", "tryMakeCancelling", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Throwable;)Z", "tryMakeCompleting", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryMakeCompletingSlowPath", "(Lkotlinx/coroutines/Incomplete;Ljava/lang/Object;)Ljava/lang/Object;", "tryWaitForChild", "(Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "nextChild", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/ChildHandleNode;", "notifyCompletion", "toCancellationException", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "children", "getCompletionCause", "completionCause", "getCompletionCauseHandled", "completionCauseHandled", "getHandlesException$kotlinx_coroutines_core", "handlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "isScopedCoroutine", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", RoomNotification.KEY, "getOnCancelComplete$kotlinx_coroutines_core", "onCancelComplete", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "onJoin", "value", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parentHandle", "getState$kotlinx_coroutines_core", "getExceptionOrNull", "exceptionOrNull", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.f2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public class JobSupport implements Job, ChildJob, ParentJob {

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41710f = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    @Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", HttpUrl.FRAGMENT_ENCODE_SET, "parent", "Lkotlinx/coroutines/Job;", "nameString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.f2$a */
    private static final class a<T> extends CancellableContinuationImpl<T> {

        /* renamed from: n */
        private final JobSupport f41711n;

        public a(Continuation<? super T> continuation, JobSupport jobSupport) {
            super(continuation, 1);
            this.f41711n = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        /* renamed from: F */
        protected String mo39368F() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        /* renamed from: v */
        public Throwable mo39369v(Job job) {
            Throwable thM39374f;
            Object objM39350X = this.f41711n.m39350X();
            return (!(objM39350X instanceof c) || (thM39374f = ((c) objM39350X).m39374f()) == null) ? objM39350X instanceof CompletedExceptionally ? ((CompletedExceptionally) objM39350X).f41577b : job.mo39357j() : thM39374f;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m32267d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.f2$b */
    private static final class b extends JobNode {

        /* renamed from: j */
        private final JobSupport f41712j;

        /* renamed from: k */
        private final c f41713k;

        /* renamed from: l */
        private final ChildHandleNode f41714l;

        /* renamed from: m */
        private final Object f41715m;

        public b(JobSupport jobSupport, c cVar, ChildHandleNode childHandleNode, Object obj) {
            this.f41712j = jobSupport;
            this.f41713k = cVar;
            this.f41714l = childHandleNode;
            this.f41715m = obj;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: E */
        public void mo39270E(Throwable th) {
            this.f41712j.m39318N(this.f41713k, this.f41714l, this.f41715m);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            mo39270E(th);
            return C10775u.f41439a;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(m32266d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00060\u0018j\u0002`,2\u00020-B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\rj\b\u0012\u0004\u0012\u00020\u0005`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010 \"\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0002\u0010%\u001a\u0004\b&\u0010'R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\f¨\u0006+"}, m32267d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/NodeList;", "list", HttpUrl.FRAGMENT_ENCODE_SET, "isCompleting", HttpUrl.FRAGMENT_ENCODE_SET, "rootCause", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "exception", HttpUrl.FRAGMENT_ENCODE_SET, "addExceptionLocked", "(Ljava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "allocateList", "()Ljava/util/ArrayList;", "proposedException", HttpUrl.FRAGMENT_ENCODE_SET, "sealLocked", "(Ljava/lang/Throwable;)Ljava/util/List;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "value", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "exceptionsHolder", "isActive", "()Z", "isCancelling", "setCompleting", "(Z)V", "isSealed", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.f2$c */
    private static final class c implements Incomplete {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: f */
        private final NodeList f41716f;

        public c(NodeList nodeList, boolean z, Throwable th) {
            this.f41716f = nodeList;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: c */
        private final ArrayList<Throwable> m39370c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d, reason: from getter */
        private final Object get_exceptionsHolder() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m39372l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void m39373a(Throwable th) {
            Throwable thM39374f = m39374f();
            if (thM39374f == null) {
                m39380m(th);
                return;
            }
            if (th == thM39374f) {
                return;
            }
            Object obj = get_exceptionsHolder();
            if (obj == null) {
                m39372l(th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList<Throwable> arrayListM39370c = m39370c();
                arrayListM39370c.add(obj);
                arrayListM39370c.add(th);
                m39372l(arrayListM39370c);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + obj).toString());
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: b */
        public boolean getF41754f() {
            return m39374f() == null;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: e, reason: from getter */
        public NodeList getF41883f() {
            return this.f41716f;
        }

        /* renamed from: f */
        public final Throwable m39374f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean m39375g() {
            return m39374f() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: h */
        public final boolean m39376h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean m39377i() {
            return get_exceptionsHolder() == C10960g2.f41747e;
        }

        /* renamed from: j */
        public final List<Throwable> m39378j(Throwable th) {
            ArrayList<Throwable> arrayListM39370c;
            Object obj = get_exceptionsHolder();
            if (obj == null) {
                arrayListM39370c = m39370c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> arrayListM39370c2 = m39370c();
                arrayListM39370c2.add(obj);
                arrayListM39370c = arrayListM39370c2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayListM39370c = (ArrayList) obj;
            }
            Throwable thM39374f = m39374f();
            if (thM39374f != null) {
                arrayListM39370c.add(0, thM39374f);
            }
            if (th != null && !C9801m.m32341a(th, thM39374f)) {
                arrayListM39370c.add(th);
            }
            m39372l(C10960g2.f41747e);
            return arrayListM39370c;
        }

        /* renamed from: k */
        public final void m39379k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void m39380m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + m39375g() + ", completing=" + m39376h() + ", rootCause=" + m39374f() + ", exceptions=" + get_exceptionsHolder() + ", list=" + getF41883f() + ']';
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(m32266d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, m32267d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", HttpUrl.FRAGMENT_ENCODE_SET, "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.f2$d */
    public static final class d extends LockFreeLinkedListNode.a {

        /* renamed from: d */
        final /* synthetic */ JobSupport f41717d;

        /* renamed from: e */
        final /* synthetic */ Object f41718e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f41717d = jobSupport;
            this.f41718e = obj;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object mo39223g(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f41717d.m39350X() == this.f41718e) {
                return null;
            }
            return C10998q.m39544a();
        }
    }

    public JobSupport(boolean z) {
        this._state = z ? C10960g2.f41749g : C10960g2.f41748f;
        this._parentHandle = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A0 */
    private final Object m39313A0(Incomplete incomplete, Object obj) throws Throwable {
        NodeList nodeListM39324V = m39324V(incomplete);
        if (nodeListM39324V == null) {
            return C10960g2.f41745c;
        }
        c cVar = incomplete instanceof c ? (c) incomplete : null;
        if (cVar == null) {
            cVar = new c(nodeListM39324V, false, null);
        }
        C9788f0 c9788f0 = new C9788f0();
        synchronized (cVar) {
            if (cVar.m39376h()) {
                return C10960g2.f41743a;
            }
            cVar.m39379k(true);
            if (cVar != incomplete && !f41710f.compareAndSet(this, incomplete, cVar)) {
                return C10960g2.f41745c;
            }
            if (C11045s0.m39681a() && !(!cVar.m39377i())) {
                throw new AssertionError();
            }
            boolean zM39375g = cVar.m39375g();
            CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
            if (completedExceptionally != null) {
                cVar.m39373a(completedExceptionally.f41577b);
            }
            T tM39374f = Boolean.valueOf(zM39375g ? false : true).booleanValue() ? cVar.m39374f() : 0;
            c9788f0.f37179f = tM39374f;
            C10775u c10775u = C10775u.f41439a;
            Throwable th = (Throwable) tM39374f;
            if (th != null) {
                m39328j0(nodeListM39324V, th);
            }
            ChildHandleNode childHandleNodeM39321Q = m39321Q(incomplete);
            return (childHandleNodeM39321Q == null || !m39314B0(cVar, childHandleNodeM39321Q, obj)) ? m39320P(cVar, obj) : C10960g2.f41744b;
        }
    }

    /* renamed from: B0 */
    private final boolean m39314B0(c cVar, ChildHandleNode childHandleNode, Object obj) {
        while (Job.a.m39715d(childHandleNode.f41884j, false, false, new b(this, cVar, childHandleNode, obj), 1, null) == NonDisposableHandle.f41850f) {
            childHandleNode = m39327i0(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    private final Object m39315F(Object obj) {
        Object objM39342z0;
        do {
            Object objM39350X = m39350X();
            if (!(objM39350X instanceof Incomplete) || ((objM39350X instanceof c) && ((c) objM39350X).m39376h())) {
                return C10960g2.f41743a;
            }
            objM39342z0 = m39342z0(objM39350X, new CompletedExceptionally(m39319O(obj), false, 2, null));
        } while (objM39342z0 == C10960g2.f41745c);
        return objM39342z0;
    }

    /* renamed from: G */
    private final boolean m39316G(Throwable th) {
        if (mo39310c0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ChildHandle childHandleM39349W = m39349W();
        return (childHandleM39349W == null || childHandleM39349W == NonDisposableHandle.f41850f) ? z : childHandleM39349W.mo39619u(th) || z;
    }

    /* renamed from: M */
    private final void m39317M(Incomplete incomplete, Object obj) throws Throwable {
        ChildHandle childHandleM39349W = m39349W();
        if (childHandleM39349W != null) {
            childHandleM39349W.mo39285k();
            m39363r0(NonDisposableHandle.f41850f);
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.f41577b : null;
        if (!(incomplete instanceof JobNode)) {
            NodeList f41716f = incomplete.getF41883f();
            if (f41716f != null) {
                m39329k0(f41716f, th);
                return;
            }
            return;
        }
        try {
            ((JobNode) incomplete).mo39270E(th);
        } catch (Throwable th2) {
            mo39082Z(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final void m39318N(c cVar, ChildHandleNode childHandleNode, Object obj) {
        if (C11045s0.m39681a()) {
            if (!(m39350X() == cVar)) {
                throw new AssertionError();
            }
        }
        ChildHandleNode childHandleNodeM39327i0 = m39327i0(childHandleNode);
        if (childHandleNodeM39327i0 == null || !m39314B0(cVar, childHandleNodeM39327i0, obj)) {
            mo39094v(m39320P(cVar, obj));
        }
    }

    /* renamed from: O */
    private final Throwable m39319O(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(mo39081K(), null, this) : th;
        }
        if (obj != null) {
            return ((ParentJob) obj).mo39344D();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* renamed from: P */
    private final Object m39320P(c cVar, Object obj) throws Throwable {
        boolean zM39375g;
        Throwable thM39323S;
        boolean z = true;
        if (C11045s0.m39681a()) {
            if (!(m39350X() == cVar)) {
                throw new AssertionError();
            }
        }
        if (C11045s0.m39681a() && !(!cVar.m39377i())) {
            throw new AssertionError();
        }
        if (C11045s0.m39681a() && !cVar.m39376h()) {
            throw new AssertionError();
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.f41577b : null;
        synchronized (cVar) {
            zM39375g = cVar.m39375g();
            List<Throwable> listM39378j = cVar.m39378j(th);
            thM39323S = m39323S(cVar, listM39378j);
            if (thM39323S != null) {
                m39337u(thM39323S, listM39378j);
            }
        }
        if (thM39323S != null && thM39323S != th) {
            obj = new CompletedExceptionally(thM39323S, false, 2, null);
        }
        if (thM39323S != null) {
            if (!m39316G(thM39323S) && !mo39351Y(thM39323S)) {
                z = false;
            }
            if (z) {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
                ((CompletedExceptionally) obj).m39113b();
            }
        }
        if (!zM39375g) {
            m39359l0(thM39323S);
        }
        mo39086m0(obj);
        boolean zCompareAndSet = f41710f.compareAndSet(this, cVar, C10960g2.m39406g(obj));
        if (C11045s0.m39681a() && !zCompareAndSet) {
            throw new AssertionError();
        }
        m39317M(cVar, obj);
        return obj;
    }

    /* renamed from: Q */
    private final ChildHandleNode m39321Q(Incomplete incomplete) {
        ChildHandleNode childHandleNode = incomplete instanceof ChildHandleNode ? (ChildHandleNode) incomplete : null;
        if (childHandleNode != null) {
            return childHandleNode;
        }
        NodeList f41716f = incomplete.getF41883f();
        if (f41716f != null) {
            return m39327i0(f41716f);
        }
        return null;
    }

    /* renamed from: R */
    private final Throwable m39322R(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.f41577b;
        }
        return null;
    }

    /* renamed from: S */
    private final Throwable m39323S(c cVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.m39375g()) {
                return new JobCancellationException(mo39081K(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: V */
    private final NodeList m39324V(Incomplete incomplete) {
        NodeList f41716f = incomplete.getF41883f();
        if (f41716f != null) {
            return f41716f;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (incomplete instanceof JobNode) {
            m39331p0((JobNode) incomplete);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + incomplete).toString());
    }

    /* renamed from: d0 */
    private final Object m39325d0(Object obj) throws Throwable {
        Throwable thM39319O = null;
        while (true) {
            Object objM39350X = m39350X();
            if (objM39350X instanceof c) {
                synchronized (objM39350X) {
                    if (((c) objM39350X).m39377i()) {
                        return C10960g2.f41746d;
                    }
                    boolean zM39375g = ((c) objM39350X).m39375g();
                    if (obj != null || !zM39375g) {
                        if (thM39319O == null) {
                            thM39319O = m39319O(obj);
                        }
                        ((c) objM39350X).m39373a(thM39319O);
                    }
                    Throwable thM39374f = zM39375g ^ true ? ((c) objM39350X).m39374f() : null;
                    if (thM39374f != null) {
                        m39328j0(((c) objM39350X).getF41883f(), thM39374f);
                    }
                    return C10960g2.f41743a;
                }
            }
            if (!(objM39350X instanceof Incomplete)) {
                return C10960g2.f41746d;
            }
            if (thM39319O == null) {
                thM39319O = m39319O(obj);
            }
            Incomplete incomplete = (Incomplete) objM39350X;
            if (!incomplete.getF41754f()) {
                Object objM39342z0 = m39342z0(objM39350X, new CompletedExceptionally(thM39319O, false, 2, null));
                if (objM39342z0 == C10960g2.f41743a) {
                    throw new IllegalStateException(("Cannot happen in " + objM39350X).toString());
                }
                if (objM39342z0 != C10960g2.f41745c) {
                    return objM39342z0;
                }
            } else if (m39341y0(incomplete, thM39319O)) {
                return C10960g2.f41743a;
            }
        }
    }

    /* renamed from: g0 */
    private final JobNode m39326g0(Function1<? super Throwable, C10775u> function1, boolean z) {
        JobNode invokeOnCompletion;
        if (z) {
            invokeOnCompletion = function1 instanceof JobCancellingNode ? (JobCancellingNode) function1 : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new InvokeOnCancelling(function1);
            }
        } else {
            invokeOnCompletion = function1 instanceof JobNode ? (JobNode) function1 : null;
            if (invokeOnCompletion == null) {
                invokeOnCompletion = new InvokeOnCompletion(function1);
            } else if (C11045s0.m39681a() && !(!(invokeOnCompletion instanceof JobCancellingNode))) {
                throw new AssertionError();
            }
        }
        invokeOnCompletion.m39304G(this);
        return invokeOnCompletion;
    }

    /* renamed from: i0 */
    private final ChildHandleNode m39327i0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo39542y()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m39559v();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m39558r();
            if (!lockFreeLinkedListNode.mo39542y()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    /* renamed from: j0 */
    private final void m39328j0(NodeList nodeList, Throwable th) throws Throwable {
        m39359l0(th);
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM39558r = (LockFreeLinkedListNode) nodeList.m39557q(); !C9801m.m32341a(lockFreeLinkedListNodeM39558r, nodeList); lockFreeLinkedListNodeM39558r = lockFreeLinkedListNodeM39558r.m39558r()) {
            if (lockFreeLinkedListNodeM39558r instanceof JobCancellingNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNodeM39558r;
                try {
                    jobNode.mo39270E(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C9821b.m32367a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        C10775u c10775u = C10775u.f41439a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo39082Z(completionHandlerException);
        }
        m39316G(th);
    }

    /* renamed from: k0 */
    private final void m39329k0(NodeList nodeList, Throwable th) throws Throwable {
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM39558r = (LockFreeLinkedListNode) nodeList.m39557q(); !C9801m.m32341a(lockFreeLinkedListNodeM39558r, nodeList); lockFreeLinkedListNodeM39558r = lockFreeLinkedListNodeM39558r.m39558r()) {
            if (lockFreeLinkedListNodeM39558r instanceof JobNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNodeM39558r;
                try {
                    jobNode.mo39270E(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C9821b.m32367a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                        C10775u c10775u = C10775u.f41439a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo39082Z(completionHandlerException);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.s1] */
    /* renamed from: o0 */
    private final void m39330o0(Empty empty) {
        NodeList nodeList = new NodeList();
        if (!empty.getF41754f()) {
            nodeList = new InactiveNodeList(nodeList);
        }
        f41710f.compareAndSet(this, empty, nodeList);
    }

    /* renamed from: p0 */
    private final void m39331p0(JobNode jobNode) {
        jobNode.m39556m(new NodeList());
        f41710f.compareAndSet(this, jobNode, jobNode.m39558r());
    }

    /* renamed from: s0 */
    private final int m39334s0(Object obj) {
        if (obj instanceof Empty) {
            if (((Empty) obj).getF41754f()) {
                return 0;
            }
            if (!f41710f.compareAndSet(this, obj, C10960g2.f41749g)) {
                return -1;
            }
            mo39361n0();
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        if (!f41710f.compareAndSet(this, obj, ((InactiveNodeList) obj).getF41883f())) {
            return -1;
        }
        mo39361n0();
        return 1;
    }

    /* renamed from: t */
    private final boolean m39335t(Object obj, NodeList nodeList, JobNode jobNode) {
        int iM39553D;
        d dVar = new d(jobNode, this, obj);
        do {
            iM39553D = nodeList.m39559v().m39553D(jobNode, nodeList, dVar);
            if (iM39553D == 1) {
                return true;
            }
        } while (iM39553D != 2);
        return false;
    }

    /* renamed from: t0 */
    private final String m39336t0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof Incomplete ? ((Incomplete) obj).getF41754f() ? "Active" : "New" : obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.m39375g() ? "Cancelling" : cVar.m39376h() ? "Completing" : "Active";
    }

    /* renamed from: u */
    private final void m39337u(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable thM39464l = !C11045s0.m39684d() ? th : C10976d0.m39464l(th);
        for (Throwable thM39464l2 : list) {
            if (C11045s0.m39684d()) {
                thM39464l2 = C10976d0.m39464l(thM39464l2);
            }
            if (thM39464l2 != th && thM39464l2 != thM39464l && !(thM39464l2 instanceof CancellationException) && setNewSetFromMap.add(thM39464l2)) {
                C9821b.m32367a(th, thM39464l2);
            }
        }
    }

    /* renamed from: v0 */
    public static /* synthetic */ CancellationException m39338v0(JobSupport jobSupport, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return jobSupport.m39364u0(th, str);
    }

    /* renamed from: x */
    private final Object m39339x(Continuation<Object> continuation) {
        a aVar = new a(C10854c.m39044b(continuation), this);
        aVar.m39666z();
        C11036q.m39673a(aVar, mo39360m(new ResumeAwaitOnCompletion(aVar)));
        Object objM39664w = aVar.m39664w();
        if (objM39664w == C10855d.m39045c()) {
            C10863h.m39060c(continuation);
        }
        return objM39664w;
    }

    /* renamed from: x0 */
    private final boolean m39340x0(Incomplete incomplete, Object obj) throws Throwable {
        if (C11045s0.m39681a()) {
            if (!((incomplete instanceof Empty) || (incomplete instanceof JobNode))) {
                throw new AssertionError();
            }
        }
        if (C11045s0.m39681a() && !(!(obj instanceof CompletedExceptionally))) {
            throw new AssertionError();
        }
        if (!f41710f.compareAndSet(this, incomplete, C10960g2.m39406g(obj))) {
            return false;
        }
        m39359l0(null);
        mo39086m0(obj);
        m39317M(incomplete, obj);
        return true;
    }

    /* renamed from: y0 */
    private final boolean m39341y0(Incomplete incomplete, Throwable th) throws Throwable {
        if (C11045s0.m39681a() && !(!(incomplete instanceof c))) {
            throw new AssertionError();
        }
        if (C11045s0.m39681a() && !incomplete.getF41754f()) {
            throw new AssertionError();
        }
        NodeList nodeListM39324V = m39324V(incomplete);
        if (nodeListM39324V == null) {
            return false;
        }
        if (!f41710f.compareAndSet(this, incomplete, new c(nodeListM39324V, false, th))) {
            return false;
        }
        m39328j0(nodeListM39324V, th);
        return true;
    }

    /* renamed from: z0 */
    private final Object m39342z0(Object obj, Object obj2) {
        return !(obj instanceof Incomplete) ? C10960g2.f41743a : ((!(obj instanceof Empty) && !(obj instanceof JobNode)) || (obj instanceof ChildHandleNode) || (obj2 instanceof CompletedExceptionally)) ? m39313A0((Incomplete) obj, obj2) : m39340x0((Incomplete) obj, obj2) ? obj2 : C10960g2.f41745c;
    }

    /* renamed from: C */
    public final boolean m39343C(Object obj) throws Throwable {
        Object objM39325d0 = C10960g2.f41743a;
        if (mo39097U() && (objM39325d0 = m39315F(obj)) == C10960g2.f41744b) {
            return true;
        }
        if (objM39325d0 == C10960g2.f41743a) {
            objM39325d0 = m39325d0(obj);
        }
        if (objM39325d0 == C10960g2.f41743a || objM39325d0 == C10960g2.f41744b) {
            return true;
        }
        if (objM39325d0 == C10960g2.f41746d) {
            return false;
        }
        mo39094v(objM39325d0);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.ParentJob
    /* renamed from: D */
    public CancellationException mo39344D() {
        CancellationException cancellationExceptionM39374f;
        Object objM39350X = m39350X();
        if (objM39350X instanceof c) {
            cancellationExceptionM39374f = ((c) objM39350X).m39374f();
        } else if (objM39350X instanceof CompletedExceptionally) {
            cancellationExceptionM39374f = ((CompletedExceptionally) objM39350X).f41577b;
        } else {
            if (objM39350X instanceof Incomplete) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM39350X).toString());
            }
            cancellationExceptionM39374f = null;
        }
        CancellationException cancellationException = cancellationExceptionM39374f instanceof CancellationException ? cancellationExceptionM39374f : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + m39336t0(objM39350X), cancellationExceptionM39374f, this);
    }

    /* renamed from: E */
    public void m39345E(Throwable th) throws Throwable {
        m39343C(th);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: H */
    public void mo39346H(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo39081K(), null, this);
        }
        m39345E(cancellationException);
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: J */
    public final ChildHandle mo39347J(ChildJob childJob) {
        return (ChildHandle) Job.a.m39715d(this, true, false, new ChildHandleNode(childJob), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K */
    public String mo39081K() {
        return "Job was cancelled";
    }

    /* renamed from: L */
    public boolean mo39348L(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m39343C(th) && getF41566g();
    }

    /* renamed from: T */
    public boolean getF41566g() {
        return true;
    }

    /* renamed from: U */
    public boolean mo39097U() {
        return false;
    }

    /* renamed from: W */
    public final ChildHandle m39349W() {
        return (ChildHandle) this._parentHandle;
    }

    /* renamed from: X */
    public final Object m39350X() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).mo39448c(this);
        }
    }

    /* renamed from: Y */
    protected boolean mo39351Y(Throwable th) {
        return false;
    }

    /* renamed from: Z */
    public void mo39082Z(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: a0 */
    protected final void m39352a0(Job job) {
        if (C11045s0.m39681a()) {
            if (!(m39349W() == null)) {
                throw new AssertionError();
            }
        }
        if (job == null) {
            m39363r0(NonDisposableHandle.f41850f);
            return;
        }
        job.start();
        ChildHandle childHandleMo39347J = job.mo39347J(this);
        m39363r0(childHandleMo39347J);
        if (m39353b0()) {
            childHandleMo39347J.mo39285k();
            m39363r0(NonDisposableHandle.f41850f);
        }
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: b */
    public boolean mo39083b() {
        Object objM39350X = m39350X();
        return (objM39350X instanceof Incomplete) && ((Incomplete) objM39350X).getF41754f();
    }

    /* renamed from: b0 */
    public final boolean m39353b0() {
        return !(m39350X() instanceof Incomplete);
    }

    /* renamed from: c0 */
    protected boolean mo39310c0() {
        return false;
    }

    /* renamed from: e0 */
    public final boolean m39354e0(Object obj) {
        Object objM39342z0;
        do {
            objM39342z0 = m39342z0(m39350X(), obj);
            if (objM39342z0 == C10960g2.f41743a) {
                return false;
            }
            if (objM39342z0 == C10960g2.f41744b) {
                return true;
            }
        } while (objM39342z0 == C10960g2.f41745c);
        mo39094v(objM39342z0);
        return true;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: f */
    public final DisposableHandle mo39355f(boolean z, boolean z2, Function1<? super Throwable, C10775u> function1) {
        JobNode jobNodeM39326g0 = m39326g0(function1, z);
        while (true) {
            Object objM39350X = m39350X();
            if (objM39350X instanceof Empty) {
                Empty empty = (Empty) objM39350X;
                if (!empty.getF41754f()) {
                    m39330o0(empty);
                } else if (f41710f.compareAndSet(this, objM39350X, jobNodeM39326g0)) {
                    return jobNodeM39326g0;
                }
            } else {
                if (!(objM39350X instanceof Incomplete)) {
                    if (z2) {
                        CompletedExceptionally completedExceptionally = objM39350X instanceof CompletedExceptionally ? (CompletedExceptionally) objM39350X : null;
                        function1.invoke(completedExceptionally != null ? completedExceptionally.f41577b : null);
                    }
                    return NonDisposableHandle.f41850f;
                }
                NodeList f41716f = ((Incomplete) objM39350X).getF41883f();
                if (f41716f != null) {
                    DisposableHandle disposableHandle = NonDisposableHandle.f41850f;
                    if (z && (objM39350X instanceof c)) {
                        synchronized (objM39350X) {
                            thM39374f = ((c) objM39350X).m39374f();
                            if (thM39374f == null || ((function1 instanceof ChildHandleNode) && !((c) objM39350X).m39376h())) {
                                if (m39335t(objM39350X, f41716f, jobNodeM39326g0)) {
                                    if (thM39374f == null) {
                                        return jobNodeM39326g0;
                                    }
                                    disposableHandle = jobNodeM39326g0;
                                }
                            }
                            C10775u c10775u = C10775u.f41439a;
                        }
                    }
                    if (thM39374f != null) {
                        if (z2) {
                            function1.invoke(thM39374f);
                        }
                        return disposableHandle;
                    }
                    if (m39335t(objM39350X, f41716f, jobNodeM39326g0)) {
                        return jobNodeM39326g0;
                    }
                } else {
                    if (objM39350X == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                    m39331p0((JobNode) objM39350X);
                }
            }
        }
    }

    /* renamed from: f0 */
    public final Object m39356f0(Object obj) {
        Object objM39342z0;
        do {
            objM39342z0 = m39342z0(m39350X(), obj);
            if (objM39342z0 == C10960g2.f41743a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m39322R(obj));
            }
        } while (objM39342z0 == C10960g2.f41745c);
        return objM39342z0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.b, ? extends R> function2) {
        return (R) Job.a.m39713b(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.b, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        return (E) Job.a.m39714c(this, cVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.b
    public final CoroutineContext.c<?> getKey() {
        return Job.f41899e;
    }

    /* renamed from: h0 */
    public String mo39084h0() {
        return C11049t0.m39687a(this);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object objM39350X = m39350X();
        return (objM39350X instanceof CompletedExceptionally) || ((objM39350X instanceof c) && ((c) objM39350X).m39375g());
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: j */
    public final CancellationException mo39357j() {
        Object objM39350X = m39350X();
        if (!(objM39350X instanceof c)) {
            if (objM39350X instanceof Incomplete) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objM39350X instanceof CompletedExceptionally) {
                return m39338v0(this, ((CompletedExceptionally) objM39350X).f41577b, null, 1, null);
            }
            return new JobCancellationException(C11049t0.m39687a(this) + " has completed normally", null, this);
        }
        Throwable thM39374f = ((c) objM39350X).m39374f();
        if (thM39374f != null) {
            CancellationException cancellationExceptionM39364u0 = m39364u0(thM39374f, C11049t0.m39687a(this) + " is cancelling");
            if (cancellationExceptionM39364u0 != null) {
                return cancellationExceptionM39364u0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlinx.coroutines.ChildJob
    /* renamed from: l */
    public final void mo39358l(ParentJob parentJob) throws Throwable {
        m39343C(parentJob);
    }

    /* renamed from: l0 */
    protected void m39359l0(Throwable th) {
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: m */
    public final DisposableHandle mo39360m(Function1<? super Throwable, C10775u> function1) {
        return mo39355f(false, true, function1);
    }

    /* renamed from: m0 */
    protected void mo39086m0(Object obj) {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        return Job.a.m39716e(this, cVar);
    }

    /* renamed from: n0 */
    protected void mo39361n0() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return Job.a.m39717f(this, coroutineContext);
    }

    /* renamed from: q0 */
    public final void m39362q0(JobNode jobNode) {
        Object objM39350X;
        do {
            objM39350X = m39350X();
            if (!(objM39350X instanceof JobNode)) {
                if (!(objM39350X instanceof Incomplete) || ((Incomplete) objM39350X).getF41883f() == null) {
                    return;
                }
                jobNode.mo39543z();
                return;
            }
            if (objM39350X != jobNode) {
                return;
            }
        } while (!f41710f.compareAndSet(this, objM39350X, C10960g2.f41749g));
    }

    /* renamed from: r0 */
    public final void m39363r0(ChildHandle childHandle) {
        this._parentHandle = childHandle;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iM39334s0;
        do {
            iM39334s0 = m39334s0(m39350X());
            if (iM39334s0 == 0) {
                return false;
            }
        } while (iM39334s0 != 1);
        return true;
    }

    public String toString() {
        return m39366w0() + '@' + C11049t0.m39688b(this);
    }

    /* renamed from: u0 */
    protected final CancellationException m39364u0(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = mo39081K();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    /* renamed from: v */
    protected void mo39094v(Object obj) {
    }

    /* renamed from: w */
    public final Object m39365w(Continuation<Object> continuation) throws Throwable {
        Object objM39350X;
        do {
            objM39350X = m39350X();
            if (!(objM39350X instanceof Incomplete)) {
                if (!(objM39350X instanceof CompletedExceptionally)) {
                    return C10960g2.m39407h(objM39350X);
                }
                Throwable th = ((CompletedExceptionally) objM39350X).f41577b;
                if (C11045s0.m39684d() && (continuation instanceof CoroutineStackFrame)) {
                    throw C10976d0.m39462j(th, (CoroutineStackFrame) continuation);
                }
                throw th;
            }
        } while (m39334s0(objM39350X) < 0);
        return m39339x(continuation);
    }

    /* renamed from: w0 */
    public final String m39366w0() {
        return mo39084h0() + '{' + m39336t0(m39350X()) + '}';
    }

    /* renamed from: y */
    public final boolean m39367y(Throwable th) {
        return m39343C(th);
    }
}
