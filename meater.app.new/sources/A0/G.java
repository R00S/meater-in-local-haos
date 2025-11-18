package A0;

import A0.L;
import A0.m0;
import android.view.View;
import androidx.compose.ui.platform.C2013e0;
import androidx.compose.ui.platform.C2046v0;
import androidx.compose.ui.platform.i1;
import b0.i;
import f0.InterfaceC3302c;
import i0.InterfaceC3586l0;
import java.util.Comparator;
import java.util.List;
import kotlin.InterfaceC1552k;
import kotlin.InterfaceC1578x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;
import oa.C4153F;
import x0.C5047a;
import y0.C5093D;
import y0.InterfaceC5112q;
import y0.InterfaceC5116v;
import y0.InterfaceC5120z;
import y0.Z;

/* compiled from: LayoutNode.kt */
@Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 Ô\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0007xØ\u0002Á\u0001\u0088\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u000eH\u0000¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010'\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&H\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000eH\u0000¢\u0006\u0004\b-\u0010\u0010J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0000¢\u0006\u0004\b1\u0010\u0010J'\u00104\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u0010\u0010J\u0017\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bB\u0010@J\u0015\u0010C\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bC\u0010@J\u0015\u0010D\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bD\u0010@J\u0015\u0010E\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bE\u0010@J\u0015\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bF\u0010@J\u0015\u0010G\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bG\u0010@J\u0015\u0010H\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bH\u0010@J\u000f\u0010I\u001a\u00020\u000eH\u0000¢\u0006\u0004\bI\u0010\u0010J\u000f\u0010J\u001a\u00020\u000eH\u0000¢\u0006\u0004\bJ\u0010\u0010J\u001f\u0010L\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0000¢\u0006\u0004\bL\u00100J\u000f\u0010M\u001a\u00020\u000eH\u0000¢\u0006\u0004\bM\u0010\u0010J\u000f\u0010N\u001a\u00020\u000eH\u0000¢\u0006\u0004\bN\u0010\u0010J!\u0010S\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010QH\u0000¢\u0006\u0004\bS\u0010TJ6\u0010[\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\b\b\u0002\u0010Y\u001a\u00020\b2\b\b\u0002\u0010Z\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J6\u0010^\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010]\u001a\u00020W2\b\b\u0002\u0010Y\u001a\u00020\b2\b\b\u0002\u0010Z\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b^\u0010\\J\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u0000H\u0000¢\u0006\u0004\b`\u0010\u0014J-\u0010d\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020\b2\b\b\u0002\u0010c\u001a\u00020\bH\u0000¢\u0006\u0004\bd\u0010eJ-\u0010f\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020\b2\b\b\u0002\u0010c\u001a\u00020\bH\u0000¢\u0006\u0004\bf\u0010eJ\u000f\u0010g\u001a\u00020\u000eH\u0000¢\u0006\u0004\bg\u0010\u0010J\u000f\u0010h\u001a\u00020\u000eH\u0000¢\u0006\u0004\bh\u0010\u0010J\u0019\u0010i\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\bH\u0000¢\u0006\u0004\bi\u0010jJ\u0019\u0010k\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\bH\u0000¢\u0006\u0004\bk\u0010jJ\u000f\u0010l\u001a\u00020\u000eH\u0000¢\u0006\u0004\bl\u0010\u0010J\u000f\u0010m\u001a\u00020\u000eH\u0000¢\u0006\u0004\bm\u0010\u0010J\u001e\u0010p\u001a\u00020\b2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010nH\u0000ø\u0001\u0000¢\u0006\u0004\bp\u0010qJ\u001e\u0010r\u001a\u00020\b2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010nH\u0000ø\u0001\u0000¢\u0006\u0004\br\u0010qJ\u000f\u0010s\u001a\u00020\u000eH\u0000¢\u0006\u0004\bs\u0010\u0010J\u000f\u0010t\u001a\u00020\u000eH\u0000¢\u0006\u0004\bt\u0010\u0010J\u000f\u0010u\u001a\u00020\u000eH\u0000¢\u0006\u0004\bu\u0010\u0010J\u000f\u0010v\u001a\u00020\u000eH\u0000¢\u0006\u0004\bv\u0010\u0010J\u000f\u0010w\u001a\u00020\u000eH\u0016¢\u0006\u0004\bw\u0010\u0010J\u000f\u0010x\u001a\u00020\u000eH\u0016¢\u0006\u0004\bx\u0010\u0010J\u000f\u0010y\u001a\u00020\u000eH\u0000¢\u0006\u0004\by\u0010\u0010J\u000f\u0010z\u001a\u00020\u000eH\u0000¢\u0006\u0004\bz\u0010\u0010J\u000f\u0010{\u001a\u00020\u000eH\u0016¢\u0006\u0004\b{\u0010\u0010J\u000f\u0010|\u001a\u00020\u000eH\u0016¢\u0006\u0004\b|\u0010\u0010J\u000f\u0010}\u001a\u00020\u000eH\u0016¢\u0006\u0004\b}\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010~R'\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R9\u0010\u008a\u0001\u001a\u00020\n2\u0007\u0010\u0085\u0001\u001a\u00020\n8W@WX\u0097\u000e¢\u0006\u001f\n\u0006\b\u0086\u0001\u0010\u0080\u0001\u0012\u0005\b\u0089\u0001\u0010\u0010\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R'\u0010\u008f\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u008b\u0001\u0010~\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0005\b\u008e\u0001\u0010jR5\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0005\b\u0095\u0001\u0010\u0014R\u0019\u0010\u0098\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0080\u0001R\u001e\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\"\u0010\u009f\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u009e\u0001R\u0018\u0010¡\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010~R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0092\u0001R-\u00108\u001a\u0004\u0018\u0001072\t\u0010\u0085\u0001\u001a\u0004\u0018\u0001078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R3\u0010°\u0001\u001a\f\u0018\u00010¨\u0001j\u0005\u0018\u0001`©\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R(\u0010\u0015\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0001\u0010\u0080\u0001\u001a\u0006\b¤\u0001\u0010\u0082\u0001\"\u0006\b²\u0001\u0010\u0084\u0001R\u0018\u0010´\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b³\u0001\u0010~R\u001c\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010\u009e\u0001R\u0017\u0010»\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010~R4\u0010Ã\u0001\u001a\u00030¼\u00012\b\u0010½\u0001\u001a\u00030¼\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R\u001b\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R4\u0010Í\u0001\u001a\u00030Ç\u00012\b\u0010½\u0001\u001a\u00030Ç\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0006\b¢\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R4\u0010Õ\u0001\u001a\u00030Î\u00012\b\u0010½\u0001\u001a\u00030Î\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R4\u0010Ý\u0001\u001a\u00030Ö\u00012\b\u0010½\u0001\u001a\u00030Ö\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R4\u0010ä\u0001\u001a\u00030Þ\u00012\b\u0010½\u0001\u001a\u00030Þ\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\b \u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R*\u0010ë\u0001\u001a\u00030å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bÄ\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R\u0019\u0010ì\u0001\u001a\u00030å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b~\u0010ç\u0001R.\u0010ï\u0001\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\b\u0093\u0001\u0010~\u0012\u0005\bî\u0001\u0010\u0010\u001a\u0006\b\u008b\u0001\u0010\u008d\u0001\"\u0005\bí\u0001\u0010jR \u0010õ\u0001\u001a\u00030ð\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001R \u0010ú\u0001\u001a\u00030ö\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bÈ\u0001\u0010ù\u0001R,\u0010\u0082\u0002\u001a\u0005\u0018\u00010û\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\b\u0080\u0002\u0010\u0081\u0002R\u001c\u0010\u0086\u0002\u001a\u0005\u0018\u00010\u0083\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R'\u0010\u0089\u0002\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b¿\u0001\u0010~\u001a\u0006\b\u0087\u0002\u0010\u008d\u0001\"\u0005\b\u0088\u0002\u0010jR\u0019\u0010\u008c\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001b\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008b\u0002R8\u0010\u0096\u0002\u001a\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u008f\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0090\u0002\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0006\b\u0094\u0002\u0010\u0095\u0002R8\u0010\u009a\u0002\u001a\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u008f\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0097\u0002\u0010\u0091\u0002\u001a\u0006\b\u0098\u0002\u0010\u0093\u0002\"\u0006\b\u0099\u0002\u0010\u0095\u0002R'\u0010\u009c\u0002\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bó\u0001\u0010~\u001a\u0006\b\u0097\u0002\u0010\u008d\u0001\"\u0005\b\u009b\u0002\u0010jR(\u0010\u009e\u0002\u001a\u00020\b2\u0007\u0010\u0085\u0001\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0004\b\u001a\u0010~\u001a\u0006\b\u009d\u0002\u0010\u008d\u0001R\u0018\u0010¢\u0002\u001a\u00030\u009f\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0002\u0010¡\u0002R\u001a\u0010¤\u0002\u001a\u0005\u0018\u00010\u0083\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010£\u0002R\u0016\u0010§\u0002\u001a\u0004\u0018\u00010\b8F¢\u0006\b\u001a\u0006\b¥\u0002\u0010¦\u0002R\u001e\u0010ª\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000¨\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010©\u0002R\u001f\u0010¬\u0002\u001a\n\u0012\u0005\u0012\u00030«\u00020¨\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010©\u0002R\u001f\u0010\u00ad\u0002\u001a\n\u0012\u0005\u0012\u00030«\u00020¨\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010©\u0002R\u001e\u0010°\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u009d\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010¯\u0002R\u001e\u0010±\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000¨\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010©\u0002R\u0019\u0010³\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b²\u0002\u0010\u0094\u0001R\u0017\u0010µ\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b´\u0002\u0010\u008d\u0001R\u0018\u0010¸\u0002\u001a\u00030¶\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010·\u0002R\u001e\u0010»\u0002\u001a\n\u0018\u00010¹\u0002R\u00030ö\u00018@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b~\u0010º\u0002R\u001d\u0010¾\u0002\u001a\b0¼\u0002R\u00030ö\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010½\u0002R\u001a\u0010À\u0002\u001a\u0005\u0018\u00010µ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010¿\u0002R%\u0010Ã\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u009d\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bÂ\u0002\u0010\u0010\u001a\u0006\bÁ\u0002\u0010¯\u0002R\u0017\u0010Ä\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010\u008d\u0001R\u0017\u0010Å\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010\u008d\u0001R\u0016\u0010A\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010\u0082\u0001R\u0016\u0010>\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u0082\u0001R\u0016\u0010Ç\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u008d\u0001R\u0018\u0010Ê\u0002\u001a\u00030È\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010É\u0002R\u0017\u0010Ì\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010\u008d\u0001R\u0014\u0010Î\u0002\u001a\u00020\b8F¢\u0006\b\u001a\u0006\bÍ\u0002\u0010\u008d\u0001R\u0017\u0010Ð\u0002\u001a\u00020\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010\u0082\u0001R\u0018\u0010Ñ\u0002\u001a\u00030å\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010è\u0001R\u0018\u0010Ò\u0002\u001a\u00030å\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0002\u0010è\u0001R\u0018\u0010Ó\u0002\u001a\u00030\u0083\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¶\u0001\u0010£\u0002R\u0018\u0010Õ\u0002\u001a\u00030\u0083\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÔ\u0002\u0010£\u0002R\u0017\u0010Ö\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u008d\u0001R(\u0010\u001e\u001a\u00020\u001d2\u0007\u0010½\u0001\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0090\u0002\u0010×\u0002\"\u0005\bØ\u0002\u0010 R\u0018\u0010Ü\u0002\u001a\u00030Ù\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0002\u0010Û\u0002R\u0017\u0010Ý\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u008d\u0001R\u0017\u0010Þ\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010\u008d\u0001R\u0017\u0010ß\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010\u008d\u0001R\u0017\u0010à\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bß\u0001\u0010\u008d\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006á\u0002"}, d2 = {"LA0/G;", "LO/k;", "Ly0/b0;", "LA0/n0;", "Ly0/z;", "LA0/g;", "", "LA0/m0$b;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "Loa/F;", "j1", "()V", "J0", "child", "f1", "(LA0/G;)V", "depth", "", "x", "(I)Ljava/lang/String;", "LA0/y;", "l0", "()LA0/y;", "g1", "Lb0/i;", "modifier", "t", "(Lb0/i;)V", "y1", "C0", "w", "K1", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "R", "()Landroid/view/View;", "index", "instance", "B0", "(ILA0/G;)V", "h1", "count", "n1", "(II)V", "m1", "from", "to", "e1", "(III)V", "I0", "LA0/m0;", "owner", "u", "(LA0/m0;)V", "z", "toString", "()Ljava/lang/String;", "height", "d1", "(I)I", "width", "c1", "Z0", "Y0", "b1", "a1", "X0", "W0", "D0", "H0", "y", "i1", "o1", "R0", "Li0/l0;", "canvas", "Ll0/c;", "graphicsLayer", "B", "(Li0/l0;Ll0/c;)V", "Lh0/g;", "pointerPosition", "LA0/u;", "hitTestResult", "isTouchEvent", "isInLayer", "x0", "(JLA0/u;ZZ)V", "hitSemanticsEntities", "z0", "it", "x1", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "v1", "(ZZZ)V", "r1", "F0", "G0", "t1", "(Z)V", "p1", "A", "E0", "LU0/b;", "constraints", "P0", "(LU0/b;)Z", "k1", "S0", "V0", "T0", "U0", "k", "d", "v", "z1", "p", "i", "a", "Z", "C", "I", "q0", "()I", "I1", "(I)V", "<set-?>", "D", "getCompositeKeyHash", "g", "getCompositeKeyHash$annotations", "compositeKeyHash", "E", "O0", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "F", "LA0/G;", "a0", "()LA0/G;", "E1", "lookaheadRoot", "G", "virtualChildrenCount", "LA0/X;", "H", "LA0/X;", "_foldedChildren", "LQ/b;", "LQ/b;", "_unfoldedChildren", "J", "unfoldedVirtualChildrenListDirty", "K", "_foldedParent", "L", "LA0/m0;", "n0", "()LA0/m0;", "Landroidx/compose/ui/viewinterop/c;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "M", "Landroidx/compose/ui/viewinterop/c;", "S", "()Landroidx/compose/ui/viewinterop/c;", "C1", "(Landroidx/compose/ui/viewinterop/c;)V", "interopViewFactoryHolder", "N", "setDepth$ui_release", "O", "ignoreRemeasureRequests", "LF0/l;", "P", "LF0/l;", "_collapsedSemantics", "Q", "_zSortedChildren", "zSortedChildrenInvalidated", "Ly0/I;", "value", "Ly0/I;", "f0", "()Ly0/I;", "f", "(Ly0/I;)V", "measurePolicy", "T", "LA0/y;", "intrinsicsPolicy", "LU0/d;", "U", "LU0/d;", "()LU0/d;", "c", "(LU0/d;)V", "density", "LU0/t;", "V", "LU0/t;", "getLayoutDirection", "()LU0/t;", "b", "(LU0/t;)V", "layoutDirection", "Landroidx/compose/ui/platform/i1;", "W", "Landroidx/compose/ui/platform/i1;", "s0", "()Landroidx/compose/ui/platform/i1;", "l", "(Landroidx/compose/ui/platform/i1;)V", "viewConfiguration", "LO/x;", "X", "LO/x;", "()LO/x;", "j", "(LO/x;)V", "compositionLocalMap", "LA0/G$g;", "Y", "LA0/G$g;", "()LA0/G$g;", "D1", "(LA0/G$g;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "A1", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "LA0/a0;", "b0", "LA0/a0;", "k0", "()LA0/a0;", "nodes", "LA0/L;", "c0", "LA0/L;", "()LA0/L;", "layoutDelegate", "Ly0/D;", "d0", "Ly0/D;", "r0", "()Ly0/D;", "J1", "(Ly0/D;)V", "subcompositionsState", "LA0/c0;", "e0", "LA0/c0;", "_innerLayerCoordinator", "getInnerLayerCoordinatorIsDirty$ui_release", "B1", "innerLayerCoordinatorIsDirty", "g0", "Lb0/i;", "_modifier", "h0", "pendingModifier", "Lkotlin/Function1;", "i0", "LBa/l;", "getOnAttach$ui_release", "()LBa/l;", "G1", "(LBa/l;)V", "onAttach", "j0", "getOnDetach$ui_release", "H1", "onDetach", "F1", "needsOnPositionedDispatch", "L0", "isDeactivated", "", "u0", "()F", "zIndex", "()LA0/c0;", "innerLayerCoordinator", "N0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "", "()Ljava/util/List;", "foldedChildren", "Ly0/H;", "childMeasurables", "childLookaheadMeasurables", "w0", "()LQ/b;", "_children", "children", "o0", "parent", "K0", "isAttached", "LA0/G$e;", "()LA0/G$e;", "layoutState", "LA0/L$a;", "()LA0/L$a;", "lookaheadPassDelegate", "LA0/L$b;", "()LA0/L$b;", "measurePassDelegate", "()LF0/l;", "collapsedSemantics", "v0", "getZSortedChildren$annotations", "zSortedChildren", "isValidOwnerScope", "hasFixedInnerContentConstraints", "t0", "alignmentLinesRequired", "LA0/I;", "()LA0/I;", "mDrawScope", "o", "isPlaced", "M0", "isPlacedByParent", "p0", "placeOrder", "measuredByParent", "measuredByParentInLookahead", "innerCoordinator", "m0", "outerCoordinator", "applyingModifierOnAttach", "()Lb0/i;", "e", "Ly0/v;", "h", "()Ly0/v;", "coordinates", "measurePending", "layoutPending", "lookaheadMeasurePending", "lookaheadLayoutPending", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G implements InterfaceC1552k, y0.b0, n0, InterfaceC5120z, InterfaceC0828g, m0.b {

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n0, reason: collision with root package name */
    public static final int f292n0 = 8;

    /* renamed from: o0, reason: collision with root package name */
    private static final f f293o0 = new c();

    /* renamed from: p0, reason: collision with root package name */
    private static final Ba.a<G> f294p0 = a.f334B;

    /* renamed from: q0, reason: collision with root package name */
    private static final i1 f295q0 = new b();

    /* renamed from: r0, reason: collision with root package name */
    private static final Comparator<G> f296r0 = new Comparator() { // from class: A0.F
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return G.n((G) obj, (G) obj2);
        }
    };

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final boolean isVirtual;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int semanticsId;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int compositeKeyHash;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean isVirtualLookaheadRoot;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private G lookaheadRoot;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private int virtualChildrenCount;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final X<G> _foldedChildren;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private Q.b<G> _unfoldedChildren;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private G _foldedParent;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private m0 owner;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.viewinterop.c interopViewFactoryHolder;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int depth;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private F0.l _collapsedSemantics;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final Q.b<G> _zSortedChildren;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private y0.I measurePolicy;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private C0845y intrinsicsPolicy;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private U0.d density;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private U0.t layoutDirection;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private i1 viewConfiguration;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1578x compositionLocalMap;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private g intrinsicsUsageByParent;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private g previousIntrinsicsUsageByParent;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private boolean canMultiMeasure;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final C0819a0 nodes;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final L layoutDelegate;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private C5093D subcompositionsState;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private AbstractC0823c0 _innerLayerCoordinator;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private b0.i _modifier;

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private b0.i pendingModifier;

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super m0, C4153F> onAttach;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super m0, C4153F> onDetach;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private boolean needsOnPositionedDispatch;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private boolean isDeactivated;

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LA0/G;", "a", "()LA0/G;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<G> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f334B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke() {
            return new G(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"A0/G$b", "Landroidx/compose/ui/platform/i1;", "", "c", "()J", "longPressTimeoutMillis", "a", "doubleTapTimeoutMillis", "b", "doubleTapMinTimeMillis", "", "f", "()F", "touchSlop", "LU0/k;", "d", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements i1 {
        b() {
        }

        @Override // androidx.compose.ui.platform.i1
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.i1
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.i1
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.i1
        public long d() {
            return U0.k.INSTANCE.b();
        }

        @Override // androidx.compose.ui.platform.i1
        public float f() {
            return 16.0f;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"A0/G$c", "LA0/G$f;", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "", "j", "(Ly0/K;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // y0.I
        public /* bridge */ /* synthetic */ y0.J e(y0.K k10, List list, long j10) {
            return (y0.J) j(k10, list, j10);
        }

        public Void j(y0.K k10, List<? extends y0.H> list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LA0/G$d;", "", "<init>", "()V", "Lkotlin/Function0;", "LA0/G;", "Constructor", "LBa/a;", "a", "()LBa/a;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "b", "()Ljava/util/Comparator;", "LA0/G$f;", "ErrorMeasurePolicy", "LA0/G$f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.G$d, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Ba.a<G> a() {
            return G.f294p0;
        }

        public final Comparator<G> b() {
            return G.f296r0;
        }

        private Companion() {
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LA0/G$e;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LA0/G$f;", "Ly0/I;", "", "error", "<init>", "(Ljava/lang/String;)V", "Ly0/r;", "", "Ly0/q;", "measurables", "", "height", "", "g", "(Ly0/r;Ljava/util/List;I)Ljava/lang/Void;", "width", "f", "b", "a", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class f implements y0.I {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String error;

        public f(String str) {
            this.error = str;
        }

        public Void a(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void b(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // y0.I
        public /* bridge */ /* synthetic */ int c(y0.r rVar, List list, int i10) {
            return ((Number) g(rVar, list, i10)).intValue();
        }

        @Override // y0.I
        public /* bridge */ /* synthetic */ int d(y0.r rVar, List list, int i10) {
            return ((Number) b(rVar, list, i10)).intValue();
        }

        public Void f(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void g(y0.r rVar, List<? extends InterfaceC5112q> list, int i10) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // y0.I
        public /* bridge */ /* synthetic */ int h(y0.r rVar, List list, int i10) {
            return ((Number) f(rVar, list, i10)).intValue();
        }

        @Override // y0.I
        public /* bridge */ /* synthetic */ int i(y0.r rVar, List list, int i10) {
            return ((Number) a(rVar, list, i10)).intValue();
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LA0/G$g;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f346a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f346a = iArr;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i extends AbstractC3864v implements Ba.a<C4153F> {
        i() {
            super(0);
        }

        public final void a() {
            G.this.getLayoutDelegate().N();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O<F0.l> f349C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(kotlin.jvm.internal.O<F0.l> o10) {
            super(0);
            this.f349C = o10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [b0.i$c] */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [b0.i$c] */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r6v7, types: [F0.l, T] */
        public final void a() {
            C0819a0 nodes = G.this.getNodes();
            int iA = e0.a(8);
            kotlin.jvm.internal.O<F0.l> o10 = this.f349C;
            if ((nodes.i() & iA) != 0) {
                for (i.c tail = nodes.getTail(); tail != null; tail = tail.getParent()) {
                    if ((tail.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = tail;
                        Q.b bVar = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof v0) {
                                v0 v0Var = (v0) abstractC0834mG;
                                if (v0Var.getIsClearingSemantics()) {
                                    ?? lVar = new F0.l();
                                    o10.f43978B = lVar;
                                    lVar.E(true);
                                }
                                if (v0Var.getMergeDescendants()) {
                                    o10.f43978B.F(true);
                                }
                                v0Var.m1(o10.f43978B);
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
                }
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public G() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    private final void C0() {
        if (this.nodes.p(e0.a(1024) | e0.a(2048) | e0.a(4096))) {
            for (i.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
                if (((e0.a(1024) & head.getKindSet()) != 0) | ((e0.a(2048) & head.getKindSet()) != 0) | ((e0.a(4096) & head.getKindSet()) != 0)) {
                    f0.a(head);
                }
            }
        }
    }

    private final void E1(G g10) {
        if (C3862t.b(g10, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = g10;
        if (g10 != null) {
            this.layoutDelegate.q();
            AbstractC0823c0 wrapped = P().getWrapped();
            for (AbstractC0823c0 abstractC0823c0M0 = m0(); !C3862t.b(abstractC0823c0M0, wrapped) && abstractC0823c0M0 != null; abstractC0823c0M0 = abstractC0823c0M0.getWrapped()) {
                abstractC0823c0M0.d2();
            }
        }
        F0();
    }

    private final void J0() {
        G g10;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (g10 = this._foldedParent) == null) {
            return;
        }
        g10.J0();
    }

    private final AbstractC0823c0 Q() {
        if (this.innerLayerCoordinatorIsDirty) {
            AbstractC0823c0 abstractC0823c0P = P();
            AbstractC0823c0 wrappedBy = m0().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (true) {
                if (C3862t.b(abstractC0823c0P, wrappedBy)) {
                    break;
                }
                if ((abstractC0823c0P != null ? abstractC0823c0P.getLayer() : null) != null) {
                    this._innerLayerCoordinator = abstractC0823c0P;
                    break;
                }
                abstractC0823c0P = abstractC0823c0P != null ? abstractC0823c0P.getWrappedBy() : null;
            }
        }
        AbstractC0823c0 abstractC0823c0 = this._innerLayerCoordinator;
        if (abstractC0823c0 == null || abstractC0823c0.getLayer() != null) {
            return abstractC0823c0;
        }
        C5047a.c("layer was not set");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ boolean Q0(G g10, U0.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g10.layoutDelegate.z();
        }
        return g10.P0(bVar);
    }

    private final void f1(G child) {
        if (child.layoutDelegate.s() > 0) {
            this.layoutDelegate.W(r0.s() - 1);
        }
        if (this.owner != null) {
            child.z();
        }
        child._foldedParent = null;
        child.m0().Y2(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            Q.b<G> bVarF = child._foldedChildren.f();
            int size = bVarF.getSize();
            if (size > 0) {
                G[] gArrT = bVarF.t();
                int i10 = 0;
                do {
                    gArrT[i10].m0().Y2(null);
                    i10++;
                } while (i10 < size);
            }
        }
        J0();
        h1();
    }

    private final void g1() {
        F0();
        G gO0 = o0();
        if (gO0 != null) {
            gO0.D0();
        }
        E0();
    }

    private final void j1() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i10 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            Q.b<G> bVar = this._unfoldedChildren;
            if (bVar == null) {
                bVar = new Q.b<>(new G[16], 0);
                this._unfoldedChildren = bVar;
            }
            bVar.l();
            Q.b<G> bVarF = this._foldedChildren.f();
            int size = bVarF.getSize();
            if (size > 0) {
                G[] gArrT = bVarF.t();
                do {
                    G g10 = gArrT[i10];
                    if (g10.isVirtual) {
                        bVar.e(bVar.getSize(), g10.w0());
                    } else {
                        bVar.c(g10);
                    }
                    i10++;
                } while (i10 < size);
            }
            this.layoutDelegate.N();
        }
    }

    private final C0845y l0() {
        C0845y c0845y = this.intrinsicsPolicy;
        if (c0845y != null) {
            return c0845y;
        }
        C0845y c0845y2 = new C0845y(this, getMeasurePolicy());
        this.intrinsicsPolicy = c0845y2;
        return c0845y2;
    }

    public static /* synthetic */ boolean l1(G g10, U0.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g10.layoutDelegate.y();
        }
        return g10.k1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(G g10, G g11) {
        return g10.u0() == g11.u0() ? C3862t.i(g10.p0(), g11.p0()) : Float.compare(g10.u0(), g11.u0());
    }

    public static /* synthetic */ void q1(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g10.p1(z10);
    }

    public static /* synthetic */ void s1(G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        g10.r1(z10, z11, z12);
    }

    private final void t(b0.i modifier) {
        this._modifier = modifier;
        this.nodes.E(modifier);
        this.layoutDelegate.c0();
        if (this.lookaheadRoot == null && this.nodes.q(e0.a(512))) {
            E1(this);
        }
    }

    private final float u0() {
        return d0().u1();
    }

    public static /* synthetic */ void u1(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g10.t1(z10);
    }

    private final void w() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = g.NotUsed;
        Q.b<G> bVarW0 = w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                if (g10.intrinsicsUsageByParent == g.InLayoutBlock) {
                    g10.w();
                }
                i10++;
            } while (i10 < size);
        }
    }

    public static /* synthetic */ void w1(G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        g10.v1(z10, z11, z12);
    }

    private final String x(int depth) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < depth; i10++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        Q.b<G> bVarW0 = w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            int i11 = 0;
            do {
                sb2.append(gArrT[i11].x(depth + 1));
                i11++;
            } while (i11 < size);
        }
        String string = sb2.toString();
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        C3862t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    static /* synthetic */ String y(G g10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return g10.x(i10);
    }

    public static /* synthetic */ void y0(G g10, long j10, C0841u c0841u, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        g10.x0(j10, c0841u, z12, z11);
    }

    private final void y1() {
        this.nodes.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void A() {
        if (W() != e.Idle || V() || e0() || getIsDeactivated() || !o()) {
            return;
        }
        C0819a0 c0819a0 = this.nodes;
        int iA = e0.a(256);
        if ((c0819a0.i() & iA) != 0) {
            for (i.c head = c0819a0.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    AbstractC0834m abstractC0834mG = head;
                    Q.b bVar = null;
                    while (abstractC0834mG != 0) {
                        if (abstractC0834mG instanceof InterfaceC0840t) {
                            InterfaceC0840t interfaceC0840t = (InterfaceC0840t) abstractC0834mG;
                            interfaceC0840t.F(C0832k.h(interfaceC0840t, e0.a(256)));
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
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final void A1(boolean z10) {
        this.canMultiMeasure = z10;
    }

    public final void B(InterfaceC3586l0 canvas, C3870c graphicsLayer) {
        m0().a2(canvas, graphicsLayer);
    }

    public final void B0(int index, G instance) {
        if (!(instance._foldedParent == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(instance);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(y(this, 0, 1, null));
            sb2.append(" Other tree: ");
            G g10 = instance._foldedParent;
            sb2.append(g10 != null ? y(g10, 0, 1, null) : null);
            C5047a.b(sb2.toString());
        }
        if (!(instance.owner == null)) {
            C5047a.b("Cannot insert " + instance + " because it already has an owner. This tree: " + y(this, 0, 1, null) + " Other tree: " + y(instance, 0, 1, null));
        }
        instance._foldedParent = this;
        this._foldedChildren.a(index, instance);
        h1();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        J0();
        m0 m0Var = this.owner;
        if (m0Var != null) {
            instance.u(m0Var);
        }
        if (instance.layoutDelegate.s() > 0) {
            L l10 = this.layoutDelegate;
            l10.W(l10.s() + 1);
        }
    }

    public final void B1(boolean z10) {
        this.innerLayerCoordinatorIsDirty = z10;
    }

    public final boolean C() {
        AbstractC0818a abstractC0818aD;
        L l10 = this.layoutDelegate;
        if (l10.r().d().k()) {
            return true;
        }
        InterfaceC0820b interfaceC0820bC = l10.C();
        return (interfaceC0820bC == null || (abstractC0818aD = interfaceC0820bC.d()) == null || !abstractC0818aD.k()) ? false : true;
    }

    public final void C1(androidx.compose.ui.viewinterop.c cVar) {
        this.interopViewFactoryHolder = cVar;
    }

    public final boolean D() {
        return this.pendingModifier != null;
    }

    public final void D0() {
        AbstractC0823c0 abstractC0823c0Q = Q();
        if (abstractC0823c0Q != null) {
            abstractC0823c0Q.C2();
            return;
        }
        G gO0 = o0();
        if (gO0 != null) {
            gO0.D0();
        }
    }

    public final void D1(g gVar) {
        this.intrinsicsUsageByParent = gVar;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void E0() {
        AbstractC0823c0 abstractC0823c0M0 = m0();
        AbstractC0823c0 abstractC0823c0P = P();
        while (abstractC0823c0M0 != abstractC0823c0P) {
            C3862t.e(abstractC0823c0M0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C c10 = (C) abstractC0823c0M0;
            l0 layer = c10.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            abstractC0823c0M0 = c10.getWrapped();
        }
        l0 layer2 = P().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final List<y0.H> F() {
        L.a aVarZ = Z();
        C3862t.d(aVarZ);
        return aVarZ.S0();
    }

    public final void F0() {
        if (this.lookaheadRoot != null) {
            s1(this, false, false, false, 7, null);
        } else {
            w1(this, false, false, false, 7, null);
        }
    }

    public final void F1(boolean z10) {
        this.needsOnPositionedDispatch = z10;
    }

    public final List<y0.H> G() {
        return d0().Z0();
    }

    public final void G0() {
        if (V() || e0() || this.needsOnPositionedDispatch) {
            return;
        }
        K.b(this).i(this);
    }

    public final void G1(Ba.l<? super m0, C4153F> lVar) {
        this.onAttach = lVar;
    }

    public final List<G> H() {
        return w0().j();
    }

    public final void H0() {
        this.layoutDelegate.M();
    }

    public final void H1(Ba.l<? super m0, C4153F> lVar) {
        this.onDetach = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [F0.l, T] */
    public final F0.l I() {
        if (!K0() || getIsDeactivated()) {
            return null;
        }
        if (!this.nodes.q(e0.a(8)) || this._collapsedSemantics != null) {
            return this._collapsedSemantics;
        }
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        o10.f43978B = new F0.l();
        K.b(this).getSnapshotObserver().j(this, new j(o10));
        T t10 = o10.f43978B;
        this._collapsedSemantics = (F0.l) t10;
        return (F0.l) t10;
    }

    public final void I0() {
        this._collapsedSemantics = null;
        K.b(this).w();
    }

    public void I1(int i10) {
        this.semanticsId = i10;
    }

    /* renamed from: J, reason: from getter */
    public InterfaceC1578x getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    public final void J1(C5093D c5093d) {
        this.subcompositionsState = c5093d;
    }

    /* renamed from: K, reason: from getter */
    public U0.d getDensity() {
        return this.density;
    }

    public boolean K0() {
        return this.owner != null;
    }

    public final void K1() {
        if (this.virtualChildrenCount > 0) {
            j1();
        }
    }

    /* renamed from: L, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    /* renamed from: L0, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    public final List<G> M() {
        return this._foldedChildren.b();
    }

    public final boolean M0() {
        return d0().z1();
    }

    public final boolean N() {
        long jL2 = P().l2();
        return U0.b.j(jL2) && U0.b.i(jL2);
    }

    public final Boolean N0() {
        L.a aVarZ = Z();
        if (aVarZ != null) {
            return Boolean.valueOf(aVarZ.o());
        }
        return null;
    }

    public int O() {
        return this.layoutDelegate.x();
    }

    /* renamed from: O0, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final AbstractC0823c0 P() {
        return this.nodes.getInnerCoordinator();
    }

    public final boolean P0(U0.b constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        L.a aVarZ = Z();
        C3862t.d(aVarZ);
        return aVarZ.G1(constraints.getValue());
    }

    public View R() {
        androidx.compose.ui.viewinterop.c cVar = this.interopViewFactoryHolder;
        if (cVar != null) {
            return cVar.getInteropView();
        }
        return null;
    }

    public final void R0() {
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            w();
        }
        L.a aVarZ = Z();
        C3862t.d(aVarZ);
        aVarZ.H1();
    }

    /* renamed from: S, reason: from getter */
    public final androidx.compose.ui.viewinterop.c getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    public final void S0() {
        this.layoutDelegate.O();
    }

    /* renamed from: T, reason: from getter */
    public final g getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void T0() {
        this.layoutDelegate.P();
    }

    /* renamed from: U, reason: from getter */
    public final L getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final void U0() {
        this.layoutDelegate.Q();
    }

    public final boolean V() {
        return this.layoutDelegate.A();
    }

    public final void V0() {
        this.layoutDelegate.R();
    }

    public final e W() {
        return this.layoutDelegate.B();
    }

    public final int W0(int width) {
        return l0().b(width);
    }

    public final boolean X() {
        return this.layoutDelegate.F();
    }

    public final int X0(int height) {
        return l0().c(height);
    }

    public final boolean Y() {
        return this.layoutDelegate.G();
    }

    public final int Y0(int width) {
        return l0().d(width);
    }

    public final L.a Z() {
        return this.layoutDelegate.H();
    }

    public final int Z0(int height) {
        return l0().e(height);
    }

    @Override // kotlin.InterfaceC1552k
    public void a() {
        androidx.compose.ui.viewinterop.c cVar = this.interopViewFactoryHolder;
        if (cVar != null) {
            cVar.a();
        }
        C5093D c5093d = this.subcompositionsState;
        if (c5093d != null) {
            c5093d.a();
        }
        AbstractC0823c0 wrapped = P().getWrapped();
        for (AbstractC0823c0 abstractC0823c0M0 = m0(); !C3862t.b(abstractC0823c0M0, wrapped) && abstractC0823c0M0 != null; abstractC0823c0M0 = abstractC0823c0M0.getWrapped()) {
            abstractC0823c0M0.M2();
        }
    }

    /* renamed from: a0, reason: from getter */
    public final G getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final int a1(int width) {
        return l0().f(width);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // A0.InterfaceC0828g
    public void b(U0.t tVar) {
        if (this.layoutDirection != tVar) {
            this.layoutDirection = tVar;
            g1();
            C0819a0 c0819a0 = this.nodes;
            int iA = e0.a(4);
            if ((c0819a0.i() & iA) != 0) {
                for (i.c head = c0819a0.getHead(); head != null; head = head.getChild()) {
                    if ((head.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = head;
                        Q.b bVar = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof r) {
                                r rVar = (r) abstractC0834mG;
                                if (rVar instanceof InterfaceC3302c) {
                                    ((InterfaceC3302c) rVar).Y();
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
                    if ((head.getAggregateChildKindSet() & iA) == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // A0.n0
    public boolean b0() {
        return K0();
    }

    public final int b1(int height) {
        return l0().g(height);
    }

    @Override // A0.InterfaceC0828g
    public void c(U0.d dVar) {
        if (C3862t.b(this.density, dVar)) {
            return;
        }
        this.density = dVar;
        g1();
        for (i.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
            if ((e0.a(16) & head.getKindSet()) != 0) {
                ((s0) head).N0();
            } else if (head instanceof InterfaceC3302c) {
                ((InterfaceC3302c) head).Y();
            }
        }
    }

    public final I c0() {
        return K.b(this).getSharedDrawScope();
    }

    public final int c1(int width) {
        return l0().h(width);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // A0.m0.b
    public void d() {
        AbstractC0823c0 abstractC0823c0P = P();
        int iA = e0.a(128);
        boolean zI = f0.i(iA);
        i.c cVarR2 = abstractC0823c0P.r2();
        if (!zI && (cVarR2 = cVarR2.getParent()) == null) {
            return;
        }
        for (i.c cVarX2 = abstractC0823c0P.x2(zI); cVarX2 != null && (cVarX2.getAggregateChildKindSet() & iA) != 0; cVarX2 = cVarX2.getChild()) {
            if ((cVarX2.getKindSet() & iA) != 0) {
                AbstractC0834m abstractC0834mG = cVarX2;
                Q.b bVar = null;
                while (abstractC0834mG != 0) {
                    if (abstractC0834mG instanceof A) {
                        ((A) abstractC0834mG).M(P());
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
            if (cVarX2 == cVarR2) {
                return;
            }
        }
    }

    public final L.b d0() {
        return this.layoutDelegate.I();
    }

    public final int d1(int height) {
        return l0().i(height);
    }

    @Override // A0.InterfaceC0828g
    public void e(b0.i iVar) {
        if (!(!this.isVirtual || get_modifier() == b0.i.INSTANCE)) {
            C5047a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            C5047a.a("modifier is updated when deactivated");
        }
        if (K0()) {
            t(iVar);
        } else {
            this.pendingModifier = iVar;
        }
    }

    public final boolean e0() {
        return this.layoutDelegate.J();
    }

    public final void e1(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i10 = 0; i10 < count; i10++) {
            this._foldedChildren.a(from > to ? to + i10 : (to + count) - 2, this._foldedChildren.g(from > to ? from + i10 : from));
        }
        h1();
        J0();
        F0();
    }

    @Override // A0.InterfaceC0828g
    public void f(y0.I i10) {
        if (C3862t.b(this.measurePolicy, i10)) {
            return;
        }
        this.measurePolicy = i10;
        C0845y c0845y = this.intrinsicsPolicy;
        if (c0845y != null) {
            c0845y.k(getMeasurePolicy());
        }
        F0();
    }

    /* renamed from: f0, reason: from getter */
    public y0.I getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // A0.InterfaceC0828g
    public void g(int i10) {
        this.compositeKeyHash = i10;
    }

    public final g g0() {
        return d0().m1();
    }

    @Override // y0.InterfaceC5120z
    public U0.t getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // y0.InterfaceC5120z
    public InterfaceC5116v h() {
        return P();
    }

    public final g h0() {
        g gVarZ0;
        L.a aVarZ = Z();
        return (aVarZ == null || (gVarZ0 = aVarZ.Z0()) == null) ? g.NotUsed : gVarZ0;
    }

    public final void h1() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        G gO0 = o0();
        if (gO0 != null) {
            gO0.h1();
        }
    }

    @Override // kotlin.InterfaceC1552k
    public void i() {
        androidx.compose.ui.viewinterop.c cVar = this.interopViewFactoryHolder;
        if (cVar != null) {
            cVar.i();
        }
        C5093D c5093d = this.subcompositionsState;
        if (c5093d != null) {
            c5093d.i();
        }
        this.isDeactivated = true;
        y1();
        if (K0()) {
            I0();
        }
    }

    /* renamed from: i0, reason: from getter */
    public b0.i get_modifier() {
        return this._modifier;
    }

    public final void i1(int x10, int y10) {
        Z.a placementScope;
        AbstractC0823c0 abstractC0823c0P;
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            w();
        }
        G gO0 = o0();
        if (gO0 == null || (abstractC0823c0P = gO0.P()) == null || (placementScope = abstractC0823c0P.getPlacementScope()) == null) {
            placementScope = K.b(this).getPlacementScope();
        }
        Z.a.l(placementScope, d0(), x10, y10, 0.0f, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // A0.InterfaceC0828g
    public void j(InterfaceC1578x interfaceC1578x) {
        this.compositionLocalMap = interfaceC1578x;
        c((U0.d) interfaceC1578x.a(C2013e0.d()));
        b((U0.t) interfaceC1578x.a(C2013e0.h()));
        l((i1) interfaceC1578x.a(C2013e0.m()));
        C0819a0 c0819a0 = this.nodes;
        int iA = e0.a(32768);
        if ((c0819a0.i() & iA) != 0) {
            for (i.c head = c0819a0.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    AbstractC0834m abstractC0834mG = head;
                    Q.b bVar = null;
                    while (abstractC0834mG != 0) {
                        if (abstractC0834mG instanceof InterfaceC0829h) {
                            i.c node = ((InterfaceC0829h) abstractC0834mG).getNode();
                            if (node.getIsAttached()) {
                                f0.e(node);
                            } else {
                                node.g2(true);
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
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: j0, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    @Override // y0.b0
    public void k() {
        if (this.lookaheadRoot != null) {
            s1(this, false, false, false, 5, null);
        } else {
            w1(this, false, false, false, 5, null);
        }
        U0.b bVarY = this.layoutDelegate.y();
        if (bVarY != null) {
            m0 m0Var = this.owner;
            if (m0Var != null) {
                m0Var.A(this, bVarY.getValue());
                return;
            }
            return;
        }
        m0 m0Var2 = this.owner;
        if (m0Var2 != null) {
            m0.y(m0Var2, false, 1, null);
        }
    }

    /* renamed from: k0, reason: from getter */
    public final C0819a0 getNodes() {
        return this.nodes;
    }

    public final boolean k1(U0.b constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            v();
        }
        return d0().N1(constraints.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // A0.InterfaceC0828g
    public void l(i1 i1Var) {
        if (C3862t.b(this.viewConfiguration, i1Var)) {
            return;
        }
        this.viewConfiguration = i1Var;
        C0819a0 c0819a0 = this.nodes;
        int iA = e0.a(16);
        if ((c0819a0.i() & iA) != 0) {
            for (i.c head = c0819a0.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    AbstractC0834m abstractC0834mG = head;
                    Q.b bVar = null;
                    while (abstractC0834mG != 0) {
                        if (abstractC0834mG instanceof s0) {
                            ((s0) abstractC0834mG).v1();
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
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final AbstractC0823c0 m0() {
        return this.nodes.getOuterCoordinator();
    }

    public final void m1() {
        int iE = this._foldedChildren.e();
        while (true) {
            iE--;
            if (-1 >= iE) {
                this._foldedChildren.c();
                return;
            }
            f1(this._foldedChildren.d(iE));
        }
    }

    /* renamed from: n0, reason: from getter */
    public final m0 getOwner() {
        return this.owner;
    }

    public final void n1(int index, int count) {
        if (!(count >= 0)) {
            C5047a.a("count (" + count + ") must be greater than 0");
        }
        int i10 = (count + index) - 1;
        if (index > i10) {
            return;
        }
        while (true) {
            f1(this._foldedChildren.d(i10));
            this._foldedChildren.g(i10);
            if (i10 == index) {
                return;
            } else {
                i10--;
            }
        }
    }

    @Override // y0.InterfaceC5120z
    public boolean o() {
        return d0().o();
    }

    public final G o0() {
        G g10 = this._foldedParent;
        while (g10 != null && g10.isVirtual) {
            g10 = g10._foldedParent;
        }
        return g10;
    }

    public final void o1() {
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            w();
        }
        d0().O1();
    }

    @Override // kotlin.InterfaceC1552k
    public void p() {
        if (!K0()) {
            C5047a.a("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.c cVar = this.interopViewFactoryHolder;
        if (cVar != null) {
            cVar.p();
        }
        C5093D c5093d = this.subcompositionsState;
        if (c5093d != null) {
            c5093d.p();
        }
        if (getIsDeactivated()) {
            this.isDeactivated = false;
            I0();
        } else {
            y1();
        }
        I1(F0.o.b());
        this.nodes.s();
        this.nodes.y();
        x1(this);
    }

    public final int p0() {
        return d0().q1();
    }

    public final void p1(boolean forceRequest) {
        m0 m0Var;
        if (this.isVirtual || (m0Var = this.owner) == null) {
            return;
        }
        m0Var.z(this, true, forceRequest);
    }

    /* renamed from: q0, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    /* renamed from: r0, reason: from getter */
    public final C5093D getSubcompositionsState() {
        return this.subcompositionsState;
    }

    public final void r1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            C5047a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        m0 m0Var = this.owner;
        if (m0Var == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        m0Var.n(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            L.a aVarZ = Z();
            C3862t.d(aVarZ);
            aVarZ.e1(forceRequest);
        }
    }

    /* renamed from: s0, reason: from getter */
    public i1 getViewConfiguration() {
        return this.viewConfiguration;
    }

    public int t0() {
        return this.layoutDelegate.L();
    }

    public final void t1(boolean forceRequest) {
        m0 m0Var;
        if (this.isVirtual || (m0Var = this.owner) == null) {
            return;
        }
        m0.t(m0Var, this, false, forceRequest, 2, null);
    }

    public String toString() {
        return C2046v0.a(this, null) + " children: " + H().size() + " measurePolicy: " + getMeasurePolicy();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(A0.m0 r7) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.G.u(A0.m0):void");
    }

    public final void v() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = g.NotUsed;
        Q.b<G> bVarW0 = w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                if (g10.intrinsicsUsageByParent != g.NotUsed) {
                    g10.v();
                }
                i10++;
            } while (i10 < size);
        }
    }

    public final Q.b<G> v0() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.l();
            Q.b<G> bVar = this._zSortedChildren;
            bVar.e(bVar.getSize(), w0());
            this._zSortedChildren.J(f296r0);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final void v1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        m0 m0Var;
        if (this.ignoreRemeasureRequests || this.isVirtual || (m0Var = this.owner) == null) {
            return;
        }
        m0.b(m0Var, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            d0().v1(forceRequest);
        }
    }

    public final Q.b<G> w0() {
        K1();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.f();
        }
        Q.b<G> bVar = this._unfoldedChildren;
        C3862t.d(bVar);
        return bVar;
    }

    public final void x0(long pointerPosition, C0841u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        m0().A2(AbstractC0823c0.INSTANCE.a(), AbstractC0823c0.g2(m0(), pointerPosition, false, 2, null), hitTestResult, isTouchEvent, isInLayer);
    }

    public final void x1(G it) {
        if (h.f346a[it.W().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.W());
        }
        if (it.Y()) {
            s1(it, true, false, false, 6, null);
            return;
        }
        if (it.X()) {
            it.p1(true);
        }
        if (it.e0()) {
            w1(it, true, false, false, 6, null);
        } else if (it.V()) {
            it.t1(true);
        }
    }

    public final void z() {
        m0 m0Var = this.owner;
        if (m0Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            G gO0 = o0();
            sb2.append(gO0 != null ? y(gO0, 0, 1, null) : null);
            C5047a.c(sb2.toString());
            throw new KotlinNothingValueException();
        }
        G gO02 = o0();
        if (gO02 != null) {
            gO02.D0();
            gO02.F0();
            L.b bVarD0 = d0();
            g gVar = g.NotUsed;
            bVarD0.Q1(gVar);
            L.a aVarZ = Z();
            if (aVarZ != null) {
                aVarZ.J1(gVar);
            }
        }
        this.layoutDelegate.V();
        Ba.l<? super m0, C4153F> lVar = this.onDetach;
        if (lVar != null) {
            lVar.invoke(m0Var);
        }
        if (this.nodes.q(e0.a(8))) {
            I0();
        }
        this.nodes.z();
        this.ignoreRemeasureRequests = true;
        Q.b<G> bVarF = this._foldedChildren.f();
        int size = bVarF.getSize();
        if (size > 0) {
            G[] gArrT = bVarF.t();
            int i10 = 0;
            do {
                gArrT[i10].z();
                i10++;
            } while (i10 < size);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.t();
        m0Var.l(this);
        this.owner = null;
        E1(null);
        this.depth = 0;
        d0().J1();
        L.a aVarZ2 = Z();
        if (aVarZ2 != null) {
            aVarZ2.A1();
        }
    }

    public final void z0(long pointerPosition, C0841u hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        m0().A2(AbstractC0823c0.INSTANCE.b(), AbstractC0823c0.g2(m0(), pointerPosition, false, 2, null), hitSemanticsEntities, true, isInLayer);
    }

    public final void z1() {
        Q.b<G> bVarW0 = w0();
        int size = bVarW0.getSize();
        if (size > 0) {
            G[] gArrT = bVarW0.t();
            int i10 = 0;
            do {
                G g10 = gArrT[i10];
                g gVar = g10.previousIntrinsicsUsageByParent;
                g10.intrinsicsUsageByParent = gVar;
                if (gVar != g.NotUsed) {
                    g10.z1();
                }
                i10++;
            } while (i10 < size);
        }
    }

    public G(boolean z10, int i10) {
        this.isVirtual = z10;
        this.semanticsId = i10;
        this._foldedChildren = new X<>(new Q.b(new G[16], 0), new i());
        this._zSortedChildren = new Q.b<>(new G[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = f293o0;
        this.density = K.f352a;
        this.layoutDirection = U0.t.Ltr;
        this.viewConfiguration = f295q0;
        this.compositionLocalMap = InterfaceC1578x.INSTANCE.a();
        g gVar = g.NotUsed;
        this.intrinsicsUsageByParent = gVar;
        this.previousIntrinsicsUsageByParent = gVar;
        this.nodes = new C0819a0(this);
        this.layoutDelegate = new L(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = b0.i.INSTANCE;
    }

    public /* synthetic */ G(boolean z10, int i10, int i11, C3854k c3854k) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? F0.o.b() : i10);
    }
}
