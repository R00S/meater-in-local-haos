package A0;

import androidx.compose.runtime.snapshots.g;
import b0.i;
import h0.C3475f;
import h0.C3476g;
import h0.C3477h;
import h0.C3478i;
import h0.C3482m;
import h0.C3483n;
import h0.MutableRect;
import i0.InterfaceC3586l0;
import i0.L0;
import i0.P0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;
import oa.C4153F;
import x0.C5047a;
import y0.AbstractC5096a;
import y0.C5095F;
import y0.C5117w;
import y0.InterfaceC5116v;

/* compiled from: NodeCoordinator.kt */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 \u009b\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u009c\u0002\u009d\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J@\u0010.\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/JH\u00101\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102JH\u00103\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00102J\u0013\u00104\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J*\u00109\u001a\u00020(2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00182\u0006\u0010@\u001a\u00020;2\u0006\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\bA\u0010BJ\u001a\u0010C\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001e\u0010E\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\t¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0018H\u0010¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0018H&¢\u0006\u0004\bK\u0010JJ\u001f\u0010O\u001a\u00020\u00182\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020LH\u0014¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0018H\u0000¢\u0006\u0004\bQ\u0010JJ\r\u0010R\u001a\u00020\u0018¢\u0006\u0004\bR\u0010JJ8\u0010S\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ*\u0010V\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u001aH\u0014ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u0018¢\u0006\u0004\bX\u0010JJ@\u0010Y\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010U\u001a\u0004\u0018\u00010\u001aø\u0001\u0000¢\u0006\u0004\bY\u0010\u001dJ\u001f\u0010Z\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bZ\u0010\"J!\u0010[\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b[\u0010\"J\r\u0010\\\u001a\u00020\u0018¢\u0006\u0004\b\\\u0010JJ-\u0010^\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010]\u001a\u00020\t¢\u0006\u0004\b^\u0010_J8\u0010`\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b`\u0010aJ:\u0010b\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bb\u0010aJ\r\u0010d\u001a\u00020c¢\u0006\u0004\bd\u0010eJ\u001a\u0010g\u001a\u00020(2\u0006\u0010f\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bg\u0010DJ\"\u0010j\u001a\u00020(2\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ*\u0010l\u001a\u00020(2\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020(2\u0006\u00108\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00020c2\u0006\u0010h\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\tH\u0016¢\u0006\u0004\bn\u0010oJ\u001a\u0010p\u001a\u00020(2\u0006\u0010f\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010DJ$\u0010q\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u00108\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ$\u0010s\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u00108\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bs\u0010rJ\u001f\u0010v\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020tH\u0004¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u0018¢\u0006\u0004\bx\u0010JJ\r\u0010y\u001a\u00020\u0018¢\u0006\u0004\by\u0010JJ)\u0010{\u001a\u00020\u00182\u0006\u0010@\u001a\u00020;2\u0006\u0010=\u001a\u00020\t2\b\b\u0002\u0010z\u001a\u00020\tH\u0000¢\u0006\u0004\b{\u0010|J\u001a\u0010}\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\u001a\u0010\u007f\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010~J\u0011\u0010\u0080\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0080\u0001\u0010JJ\u0011\u0010\u0081\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0081\u0001\u0010JJ\u001b\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020\t¢\u0006\u0005\b\u0085\u0001\u0010HJ\u001f\u0010\u0088\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b\u0088\u0001\u0010DJ'\u0010\u0089\u0001\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0092\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bj\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010H\"\u0005\b\u0091\u0001\u0010%R'\u0010\u0096\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u0093\u0001\u0010\u008f\u0001\u001a\u0005\b\u0094\u0001\u0010H\"\u0005\b\u0095\u0001\u0010%R+\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R+\u0010¡\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0098\u0001\u001a\u0006\b\u009f\u0001\u0010\u009a\u0001\"\u0006\b \u0001\u0010\u009c\u0001R\u0019\u0010£\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u008f\u0001R\u0019\u0010¥\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u008f\u0001RE\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0015\u0010¦\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010®\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010±\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010°\u0001R\u0019\u0010´\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001c\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R(\u0010¼\u0001\u001a\u0012\u0012\u0005\u0012\u00030º\u0001\u0012\u0004\u0012\u00020L\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010»\u0001R7\u0010\u0013\u001a\u00020\u00122\u0007\u0010¦\u0001\u001a\u00020\u00128\u0016@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R1\u0010\u0015\u001a\u00020\u00142\u0007\u0010¦\u0001\u001a\u00020\u00148\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010³\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001\"\u0006\bÆ\u0001\u0010Ç\u0001R\u001b\u0010Ê\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001b\u0010Í\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bl\u0010Ì\u0001R3\u0010Ò\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180Î\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÏ\u0001\u0010Ð\u0001\u0012\u0005\bÑ\u0001\u0010JR\u001e\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R)\u0010Ù\u0001\u001a\u00020\t2\u0007\u0010¦\u0001\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b×\u0001\u0010\u008f\u0001\u001a\u0005\bØ\u0001\u0010HR/\u0010U\u001a\u0005\u0018\u00010Ú\u00012\n\u0010¦\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u0018\u0010ä\u0001\u001a\u00030á\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001R\u0017\u0010ç\u0001\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u0018\u0010ê\u0001\u001a\u00030¯\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0017\u0010ì\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010Å\u0001R\u0017\u0010î\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010Å\u0001R\u0019\u0010ñ\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001R\u0017\u0010ô\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0001\u0010ó\u0001R\u001b\u0010÷\u0001\u001a\u00030õ\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bö\u0001\u0010À\u0001R\u0018\u0010û\u0001\u001a\u00030ø\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bù\u0001\u0010ú\u0001R\u0019\u0010ý\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bü\u0001\u0010ð\u0001R\u0016\u0010ÿ\u0001\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bþ\u0001\u0010HR\u0016\u0010\u0081\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010HR,\u0010\u0087\u0002\u001a\u00030µ\u00012\b\u0010\u0082\u0002\u001a\u00030µ\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R0\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u0088\u00022\n\u0010¦\u0001\u001a\u0005\u0018\u00010\u0088\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002\"\u0006\b\u008b\u0002\u0010\u008c\u0002R\u001a\u0010\u0091\u0002\u001a\u0005\u0018\u00010\u008e\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R\u0016\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010ó\u0001R\u0017\u0010\u0095\u0002\u001a\u00020;8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u001e\u0010\u0098\u0002\u001a\u00030\u0096\u00028@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010À\u0001R\u0016\u0010\u0099\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010HR\u001b\u0010\u0087\u0001\u001a\u00030\u0086\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010À\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009e\u0002"}, d2 = {"LA0/c0;", "LA0/P;", "Ly0/H;", "Ly0/v;", "LA0/n0;", "LA0/G;", "layoutNode", "<init>", "(LA0/G;)V", "", "includeTail", "Lb0/i$c;", "x2", "(Z)Lb0/i$c;", "LA0/e0;", "type", "v2", "(I)Z", "LU0/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Loa/F;", "layerBlock", "Ll0/c;", "explicitLayer", "O2", "(JFLBa/l;Ll0/c;)V", "Li0/l0;", "canvas", "graphicsLayer", "c2", "(Li0/l0;Ll0/c;)V", "invokeOnLayoutChange", "h3", "(Z)V", "LA0/c0$f;", "hitTestSource", "Lh0/g;", "pointerPosition", "LA0/u;", "hitTestResult", "isTouchEvent", "isInLayer", "y2", "(Lb0/i$c;LA0/c0$f;JLA0/u;ZZ)V", "distanceFromEdge", "z2", "(Lb0/i$c;LA0/c0$f;JLA0/u;ZZF)V", "a3", "b3", "(Ly0/v;)LA0/c0;", "ancestor", "offset", "includeMotionFrameOfReference", "X1", "(LA0/c0;JZ)J", "Lh0/e;", "rect", "clipBounds", "W1", "(LA0/c0;Lh0/e;Z)V", "bounds", "h2", "(Lh0/e;Z)V", "F2", "(J)J", "w2", "(I)Lb0/i$c;", "E2", "()Z", "F1", "()V", "d2", "", "width", "height", "J2", "(II)V", "G2", "K2", "C0", "(JFLBa/l;)V", "layer", "D0", "(JFLl0/c;)V", "S2", "P2", "a2", "N2", "L2", "forceUpdateLayerParameters", "f3", "(LBa/l;Z)V", "A2", "(LA0/c0$f;JLA0/u;ZZ)V", "B2", "Lh0/i;", "e3", "()Lh0/i;", "relativeToLocal", "u", "sourceCoordinates", "relativeToSource", "R", "(Ly0/v;J)J", "g0", "(Ly0/v;JZ)J", "M", "(Ly0/v;Z)Lh0/i;", "c0", "c3", "(JZ)J", "f2", "Li0/P0;", "paint", "b2", "(Li0/l0;Li0/P0;)V", "I2", "M2", "clipToMinimumTouchTargetSize", "Q2", "(Lh0/e;ZZ)V", "j3", "(J)Z", "D2", "C2", "H2", "other", "e2", "(LA0/c0;)LA0/c0;", "Z2", "Lh0/m;", "minimumTouchTargetSize", "Y1", "Z1", "(JJ)F", "Q", "LA0/G;", "s1", "()LA0/G;", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "U2", "forcePlaceWithLookaheadOffset", "S", "j2", "T2", "forceMeasureWithLookaheadConstraints", "T", "LA0/c0;", "s2", "()LA0/c0;", "X2", "(LA0/c0;)V", "wrapped", "U", "t2", "Y2", "wrappedBy", "V", "released", "W", "isClipping", "<set-?>", "X", "LBa/l;", "getLayerBlock", "()LBa/l;", "LU0/d;", "Y", "LU0/d;", "layerDensity", "LU0/t;", "LU0/t;", "layerLayoutDirection", "a0", "F", "lastLayerAlpha", "Ly0/J;", "b0", "Ly0/J;", "_measureResult", "", "Ly0/a;", "Ljava/util/Map;", "oldAlignmentLines", "d0", "J", "m1", "()J", "W2", "(J)V", "e0", "u2", "()F", "setZIndex", "(F)V", "f0", "Lh0/e;", "_rectCache", "LA0/z;", "LA0/z;", "layerPositionalProperties", "Lkotlin/Function2;", "h0", "LBa/p;", "getDrawBlock$annotations", "drawBlock", "Lkotlin/Function0;", "i0", "LBa/a;", "invalidateParentLayer", "j0", "k2", "lastLayerDrawingWasSkipped", "LA0/l0;", "k0", "LA0/l0;", "m2", "()LA0/l0;", "l0", "Ll0/c;", "LA0/o0;", "q2", "()LA0/o0;", "snapshotObserver", "r2", "()Lb0/i$c;", "tail", "getLayoutDirection", "()LU0/t;", "layoutDirection", "getDensity", "density", "R0", "fontScale", "c1", "()LA0/P;", "parent", "W0", "()Ly0/v;", "coordinates", "LU0/r;", "a", "size", "LA0/b;", "i2", "()LA0/b;", "alignmentLinesOwner", "V0", "child", "Y0", "hasMeasureResult", "L", "isAttached", "value", "Z0", "()Ly0/J;", "V2", "(Ly0/J;)V", "measureResult", "LA0/Q;", "n2", "()LA0/Q;", "setLookaheadDelegate", "(LA0/Q;)V", "lookaheadDelegate", "", "b", "()Ljava/lang/Object;", "parentData", "parentLayoutCoordinates", "p2", "()Lh0/e;", "rectCache", "LU0/b;", "l2", "lastMeasurementConstraints", "isValidOwnerScope", "o2", "m0", "e", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0823c0 extends P implements y0.H, InterfaceC5116v, n0 {

    /* renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n0, reason: collision with root package name */
    private static final Ba.l<AbstractC0823c0, C4153F> f535n0 = d.f565B;

    /* renamed from: o0, reason: collision with root package name */
    private static final Ba.l<AbstractC0823c0, C4153F> f536o0 = c.f564B;

    /* renamed from: p0, reason: collision with root package name */
    private static final androidx.compose.ui.graphics.d f537p0 = new androidx.compose.ui.graphics.d();

    /* renamed from: q0, reason: collision with root package name */
    private static final C0846z f538q0 = new C0846z();

    /* renamed from: r0, reason: collision with root package name */
    private static final float[] f539r0 = L0.c(null, 1, null);

    /* renamed from: s0, reason: collision with root package name */
    private static final f f540s0 = new a();

    /* renamed from: t0, reason: collision with root package name */
    private static final f f541t0 = new b();

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final G layoutNode;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean forcePlaceWithLookaheadOffset;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean forceMeasureWithLookaheadConstraints;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private AbstractC0823c0 wrapped;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private AbstractC0823c0 wrappedBy;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private boolean released;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private boolean isClipping;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private y0.J _measureResult;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private Map<AbstractC5096a, Integer> oldAlignmentLines;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private MutableRect _rectCache;

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private C0846z layerPositionalProperties;

    /* renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private boolean lastLayerDrawingWasSkipped;

    /* renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private l0 layer;

    /* renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private C3870c explicitLayer;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private U0.d layerDensity = getLayoutNode().getDensity();

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private U0.t layerLayoutDirection = getLayoutNode().getLayoutDirection();

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private float lastLayerAlpha = 0.8f;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private long position = U0.n.INSTANCE.a();

    /* renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<InterfaceC3586l0, C3870c, C4153F> drawBlock = new g();

    /* renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> invalidateParentLayer = new j();

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"A0/c0$a", "LA0/c0$f;", "LA0/e0;", "LA0/s0;", "b", "()I", "Lb0/i$c;", "node", "", "c", "(Lb0/i$c;)Z", "LA0/G;", "parentLayoutNode", "a", "(LA0/G;)Z", "layoutNode", "Lh0/g;", "pointerPosition", "LA0/u;", "hitTestResult", "isTouchEvent", "isInLayer", "Loa/F;", "d", "(LA0/G;JLA0/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.c0$a */
    public static final class a implements f {
        a() {
        }

        @Override // A0.AbstractC0823c0.f
        public boolean a(G parentLayoutNode) {
            return true;
        }

        @Override // A0.AbstractC0823c0.f
        public int b() {
            return e0.a(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [b0.i$c] */
        /* JADX WARN: Type inference failed for: r10v1, types: [b0.i$c] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v11 */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [b0.i$c] */
        /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v7 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        @Override // A0.AbstractC0823c0.f
        public boolean c(i.c node) {
            int iA = e0.a(16);
            Q.b bVar = null;
            while (node != 0) {
                if (node instanceof s0) {
                    if (((s0) node).B0()) {
                        return true;
                    }
                } else if ((node.getKindSet() & iA) != 0 && (node instanceof AbstractC0834m)) {
                    i.c cVarK2 = node.getDelegate();
                    int i10 = 0;
                    node = node;
                    while (cVarK2 != null) {
                        if ((cVarK2.getKindSet() & iA) != 0) {
                            i10++;
                            if (i10 == 1) {
                                node = cVarK2;
                            } else {
                                if (bVar == null) {
                                    bVar = new Q.b(new i.c[16], 0);
                                }
                                if (node != 0) {
                                    bVar.c(node);
                                    node = 0;
                                }
                                bVar.c(cVarK2);
                            }
                        }
                        cVarK2 = cVarK2.getChild();
                        node = node;
                    }
                    if (i10 == 1) {
                    }
                }
                node = C0832k.g(bVar);
            }
            return false;
        }

        @Override // A0.AbstractC0823c0.f
        public void d(G layoutNode, long pointerPosition, C0841u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.x0(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"A0/c0$b", "LA0/c0$f;", "LA0/e0;", "LA0/v0;", "b", "()I", "Lb0/i$c;", "node", "", "c", "(Lb0/i$c;)Z", "LA0/G;", "parentLayoutNode", "a", "(LA0/G;)Z", "layoutNode", "Lh0/g;", "pointerPosition", "LA0/u;", "hitTestResult", "isTouchEvent", "isInLayer", "Loa/F;", "d", "(LA0/G;JLA0/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.c0$b */
    public static final class b implements f {
        b() {
        }

        @Override // A0.AbstractC0823c0.f
        public boolean a(G parentLayoutNode) {
            F0.l lVarI = parentLayoutNode.I();
            boolean z10 = false;
            if (lVarI != null && lVarI.getIsClearingSemantics()) {
                z10 = true;
            }
            return !z10;
        }

        @Override // A0.AbstractC0823c0.f
        public int b() {
            return e0.a(8);
        }

        @Override // A0.AbstractC0823c0.f
        public boolean c(i.c node) {
            return false;
        }

        @Override // A0.AbstractC0823c0.f
        public void d(G layoutNode, long pointerPosition, C0841u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.z0(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/c0;", "coordinator", "Loa/F;", "a", "(LA0/c0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c0$c */
    static final class c extends AbstractC3864v implements Ba.l<AbstractC0823c0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f564B = new c();

        c() {
            super(1);
        }

        public final void a(AbstractC0823c0 abstractC0823c0) {
            l0 layer = abstractC0823c0.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(AbstractC0823c0 abstractC0823c0) {
            a(abstractC0823c0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/c0;", "coordinator", "Loa/F;", "a", "(LA0/c0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c0$d */
    static final class d extends AbstractC3864v implements Ba.l<AbstractC0823c0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f565B = new d();

        d() {
            super(1);
        }

        public final void a(AbstractC0823c0 abstractC0823c0) {
            if (abstractC0823c0.b0()) {
                C0846z c0846z = abstractC0823c0.layerPositionalProperties;
                if (c0846z == null) {
                    AbstractC0823c0.i3(abstractC0823c0, false, 1, null);
                    return;
                }
                AbstractC0823c0.f538q0.a(c0846z);
                AbstractC0823c0.i3(abstractC0823c0, false, 1, null);
                if (AbstractC0823c0.f538q0.c(c0846z)) {
                    return;
                }
                G layoutNode = abstractC0823c0.getLayoutNode();
                L layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        G.u1(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().G1();
                }
                m0 owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.i(layoutNode);
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(AbstractC0823c0 abstractC0823c0) {
            a(abstractC0823c0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"LA0/c0$e;", "", "<init>", "()V", "LA0/c0$f;", "PointerInputSource", "LA0/c0$f;", "a", "()LA0/c0$f;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/d;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/d;", "Lkotlin/Function1;", "LA0/c0;", "Loa/F;", "onCommitAffectingLayer", "LBa/l;", "onCommitAffectingLayerParams", "LA0/z;", "tmpLayerPositionalProperties", "LA0/z;", "Li0/L0;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.c0$e, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final f a() {
            return AbstractC0823c0.f540s0;
        }

        public final f b() {
            return AbstractC0823c0.f541t0;
        }

        private Companion() {
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"LA0/c0$f;", "", "LA0/e0;", "b", "()I", "Lb0/i$c;", "node", "", "c", "(Lb0/i$c;)Z", "LA0/G;", "parentLayoutNode", "a", "(LA0/G;)Z", "layoutNode", "Lh0/g;", "pointerPosition", "LA0/u;", "hitTestResult", "isTouchEvent", "isInLayer", "Loa/F;", "d", "(LA0/G;JLA0/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.c0$f */
    public interface f {
        boolean a(G parentLayoutNode);

        int b();

        boolean c(i.c node);

        void d(G layoutNode, long pointerPosition, C0841u hitTestResult, boolean isTouchEvent, boolean isInLayer);
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li0/l0;", "canvas", "Ll0/c;", "parentLayer", "Loa/F;", "a", "(Li0/l0;Ll0/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c0$g */
    static final class g extends AbstractC3864v implements Ba.p<InterfaceC3586l0, C3870c, C4153F> {

        /* compiled from: NodeCoordinator.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.c0$g$a */
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ AbstractC0823c0 f567B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ InterfaceC3586l0 f568C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C3870c f569D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC0823c0 abstractC0823c0, InterfaceC3586l0 interfaceC3586l0, C3870c c3870c) {
                super(0);
                this.f567B = abstractC0823c0;
                this.f568C = interfaceC3586l0;
                this.f569D = c3870c;
            }

            public final void a() {
                this.f567B.c2(this.f568C, this.f569D);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        g() {
            super(2);
        }

        public final void a(InterfaceC3586l0 interfaceC3586l0, C3870c c3870c) {
            if (!AbstractC0823c0.this.getLayoutNode().o()) {
                AbstractC0823c0.this.lastLayerDrawingWasSkipped = true;
            } else {
                AbstractC0823c0.this.q2().i(AbstractC0823c0.this, AbstractC0823c0.f536o0, new a(AbstractC0823c0.this, interfaceC3586l0, c3870c));
                AbstractC0823c0.this.lastLayerDrawingWasSkipped = false;
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC3586l0 interfaceC3586l0, C3870c c3870c) {
            a(interfaceC3586l0, c3870c);
            return C4153F.f46609a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c0$h */
    static final class h extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i.c f571C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ f f572D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f573E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C0841u f574F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f575G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f576H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(i.c cVar, f fVar, long j10, C0841u c0841u, boolean z10, boolean z11) {
            super(0);
            this.f571C = cVar;
            this.f572D = fVar;
            this.f573E = j10;
            this.f574F = c0841u;
            this.f575G = z10;
            this.f576H = z11;
        }

        public final void a() {
            AbstractC0823c0.this.y2(C0825d0.b(this.f571C, this.f572D.b(), e0.a(2)), this.f572D, this.f573E, this.f574F, this.f575G, this.f576H);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c0$i */
    static final class i extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i.c f578C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ f f579D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f580E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C0841u f581F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f582G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f583H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f584I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(i.c cVar, f fVar, long j10, C0841u c0841u, boolean z10, boolean z11, float f10) {
            super(0);
            this.f578C = cVar;
            this.f579D = fVar;
            this.f580E = j10;
            this.f581F = c0841u;
            this.f582G = z10;
            this.f583H = z11;
            this.f584I = f10;
        }

        public final void a() {
            AbstractC0823c0.this.z2(C0825d0.b(this.f578C, this.f579D.b(), e0.a(2)), this.f579D, this.f580E, this.f581F, this.f582G, this.f583H, this.f584I);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c0$j */
    static final class j extends AbstractC3864v implements Ba.a<C4153F> {
        j() {
            super(0);
        }

        public final void a() {
            AbstractC0823c0 wrappedBy = AbstractC0823c0.this.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.C2();
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c0$k */
    static final class k extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i.c f587C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ f f588D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f589E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C0841u f590F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f591G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ boolean f592H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f593I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(i.c cVar, f fVar, long j10, C0841u c0841u, boolean z10, boolean z11, float f10) {
            super(0);
            this.f587C = cVar;
            this.f588D = fVar;
            this.f589E = j10;
            this.f590F = c0841u;
            this.f591G = z10;
            this.f592H = z11;
            this.f593I = f10;
        }

        public final void a() {
            AbstractC0823c0.this.a3(C0825d0.b(this.f587C, this.f588D.b(), e0.a(2)), this.f588D, this.f589E, this.f590F, this.f591G, this.f592H, this.f593I);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c0$l */
    static final class l extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<androidx.compose.ui.graphics.c, C4153F> f594B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar) {
            super(0);
            this.f594B = lVar;
        }

        public final void a() {
            this.f594B.invoke(AbstractC0823c0.f537p0);
            AbstractC0823c0.f537p0.U();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public AbstractC0823c0(G g10) {
        this.layoutNode = g10;
    }

    private final long F2(long pointerPosition) {
        float fM = C3476g.m(pointerPosition);
        float fMax = Math.max(0.0f, fM < 0.0f ? -fM : fM - y0());
        float fN = C3476g.n(pointerPosition);
        return C3477h.a(fMax, Math.max(0.0f, fN < 0.0f ? -fN : fN - v0()));
    }

    private final void O2(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock, C3870c explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                C5047a.a("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                g3(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                l0 l0VarS = K.b(getLayoutNode()).s(this.drawBlock, this.invalidateParentLayer, explicitLayer);
                l0VarS.h(getMeasuredSize());
                l0VarS.i(position);
                this.layer = l0VarS;
                getLayoutNode().B1(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                g3(this, null, false, 2, null);
            }
            g3(this, layerBlock, false, 2, null);
        }
        if (!U0.n.g(getPosition(), position)) {
            W2(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().G1();
            l0 l0Var = this.layer;
            if (l0Var != null) {
                l0Var.i(position);
            } else {
                AbstractC0823c0 abstractC0823c0 = this.wrappedBy;
                if (abstractC0823c0 != null) {
                    abstractC0823c0.C2();
                }
            }
            u1(this);
            m0 owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.c(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (getIsPlacingForAlignment()) {
            return;
        }
        Q0(Z0());
    }

    public static /* synthetic */ void R2(AbstractC0823c0 abstractC0823c0, MutableRect mutableRect, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        abstractC0823c0.Q2(mutableRect, z10, z11);
    }

    private final void W1(AbstractC0823c0 ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        AbstractC0823c0 abstractC0823c0 = this.wrappedBy;
        if (abstractC0823c0 != null) {
            abstractC0823c0.W1(ancestor, rect, clipBounds);
        }
        h2(rect, clipBounds);
    }

    private final long X1(AbstractC0823c0 ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        AbstractC0823c0 abstractC0823c0 = this.wrappedBy;
        return (abstractC0823c0 == null || C3862t.b(ancestor, abstractC0823c0)) ? f2(offset, includeMotionFrameOfReference) : f2(abstractC0823c0.X1(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a3(i.c cVar, f fVar, long j10, C0841u c0841u, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            B2(fVar, j10, c0841u, z10, z11);
        } else if (fVar.c(cVar)) {
            c0841u.K(cVar, f10, z11, new k(cVar, fVar, j10, c0841u, z10, z11, f10));
        } else {
            a3(C0825d0.b(cVar, fVar.b(), e0.a(2)), fVar, j10, c0841u, z10, z11, f10);
        }
    }

    private final AbstractC0823c0 b3(InterfaceC5116v interfaceC5116v) {
        AbstractC0823c0 abstractC0823c0B;
        C5095F c5095f = interfaceC5116v instanceof C5095F ? (C5095F) interfaceC5116v : null;
        if (c5095f != null && (abstractC0823c0B = c5095f.b()) != null) {
            return abstractC0823c0B;
        }
        C3862t.e(interfaceC5116v, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (AbstractC0823c0) interfaceC5116v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c2(InterfaceC3586l0 canvas, C3870c graphicsLayer) {
        i.c cVarW2 = w2(e0.a(4));
        if (cVarW2 == null) {
            N2(canvas, graphicsLayer);
        } else {
            getLayoutNode().c0().b(canvas, U0.s.d(a()), this, cVarW2, graphicsLayer);
        }
    }

    public static /* synthetic */ long d3(AbstractC0823c0 abstractC0823c0, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return abstractC0823c0.c3(j10, z10);
    }

    public static /* synthetic */ long g2(AbstractC0823c0 abstractC0823c0, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return abstractC0823c0.f2(j10, z10);
    }

    public static /* synthetic */ void g3(AbstractC0823c0 abstractC0823c0, Ba.l lVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        abstractC0823c0.f3(lVar, z10);
    }

    private final void h2(MutableRect bounds, boolean clipBounds) {
        float fH = U0.n.h(getPosition());
        bounds.i(bounds.getLeft() - fH);
        bounds.j(bounds.getRight() - fH);
        float fI = U0.n.i(getPosition());
        bounds.k(bounds.getTop() - fI);
        bounds.h(bounds.getBottom() - fI);
        l0 l0Var = this.layer;
        if (l0Var != null) {
            l0Var.b(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.e(0.0f, 0.0f, U0.r.g(a()), U0.r.f(a()));
                bounds.f();
            }
        }
    }

    private final void h3(boolean invokeOnLayoutChange) {
        m0 owner;
        if (this.explicitLayer != null) {
            return;
        }
        l0 l0Var = this.layer;
        if (l0Var == null) {
            if (this.layerBlock == null) {
                return;
            }
            C5047a.b("null layer with a non-null layerBlock");
            return;
        }
        Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar = this.layerBlock;
        if (lVar == null) {
            C5047a.c("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        androidx.compose.ui.graphics.d dVar = f537p0;
        dVar.Q();
        dVar.R(getLayoutNode().getDensity());
        dVar.S(getLayoutNode().getLayoutDirection());
        dVar.T(U0.s.d(a()));
        q2().i(this, f535n0, new l(lVar));
        C0846z c0846z = this.layerPositionalProperties;
        if (c0846z == null) {
            c0846z = new C0846z();
            this.layerPositionalProperties = c0846z;
        }
        c0846z.b(dVar);
        l0Var.f(dVar);
        this.isClipping = dVar.getClip();
        this.lastLayerAlpha = dVar.getAlpha();
        if (!invokeOnLayoutChange || (owner = getLayoutNode().getOwner()) == null) {
            return;
        }
        owner.c(getLayoutNode());
    }

    static /* synthetic */ void i3(AbstractC0823c0 abstractC0823c0, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        abstractC0823c0.h3(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 q2() {
        return K.b(getLayoutNode()).getSnapshotObserver();
    }

    private final boolean v2(int type) {
        i.c cVarX2 = x2(f0.i(type));
        return cVarX2 != null && C0832k.e(cVarX2, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.c x2(boolean includeTail) {
        i.c cVarR2;
        if (getLayoutNode().m0() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (includeTail) {
            AbstractC0823c0 abstractC0823c0 = this.wrappedBy;
            if (abstractC0823c0 != null && (cVarR2 = abstractC0823c0.r2()) != null) {
                return cVarR2.getChild();
            }
        } else {
            AbstractC0823c0 abstractC0823c02 = this.wrappedBy;
            if (abstractC0823c02 != null) {
                return abstractC0823c02.r2();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y2(i.c cVar, f fVar, long j10, C0841u c0841u, boolean z10, boolean z11) {
        if (cVar == null) {
            B2(fVar, j10, c0841u, z10, z11);
        } else {
            c0841u.E(cVar, z11, new h(cVar, fVar, j10, c0841u, z10, z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(i.c cVar, f fVar, long j10, C0841u c0841u, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            B2(fVar, j10, c0841u, z10, z11);
        } else {
            c0841u.F(cVar, f10, z11, new i(cVar, fVar, j10, c0841u, z10, z11, f10));
        }
    }

    public final void A2(f hitTestSource, long pointerPosition, C0841u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        i.c cVarW2 = w2(hitTestSource.b());
        if (!j3(pointerPosition)) {
            if (isTouchEvent) {
                float fZ1 = Z1(pointerPosition, o2());
                if (Float.isInfinite(fZ1) || Float.isNaN(fZ1) || !hitTestResult.H(fZ1, false)) {
                    return;
                }
                z2(cVarW2, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fZ1);
                return;
            }
            return;
        }
        if (cVarW2 == null) {
            B2(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (D2(pointerPosition)) {
            y2(cVarW2, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fZ12 = !isTouchEvent ? Float.POSITIVE_INFINITY : Z1(pointerPosition, o2());
        if (!Float.isInfinite(fZ12) && !Float.isNaN(fZ12)) {
            if (hitTestResult.H(fZ12, isInLayer)) {
                z2(cVarW2, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fZ12);
                return;
            }
        }
        a3(cVarW2, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fZ12);
    }

    public void B2(f hitTestSource, long pointerPosition, C0841u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        AbstractC0823c0 abstractC0823c0 = this.wrapped;
        if (abstractC0823c0 != null) {
            abstractC0823c0.A2(hitTestSource, g2(abstractC0823c0, pointerPosition, false, 2, null), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    @Override // y0.Z
    protected void C0(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock) {
        if (!this.forcePlaceWithLookaheadOffset) {
            O2(position, zIndex, layerBlock, null);
            return;
        }
        Q qN2 = getLookaheadDelegate();
        C3862t.d(qN2);
        O2(qN2.getPosition(), zIndex, layerBlock, null);
    }

    public void C2() {
        l0 l0Var = this.layer;
        if (l0Var != null) {
            l0Var.invalidate();
            return;
        }
        AbstractC0823c0 abstractC0823c0 = this.wrappedBy;
        if (abstractC0823c0 != null) {
            abstractC0823c0.C2();
        }
    }

    @Override // y0.Z
    protected void D0(long position, float zIndex, C3870c layer) {
        if (!this.forcePlaceWithLookaheadOffset) {
            O2(position, zIndex, null, layer);
            return;
        }
        Q qN2 = getLookaheadDelegate();
        C3862t.d(qN2);
        O2(qN2.getPosition(), zIndex, null, layer);
    }

    protected final boolean D2(long pointerPosition) {
        float fM = C3476g.m(pointerPosition);
        float fN = C3476g.n(pointerPosition);
        return fM >= 0.0f && fN >= 0.0f && fM < ((float) y0()) && fN < ((float) v0());
    }

    public final boolean E2() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        AbstractC0823c0 abstractC0823c0 = this.wrappedBy;
        if (abstractC0823c0 != null) {
            return abstractC0823c0.E2();
        }
        return false;
    }

    @Override // A0.P
    public void F1() {
        C3870c c3870c = this.explicitLayer;
        if (c3870c != null) {
            D0(getPosition(), this.zIndex, c3870c);
        } else {
            C0(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    public final void G2() {
        getLayoutNode().getLayoutDelegate().S();
    }

    public void H2() {
        l0 l0Var = this.layer;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public final void I2() {
        f3(this.layerBlock, true);
        l0 l0Var = this.layer;
        if (l0Var != null) {
            l0Var.invalidate();
        }
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
    protected void J2(int width, int height) {
        AbstractC0823c0 abstractC0823c0;
        l0 l0Var = this.layer;
        if (l0Var != null) {
            l0Var.h(U0.s.a(width, height));
        } else if (getLayoutNode().o() && (abstractC0823c0 = this.wrappedBy) != null) {
            abstractC0823c0.C2();
        }
        K0(U0.s.a(width, height));
        if (this.layerBlock != null) {
            h3(false);
        }
        int iA = e0.a(4);
        boolean zI = f0.i(iA);
        i.c cVarR2 = r2();
        if (zI || (cVarR2 = cVarR2.getParent()) != null) {
            for (i.c cVarX2 = x2(zI); cVarX2 != null && (cVarX2.getAggregateChildKindSet() & iA) != 0; cVarX2 = cVarX2.getChild()) {
                if ((cVarX2.getKindSet() & iA) != 0) {
                    AbstractC0834m abstractC0834mG = cVarX2;
                    Q.b bVar = null;
                    while (abstractC0834mG != 0) {
                        if (abstractC0834mG instanceof r) {
                            ((r) abstractC0834mG).A0();
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
                    break;
                }
            }
        }
        m0 owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.c(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r9v7, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    public final void K2() {
        i.c parent;
        if (v2(e0.a(128))) {
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Ba.l<Object, C4153F> lVarH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
            try {
                int iA = e0.a(128);
                boolean zI = f0.i(iA);
                if (!zI) {
                    parent = r2().getParent();
                    if (parent == null) {
                    }
                    C4153F c4153f = C4153F.f46609a;
                    companion.m(gVarD, gVarF, lVarH);
                }
                parent = r2();
                for (i.c cVarX2 = x2(zI); cVarX2 != null && (cVarX2.getAggregateChildKindSet() & iA) != 0; cVarX2 = cVarX2.getChild()) {
                    if ((cVarX2.getKindSet() & iA) != 0) {
                        Q.b bVar = null;
                        AbstractC0834m abstractC0834mG = cVarX2;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof A) {
                                ((A) abstractC0834mG).q(getMeasuredSize());
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
                    if (cVarX2 == parent) {
                        break;
                    }
                }
                C4153F c4153f2 = C4153F.f46609a;
                companion.m(gVarD, gVarF, lVarH);
            } catch (Throwable th) {
                companion.m(gVarD, gVarF, lVarH);
                throw th;
            }
        }
    }

    @Override // y0.InterfaceC5116v
    public boolean L() {
        return r2().getIsAttached();
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
    public final void L2() {
        int iA = e0.a(128);
        boolean zI = f0.i(iA);
        i.c cVarR2 = r2();
        if (!zI && (cVarR2 = cVarR2.getParent()) == null) {
            return;
        }
        for (i.c cVarX2 = x2(zI); cVarX2 != null && (cVarX2.getAggregateChildKindSet() & iA) != 0; cVarX2 = cVarX2.getChild()) {
            if ((cVarX2.getKindSet() & iA) != 0) {
                AbstractC0834m abstractC0834mG = cVarX2;
                Q.b bVar = null;
                while (abstractC0834mG != 0) {
                    if (abstractC0834mG instanceof A) {
                        ((A) abstractC0834mG).M(this);
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

    @Override // y0.InterfaceC5116v
    public C3478i M(InterfaceC5116v sourceCoordinates, boolean clipBounds) {
        if (!L()) {
            C5047a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.L()) {
            C5047a.b("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        AbstractC0823c0 abstractC0823c0B3 = b3(sourceCoordinates);
        abstractC0823c0B3.G2();
        AbstractC0823c0 abstractC0823c0E2 = e2(abstractC0823c0B3);
        MutableRect mutableRectP2 = p2();
        mutableRectP2.i(0.0f);
        mutableRectP2.k(0.0f);
        mutableRectP2.j(U0.r.g(sourceCoordinates.a()));
        mutableRectP2.h(U0.r.f(sourceCoordinates.a()));
        while (abstractC0823c0B3 != abstractC0823c0E2) {
            R2(abstractC0823c0B3, mutableRectP2, clipBounds, false, 4, null);
            if (mutableRectP2.f()) {
                return C3478i.INSTANCE.a();
            }
            abstractC0823c0B3 = abstractC0823c0B3.wrappedBy;
            C3862t.d(abstractC0823c0B3);
        }
        W1(abstractC0823c0E2, mutableRectP2, clipBounds);
        return C3475f.a(mutableRectP2);
    }

    public final void M2() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        S2();
    }

    public void N2(InterfaceC3586l0 canvas, C3870c graphicsLayer) {
        AbstractC0823c0 abstractC0823c0 = this.wrapped;
        if (abstractC0823c0 != null) {
            abstractC0823c0.a2(canvas, graphicsLayer);
        }
    }

    public final void P2(long position, float zIndex, Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock, C3870c layer) {
        O2(U0.n.l(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    public final void Q2(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        l0 l0Var = this.layer;
        if (l0Var != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jO2 = o2();
                    float fI = C3482m.i(jO2) / 2.0f;
                    float fG = C3482m.g(jO2) / 2.0f;
                    bounds.e(-fI, -fG, U0.r.g(a()) + fI, U0.r.f(a()) + fG);
                } else if (clipBounds) {
                    bounds.e(0.0f, 0.0f, U0.r.g(a()), U0.r.f(a()));
                }
                if (bounds.f()) {
                    return;
                }
            }
            l0Var.b(bounds, false);
        }
        float fH = U0.n.h(getPosition());
        bounds.i(bounds.getLeft() + fH);
        bounds.j(bounds.getRight() + fH);
        float fI2 = U0.n.i(getPosition());
        bounds.k(bounds.getTop() + fI2);
        bounds.h(bounds.getBottom() + fI2);
    }

    @Override // y0.InterfaceC5116v
    public long R(InterfaceC5116v sourceCoordinates, long relativeToSource) {
        return g0(sourceCoordinates, relativeToSource, true);
    }

    @Override // U0.l
    /* renamed from: R0 */
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public final void S2() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            g3(this, null, false, 2, null);
            G.u1(getLayoutNode(), false, 1, null);
        }
    }

    public final void T2(boolean z10) {
        this.forceMeasureWithLookaheadConstraints = z10;
    }

    @Override // y0.InterfaceC5116v
    public final InterfaceC5116v U() {
        if (!L()) {
            C5047a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        G2();
        return getLayoutNode().m0().wrappedBy;
    }

    public final void U2(boolean z10) {
        this.forcePlaceWithLookaheadOffset = z10;
    }

    @Override // A0.P
    public P V0() {
        return this.wrapped;
    }

    public void V2(y0.J j10) {
        y0.J j11 = this._measureResult;
        if (j10 != j11) {
            this._measureResult = j10;
            if (j11 == null || j10.getWidth() != j11.getWidth() || j10.getHeight() != j11.getHeight()) {
                J2(j10.getWidth(), j10.getHeight());
            }
            Map<AbstractC5096a, Integer> map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && j10.d().isEmpty()) || C3862t.b(j10.d(), this.oldAlignmentLines)) {
                return;
            }
            i2().getAlignmentLines().m();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(j10.d());
        }
    }

    protected void W2(long j10) {
        this.position = j10;
    }

    public final void X2(AbstractC0823c0 abstractC0823c0) {
        this.wrapped = abstractC0823c0;
    }

    @Override // A0.P
    public boolean Y0() {
        return this._measureResult != null;
    }

    protected final long Y1(long minimumTouchTargetSize) {
        return C3483n.a(Math.max(0.0f, (C3482m.i(minimumTouchTargetSize) - y0()) / 2.0f), Math.max(0.0f, (C3482m.g(minimumTouchTargetSize) - v0()) / 2.0f));
    }

    public final void Y2(AbstractC0823c0 abstractC0823c0) {
        this.wrappedBy = abstractC0823c0;
    }

    @Override // A0.P
    public y0.J Z0() {
        y0.J j10 = this._measureResult;
        if (j10 != null) {
            return j10;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    protected final float Z1(long pointerPosition, long minimumTouchTargetSize) {
        if (y0() >= C3482m.i(minimumTouchTargetSize) && v0() >= C3482m.g(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jY1 = Y1(minimumTouchTargetSize);
        float fI = C3482m.i(jY1);
        float fG = C3482m.g(jY1);
        long jF2 = F2(pointerPosition);
        if ((fI > 0.0f || fG > 0.0f) && C3476g.m(jF2) <= fI && C3476g.n(jF2) <= fG) {
            return C3476g.l(jF2);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final boolean Z2() {
        i.c cVarX2 = x2(f0.i(e0.a(16)));
        if (cVarX2 != null && cVarX2.getIsAttached()) {
            int iA = e0.a(16);
            if (!cVarX2.getNode().getIsAttached()) {
                C5047a.b("visitLocalDescendants called on an unattached node");
            }
            i.c node = cVarX2.getNode();
            if ((node.getAggregateChildKindSet() & iA) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = node;
                        Q.b bVar = null;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof s0) {
                                if (((s0) abstractC0834mG).q1()) {
                                    return true;
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
                    node = node.getChild();
                }
            }
        }
        return false;
    }

    @Override // y0.InterfaceC5116v
    public final long a() {
        return getMeasuredSize();
    }

    public final void a2(InterfaceC3586l0 canvas, C3870c graphicsLayer) {
        l0 l0Var = this.layer;
        if (l0Var != null) {
            l0Var.a(canvas, graphicsLayer);
            return;
        }
        float fH = U0.n.h(getPosition());
        float fI = U0.n.i(getPosition());
        canvas.b(fH, fI);
        c2(canvas, graphicsLayer);
        canvas.b(-fH, -fI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // y0.L, y0.InterfaceC5112q
    /* renamed from: b */
    public Object getParentData() {
        if (!getLayoutNode().getNodes().q(e0.a(64))) {
            return null;
        }
        r2();
        kotlin.jvm.internal.O o10 = new kotlin.jvm.internal.O();
        for (i.c tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((e0.a(64) & tail.getKindSet()) != 0) {
                int iA = e0.a(64);
                Q.b bVar = null;
                AbstractC0834m abstractC0834mG = tail;
                while (abstractC0834mG != 0) {
                    if (abstractC0834mG instanceof p0) {
                        o10.f43978B = ((p0) abstractC0834mG).r(getLayoutNode().getDensity(), o10.f43978B);
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
        return o10.f43978B;
    }

    @Override // A0.n0
    public boolean b0() {
        return (this.layer == null || this.released || !getLayoutNode().K0()) ? false : true;
    }

    protected final void b2(InterfaceC3586l0 canvas, P0 paint) {
        canvas.l(new C3478i(0.5f, 0.5f, U0.r.g(getMeasuredSize()) - 0.5f, U0.r.f(getMeasuredSize()) - 0.5f), paint);
    }

    @Override // y0.InterfaceC5116v
    public long c0(long relativeToLocal) {
        if (!L()) {
            C5047a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        G2();
        long jD3 = relativeToLocal;
        for (AbstractC0823c0 abstractC0823c0 = this; abstractC0823c0 != null; abstractC0823c0 = abstractC0823c0.wrappedBy) {
            jD3 = d3(abstractC0823c0, jD3, false, 2, null);
        }
        return jD3;
    }

    @Override // A0.P
    public P c1() {
        return this.wrappedBy;
    }

    public long c3(long position, boolean includeMotionFrameOfReference) {
        l0 l0Var = this.layer;
        if (l0Var != null) {
            position = l0Var.g(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? U0.o.c(position, getPosition()) : position;
    }

    public abstract void d2();

    public final AbstractC0823c0 e2(AbstractC0823c0 other) {
        G layoutNode = other.getLayoutNode();
        G layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            i.c cVarR2 = other.r2();
            i.c cVarR22 = r2();
            int iA = e0.a(2);
            if (!cVarR22.getNode().getIsAttached()) {
                C5047a.b("visitLocalAncestors called on an unattached node");
            }
            for (i.c parent = cVarR22.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iA) != 0 && parent == cVarR2) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.o0();
            C3862t.d(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.o0();
            C3862t.d(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.o0();
            layoutNode2 = layoutNode2.o0();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == other.getLayoutNode() ? other : layoutNode.P();
    }

    public final C3478i e3() {
        if (!L()) {
            return C3478i.INSTANCE.a();
        }
        InterfaceC5116v interfaceC5116vD = C5117w.d(this);
        MutableRect mutableRectP2 = p2();
        long jY1 = Y1(o2());
        mutableRectP2.i(-C3482m.i(jY1));
        mutableRectP2.k(-C3482m.g(jY1));
        mutableRectP2.j(y0() + C3482m.i(jY1));
        mutableRectP2.h(v0() + C3482m.g(jY1));
        AbstractC0823c0 abstractC0823c0 = this;
        while (abstractC0823c0 != interfaceC5116vD) {
            abstractC0823c0.Q2(mutableRectP2, false, true);
            if (mutableRectP2.f()) {
                return C3478i.INSTANCE.a();
            }
            abstractC0823c0 = abstractC0823c0.wrappedBy;
            C3862t.d(abstractC0823c0);
        }
        return C3475f.a(mutableRectP2);
    }

    public long f2(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = U0.o.b(position, getPosition());
        }
        l0 l0Var = this.layer;
        return l0Var != null ? l0Var.g(position, true) : position;
    }

    public final void f3(Ba.l<? super androidx.compose.ui.graphics.c, C4153F> layerBlock, boolean forceUpdateLayerParameters) {
        m0 owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            C5047a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        G layoutNode = getLayoutNode();
        boolean z10 = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && C3862t.b(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.K0() || layerBlock == null) {
            this.layerBlock = null;
            l0 l0Var = this.layer;
            if (l0Var != null) {
                l0Var.d();
                layoutNode.B1(true);
                this.invalidateParentLayer.invoke();
                if (L() && (owner = layoutNode.getOwner()) != null) {
                    owner.c(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.layerBlock = layerBlock;
        if (this.layer != null) {
            if (z10) {
                i3(this, false, 1, null);
                return;
            }
            return;
        }
        l0 l0VarO = m0.o(K.b(layoutNode), this.drawBlock, this.invalidateParentLayer, null, 4, null);
        l0VarO.h(getMeasuredSize());
        l0VarO.i(getPosition());
        this.layer = l0VarO;
        i3(this, false, 1, null);
        layoutNode.B1(true);
        this.invalidateParentLayer.invoke();
    }

    @Override // y0.InterfaceC5116v
    public long g0(InterfaceC5116v sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof C5095F) {
            ((C5095F) sourceCoordinates).b().G2();
            return C3476g.u(sourceCoordinates.g0(this, C3476g.u(relativeToSource), includeMotionFrameOfReference));
        }
        AbstractC0823c0 abstractC0823c0B3 = b3(sourceCoordinates);
        abstractC0823c0B3.G2();
        AbstractC0823c0 abstractC0823c0E2 = e2(abstractC0823c0B3);
        while (abstractC0823c0B3 != abstractC0823c0E2) {
            relativeToSource = abstractC0823c0B3.c3(relativeToSource, includeMotionFrameOfReference);
            abstractC0823c0B3 = abstractC0823c0B3.wrappedBy;
            C3862t.d(abstractC0823c0B3);
        }
        return X1(abstractC0823c0E2, relativeToSource, includeMotionFrameOfReference);
    }

    @Override // U0.d
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // y0.r
    public U0.t getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    public InterfaceC0820b i2() {
        return getLayoutNode().getLayoutDelegate().r();
    }

    /* renamed from: j2, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    protected final boolean j3(long pointerPosition) {
        if (!C3477h.b(pointerPosition)) {
            return false;
        }
        l0 l0Var = this.layer;
        return l0Var == null || !this.isClipping || l0Var.e(pointerPosition);
    }

    /* renamed from: k2, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final long l2() {
        return getMeasurementConstraints();
    }

    @Override // A0.P
    /* renamed from: m1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    /* renamed from: m2, reason: from getter */
    public final l0 getLayer() {
        return this.layer;
    }

    /* renamed from: n2 */
    public abstract Q getLookaheadDelegate();

    public final long o2() {
        return this.layerDensity.t1(getLayoutNode().getViewConfiguration().d());
    }

    protected final MutableRect p2() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    public abstract i.c r2();

    @Override // A0.P, A0.T
    /* renamed from: s1, reason: from getter */
    public G getLayoutNode() {
        return this.layoutNode;
    }

    /* renamed from: s2, reason: from getter */
    public final AbstractC0823c0 getWrapped() {
        return this.wrapped;
    }

    /* renamed from: t2, reason: from getter */
    public final AbstractC0823c0 getWrappedBy() {
        return this.wrappedBy;
    }

    @Override // y0.InterfaceC5116v
    public long u(long relativeToLocal) {
        return K.b(getLayoutNode()).h(c0(relativeToLocal));
    }

    /* renamed from: u2, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final i.c w2(int type) {
        boolean zI = f0.i(type);
        i.c cVarR2 = r2();
        if (!zI && (cVarR2 = cVarR2.getParent()) == null) {
            return null;
        }
        for (i.c cVarX2 = x2(zI); cVarX2 != null && (cVarX2.getAggregateChildKindSet() & type) != 0; cVarX2 = cVarX2.getChild()) {
            if ((cVarX2.getKindSet() & type) != 0) {
                return cVarX2;
            }
            if (cVarX2 == cVarR2) {
                return null;
            }
        }
        return null;
    }

    @Override // A0.P
    public InterfaceC5116v W0() {
        return this;
    }
}
