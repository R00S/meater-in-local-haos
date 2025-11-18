package A5;

import A5.m;
import I4.DeviceInfo;
import P5.EnumC1600h;
import Xb.A0;
import Xb.C1837g;
import Xb.C1841i;
import Xb.F;
import Xb.G0;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.T;
import Xb.Z;
import ac.C1972g;
import ac.H;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import ac.J;
import ac.t;
import android.net.Uri;
import android.view.B;
import android.view.D;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.media3.datasource.cache.a;
import b2.d;
import c5.C2316d;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.DateExtensionKt;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.meatCutStructure.MeatCookingTemperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.PendingRequest;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import l4.AbstractC3900b;
import o4.Alert;
import o4.EnumC4125A;
import o4.OnCompleteAction;
import o4.RecipeAnalyticsRequestInput;
import o4.Setup;
import o4.Step;
import o4.StepContent;
import o4.StepContentMeta;
import o4.p;
import o4.r;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import p4.SaveWatchedVideoRequestInput;
import p4.WatchedVideos;
import t4.InterfaceC4557g;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;
import x5.C5060e;
import x5.EnumC5057b;
import y5.AbstractC5128a;

/* compiled from: RecipeStepsViewModel.kt */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010\u001fJ\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010\u001fJ\u001b\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u00020%2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020%2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020%2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\u00112\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908H\u0002¢\u0006\u0004\b;\u0010<J'\u0010@\u001a\u00020\u00112\u0016\u0010?\u001a\u0012\u0012\u0004\u0012\u00020%0=j\b\u0012\u0004\u0012\u00020%`>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00112\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ;\u0010L\u001a\u00020B2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020G2\b\b\u0002\u0010I\u001a\u00020G2\b\b\u0002\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020GH\u0002¢\u0006\u0004\bL\u0010MJ/\u0010Q\u001a\u00020\u00112\u0016\u0010N\u001a\u0012\u0012\u0004\u0012\u00020%0=j\b\u0012\u0004\u0012\u00020%`>2\u0006\u0010P\u001a\u00020OH\u0003¢\u0006\u0004\bQ\u0010RJ'\u0010W\u001a\u00020\u00112\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020U2\u0006\u0010P\u001a\u00020OH\u0003¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0011H\u0002¢\u0006\u0004\bY\u0010\u0015J\u001f\u0010[\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020%H\u0002¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020%H\u0002¢\u0006\u0004\b]\u0010\\J\u0015\u0010_\u001a\u00020\u00112\u0006\u0010^\u001a\u00020\u001a¢\u0006\u0004\b_\u0010`J\u001d\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u0011¢\u0006\u0004\bd\u0010\u0015J\u001d\u0010f\u001a\n\u0012\u0004\u0012\u00020e\u0018\u00010a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bf\u0010cJ\u0015\u0010g\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\u00020i2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bl\u0010mJ\u0015\u0010o\u001a\u00020\u00112\u0006\u0010n\u001a\u00020\u001a¢\u0006\u0004\bo\u0010`J\u000f\u0010p\u001a\u00020\u0006H\u0016¢\u0006\u0004\bp\u0010qJ\u001d\u0010r\u001a\u0012\u0012\u0004\u0012\u00020%0=j\b\u0012\u0004\u0012\u00020%`>¢\u0006\u0004\br\u0010sJ'\u0010t\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u00112\b\b\u0002\u0010v\u001a\u00020\u000e¢\u0006\u0004\bw\u0010xJ\u0015\u0010{\u001a\u00020\u00112\u0006\u0010z\u001a\u00020y¢\u0006\u0004\b{\u0010|J\u0016\u0010\u007f\u001a\u00020\u00112\u0006\u0010~\u001a\u00020}¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0018\u0010\u0082\u0001\u001a\u00020\u00112\u0007\u0010\u0081\u0001\u001a\u00020\u001a¢\u0006\u0005\b\u0082\u0001\u0010`J)\u0010\u0086\u0001\u001a\u00020\u00112\u0007\u0010\u0083\u0001\u001a\u00020y2\u000e\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010a¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J \u0010\u0088\u0001\u001a\u00020\u00112\u000e\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010a¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J!\u0010\u008b\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u008a\u0001\u001a\u00020\u001a¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J!\u0010\u008e\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u008d\u0001\u001a\u00020\u001a¢\u0006\u0006\b\u008e\u0001\u0010\u008c\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u0011H\u0014¢\u0006\u0005\b\u008f\u0001\u0010\u0015J)\u0010\u0091\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001a0=j\b\u0012\u0004\u0012\u00020\u001a`>2\u0007\u0010\u0090\u0001\u001a\u00020\u001a¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0010\u0010\u0093\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0005\b\u0095\u0001\u0010\u0015J\u0012\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u000f\u0010\u0098\u0001\u001a\u00020\u0011¢\u0006\u0005\b\u0098\u0001\u0010\u0015J\u0018\u0010\u0099\u0001\u001a\u00020\u000e2\u0006\u00101\u001a\u000200¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u000f\u0010\u009b\u0001\u001a\u00020\u0011¢\u0006\u0005\b\u009b\u0001\u0010\u0015J'\u0010\u009d\u0001\u001a\u00020\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\t\b\u0002\u0010\u009c\u0001\u001a\u00020\u000e¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010¡\u0001\u001a\u00020\u00112\b\u0010 \u0001\u001a\u00030\u009f\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0019\u0010¤\u0001\u001a\u00020\u00112\u0007\u0010£\u0001\u001a\u00020%¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001f\u0010¦\u0001\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020%¢\u0006\u0005\b¦\u0001\u0010\\J\u000f\u0010§\u0001\u001a\u00020\u0011¢\u0006\u0005\b§\u0001\u0010\u0015J\u000f\u0010¨\u0001\u001a\u00020\u0011¢\u0006\u0005\b¨\u0001\u0010\u0015J\u001a\u0010«\u0001\u001a\u00020\u00112\b\u0010ª\u0001\u001a\u00030©\u0001¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u000f\u0010\u00ad\u0001\u001a\u00020\u0011¢\u0006\u0005\b\u00ad\u0001\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001c\u0010»\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001c\u0010½\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010º\u0001R\u001c\u0010¿\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010º\u0001R\u001c\u0010Á\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010º\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010º\u0001R\u0019\u0010Æ\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010È\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010Å\u0001R7\u0010Í\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001a0=j\b\u0012\u0004\u0012\u00020\u001a`>8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0005\bË\u0001\u0010s\"\u0005\bÌ\u0001\u0010AR\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R#\u0010×\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Ò\u00018\u0006¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001e\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ð\u0001R#\u0010Ü\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Ò\u00018\u0006¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Ô\u0001\u001a\u0006\bÛ\u0001\u0010Ö\u0001R\u001e\u0010Þ\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Ð\u0001R#\u0010á\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Ò\u00018\u0006¢\u0006\u0010\n\u0006\bß\u0001\u0010Ô\u0001\u001a\u0006\bà\u0001\u0010Ö\u0001R\u001e\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010Ð\u0001R#\u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Ò\u00018\u0006¢\u0006\u0010\n\u0006\bä\u0001\u0010Ô\u0001\u001a\u0006\bå\u0001\u0010Ö\u0001R\u001e\u0010è\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010Ð\u0001R#\u0010ë\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0Ò\u00018\u0006¢\u0006\u0010\n\u0006\bé\u0001\u0010Ô\u0001\u001a\u0006\bê\u0001\u0010Ö\u0001R\u001c\u0010í\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010º\u0001R\u0019\u0010ï\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010Å\u0001R\u001c\u0010ñ\u0001\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010º\u0001R,\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010¢\u0001R,\u0010þ\u0001\u001a\u0005\u0018\u00010÷\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bø\u0001\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R+\u0010£\u0001\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÿ\u0001\u0010\u0080\u0002\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002\"\u0006\b\u0083\u0002\u0010¥\u0001R\u0019\u0010\u0085\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010Ú\u0001R\u0019\u0010\u0087\u0002\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010Ú\u0001R&\u0010\u008d\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008a\u00020\u0089\u00020\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R%\u0010\u0090\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u00020a0\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u008c\u0002R*\u0010\u0095\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u00020a0\u0091\u00028\u0006¢\u0006\u0010\n\u0006\bÅ\u0001\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002R\u001e\u0010\u0097\u0002\u001a\t\u0012\u0004\u0012\u00020\u000e0Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0002\u0010Ð\u0001R#\u0010\u009a\u0002\u001a\t\u0012\u0004\u0012\u00020\u000e0Ò\u00018\u0006¢\u0006\u0010\n\u0006\b\u0098\u0002\u0010Ô\u0001\u001a\u0006\b\u0099\u0002\u0010Ö\u0001R\u001c\u0010\u009c\u0002\u001a\u0005\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010º\u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0018\u0010¢\u0002\u001a\u00030\u009f\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0002\u0010¡\u0002¨\u0006£\u0002"}, d2 = {"LA5/m;", "Ly5/a;", "Lt4/g;", "saveWatchedVideosUseCase", "LG5/a;", "preferences", "LI5/a;", "cacheManager", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "networkConstant", "<init>", "(Lt4/g;LG5/a;LI5/a;Lcom/apptionlabs/meater_app/data/NetworkConstant;)V", "LK4/b;", "onGoingRecipeInfo", "", "shouldPopulateValue", "shouldIgnoreStepBlockFlag", "Loa/F;", "z0", "(LK4/b;ZZ)V", "A1", "()V", "Lo4/y;", "content", "G0", "(Lo4/y;)V", "", "stepNumber", "k1", "(IZ)I", "l1", "()I", "g1", "m1", "e1", "h1", "j1", "", "state", "f1", "(Ljava/lang/String;)I", "i1", "Ljava/util/HashMap;", "Lo4/z;", "H0", "()Ljava/util/HashMap;", "Lo4/r;", "appliance", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "P0", "(Lo4/r;Lcom/apptionlabs/meater_app/model/MEATERDevice;)Ljava/lang/String;", "p1", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)Ljava/lang/String;", "o1", "(Lo4/r;)Ljava/lang/String;", "Ll4/b;", "Lp4/n;", "it", "F0", "(Ll4/b;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "videoTutorialIds", "C1", "(Ljava/util/ArrayList;)V", "Lo4/q;", "recipeAnalyticsRequestInput", "O1", "(Lo4/q;)V", "stepIndex", "", "startedAt", "finishedAt", "cancelledAt", "onGoingRecipeId", "J0", "(IJJJJ)Lo4/q;", "videosList", "Landroidx/media3/datasource/cache/a$c;", "cacheDataSource", "y1", "(Ljava/util/ArrayList;Landroidx/media3/datasource/cache/a$c;)V", "La2/g;", "dataSpec", "Lb2/d$a;", "progressListener", "y0", "(La2/g;Lb2/d$a;Landroidx/media3/datasource/cache/a$c;)V", "K1", "stepTitle", "M1", "(ILjava/lang/String;)V", "T1", "recipeId", "r1", "(I)V", "", "c1", "(I)Ljava/util/List;", "G1", "Lo4/h;", "b1", "U0", "(I)I", "Lx5/b;", "O0", "(I)Lx5/b;", "s1", "(I)Z", "numberOfStepsToSkip", "w1", "M0", "()LI5/a;", "L0", "()Ljava/util/ArrayList;", "B0", "(IZZ)I", "withDelay", "t1", "(Z)V", "Lcom/apptionlabs/meater_app/model/Probe;", "relatedProbe", "S1", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "cookState", "P1", "(Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;)V", "currentPosition", "x1", "probe", "Lo4/a;", "alerts", "E1", "(Lcom/apptionlabs/meater_app/model/Probe;Ljava/util/List;)V", "F1", "(Ljava/util/List;)V", "timeToWatch", "w0", "(II)V", "temperatureToWatch", "x0", "g", "listLimit", "Y0", "(I)Ljava/util/ArrayList;", "v1", "()Z", "k", "N0", "()Lo4/y;", "I0", "E0", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)Z", "D1", "isRecipeCancelled", "D0", "(Ljava/lang/Integer;Z)V", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;", "meatCut", "Q1", "(Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;)V", "recommendedTemperature", "R1", "(Ljava/lang/String;)V", "N1", "J1", "L1", "LP5/h;", "contentType", "H1", "(LP5/h;)V", "B1", "t", "Lt4/g;", "u", "LG5/a;", "W0", "()LG5/a;", "v", "LI5/a;", "w", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "LXb/v0;", "x", "LXb/v0;", "lastStepJob", "y", "cookElapsedTimeJob", "z", "cookInternalTempJob", "A", "saveWatchedVideosJob", "B", "analyticsJob", "C", "Z", "shouldElapsedTimeJobRunning", "D", "shouldCookInternalTempJobRunning", "E", "Ljava/util/ArrayList;", "n1", "setStepProgressData", "stepProgressData", "Landroidx/lifecycle/D;", "F", "Landroidx/lifecycle/D;", "_nextStepClick", "Landroidx/lifecycle/B;", "G", "Landroidx/lifecycle/B;", "V0", "()Landroidx/lifecycle/B;", "nextStepClick", "H", "_stepListSize", "I", "d1", "stepListSize", "J", "_lastStepToJump", "K", "S0", "lastStepToJump", "L", "_watchedVideosResponse", "M", "q1", "watchedVideosResponse", "N", "_finishRecipe", "O", "R0", "finishRecipe", "P", "cachingJob", "Q", "shouldCacheRunning", "R", "storeJob", "S", "Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;", "T0", "()Lcom/apptionlabs/meater_app/meatCutStructure/MeatCut;", "setMeatCut", "Lo4/w;", "T", "Lo4/w;", "X0", "()Lo4/w;", "setRecipeSetup", "(Lo4/w;)V", "recipeSetup", "U", "Ljava/lang/String;", "Z0", "()Ljava/lang/String;", "I1", "V", "lastAdapterPosition", "W", "lastMLStepNumber", "Lac/t;", "Landroidx/compose/runtime/snapshots/k;", "LI4/a;", "X", "Lac/t;", "_sortedItems", "", "Y", "_deviceList", "Lac/H;", "Lac/H;", "Q0", "()Lac/H;", "deviceList", "a0", "_showEmptyView", "b0", "a1", "showEmptyView", "c0", "deviceListUpdateJob", "d0", "LP5/h;", "LXb/F;", "e0", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m extends AbstractC5128a {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 saveWatchedVideosJob;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 analyticsJob;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean shouldElapsedTimeJobRunning;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCookInternalTempJobRunning;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Integer> stepProgressData;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final D<Integer> _nextStepClick;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final B<Integer> nextStepClick;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final D<Integer> _stepListSize;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final B<Integer> stepListSize;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final D<Integer> _lastStepToJump;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final B<Integer> lastStepToJump;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final D<Integer> _watchedVideosResponse;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final B<Integer> watchedVideosResponse;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final D<Integer> _finishRecipe;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final B<Integer> finishRecipe;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 cachingJob;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCacheRunning;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 storeJob;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private MeatCut meatCut;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private Setup recipeSetup;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private String recommendedTemperature;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private int lastAdapterPosition;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private int lastMLStepNumber;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final t<SnapshotStateList<DeviceInfo>> _sortedItems;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final t<List<Object>> _deviceList;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final H<List<Object>> deviceList;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final D<Boolean> _showEmptyView;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final B<Boolean> showEmptyView;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 deviceListUpdateJob;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private EnumC1600h contentType;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4557g saveWatchedVideosUseCase;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final G5.a preferences;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final I5.a cacheManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final NetworkConstant networkConstant;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 lastStepJob;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 cookElapsedTimeJob;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 cookInternalTempJob;

    /* compiled from: RecipeStepsViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f844a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f845b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f846c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f847d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f848e;

        static {
            int[] iArr = new int[EnumC5057b.values().length];
            try {
                iArr[EnumC5057b.f52809D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5057b.f52810E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5057b.f52811F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5057b.f52812G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5057b.f52813H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC5057b.f52814I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC5057b.f52815J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f844a = iArr;
            int[] iArr2 = new int[DeviceCookState.values().length];
            try {
                iArr2[DeviceCookState.COOK_STATE_NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DeviceCookState.COOK_STATE_COOK_CONFIGURED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DeviceCookState.COOK_STATE_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DeviceCookState.COOK_STATE_READY_FOR_RESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DeviceCookState.COOK_STATE_RESTING.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DeviceCookState.COOK_STATE_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            f845b = iArr2;
            int[] iArr3 = new int[p.values().length];
            try {
                iArr3[p.f46487D.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[p.f46488E.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[p.f46489F.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[p.f46490G.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            f846c = iArr3;
            int[] iArr4 = new int[MEATERDeviceType.values().length];
            try {
                iArr4[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[MEATERDeviceType.PLUS_SE.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            f847d = iArr4;
            int[] iArr5 = new int[r.values().length];
            try {
                iArr5[r.f46513D.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[r.f46514E.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[r.f46520K.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[r.f46515F.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[r.f46516G.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[r.f46517H.ordinal()] = 6;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[r.f46518I.ordinal()] = 7;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[r.f46519J.ordinal()] = 8;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[r.f46521L.ordinal()] = 9;
            } catch (NoSuchFieldError unused31) {
            }
            f848e = iArr5;
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$addJobToWatchElapsedTime$2", f = "RecipeStepsViewModel.kt", l = {871, 875}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f849B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f850C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ m f851D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f852E;

        /* compiled from: RecipeStepsViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$addJobToWatchElapsedTime$2$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f853B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f854C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ m f855D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f856E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10, m mVar, int i11, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f854C = i10;
                this.f855D = mVar;
                this.f856E = i11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f854C, this.f855D, this.f856E, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f853B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                U4.b.t("(RecipeStepsViewModel) Job to Watch Elapsed time " + this.f854C + " (Finished)", new Object[0]);
                this.f855D.shouldElapsedTimeJobRunning = false;
                InterfaceC1867v0 interfaceC1867v0 = this.f855D.cookElapsedTimeJob;
                if (interfaceC1867v0 != null) {
                    InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
                }
                this.f855D.N(-1);
                K4.a.l(K4.a.f8678a, 0, 0, 0L, this.f855D.getOnGoingRecipeId(), 0L, 0, 0, null, kotlin.coroutines.jvm.internal.b.a(true), null, null, null, 0L, 7927, null);
                U4.b.t("(RecipeStepsViewModel) #6.0 calculateAndPopulateStepListSize Executed", new Object[0]);
                this.f855D.B0(this.f856E, true, true);
                this.f855D.w1(0);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, m mVar, int i11, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f850C = i10;
            this.f851D = mVar;
            this.f852E = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f850C, this.f851D, this.f852E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:11:0x003f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:11:0x003f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0091 -> B:11:0x003f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r8.f849B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oa.C4173r.b(r9)
                goto L3f
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                oa.C4173r.b(r9)
                goto L52
            L1e:
                oa.C4173r.b(r9)
                int r9 = r8.f850C
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "(RecipeStepsViewModel) Job added to Watch Elapsed time "
                r1.append(r4)
                r1.append(r9)
                java.lang.String r9 = " (Started)"
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                U4.b.t(r9, r1)
            L3f:
                A5.m r9 = r8.f851D
                boolean r9 = A5.m.j0(r9)
                if (r9 == 0) goto L94
                r8.f849B = r3
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r9 = Xb.T.a(r4, r8)
                if (r9 != r0) goto L52
                return r0
            L52:
                M4.h r9 = M4.h.f11978a
                A5.m r1 = r8.f851D
                long r4 = r1.getProbeID()
                com.apptionlabs.meater_app.model.MEATERDevice r1 = r9.o(r4)
                boolean r1 = r1 instanceof com.apptionlabs.meater_app.model.Probe
                if (r1 == 0) goto L3f
                A5.m r1 = r8.f851D
                long r4 = r1.getProbeID()
                com.apptionlabs.meater_app.model.MEATERDevice r9 = r9.o(r4)
                com.apptionlabs.meater_app.model.Probe r9 = (com.apptionlabs.meater_app.model.Probe) r9
                if (r9 != 0) goto L73
                oa.F r9 = oa.C4153F.f46609a
                return r9
            L73:
                int r1 = r8.f850C
                int r9 = r9.cookTimeElapsed()
                if (r1 > r9) goto L3f
                Xb.G0 r9 = Xb.Z.c()
                A5.m$b$a r1 = new A5.m$b$a
                int r4 = r8.f850C
                A5.m r5 = r8.f851D
                int r6 = r8.f852E
                r7 = 0
                r1.<init>(r4, r5, r6, r7)
                r8.f849B = r2
                java.lang.Object r9 = Xb.C1837g.g(r9, r1, r8)
                if (r9 != r0) goto L3f
                return r0
            L94:
                oa.F r9 = oa.C4153F.f46609a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: A5.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$addJobToWatchInternalTemperature$2", f = "RecipeStepsViewModel.kt", l = {912, 917}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f857B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f858C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ m f859D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f860E;

        /* compiled from: RecipeStepsViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$addJobToWatchInternalTemperature$2$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f861B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ m f862C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f863D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, int i10, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f862C = mVar;
                this.f863D = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f862C, this.f863D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f861B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f862C.shouldCookInternalTempJobRunning = false;
                InterfaceC1867v0 interfaceC1867v0 = this.f862C.cookInternalTempJob;
                if (interfaceC1867v0 != null) {
                    InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
                }
                this.f862C.P(-1);
                K4.a.l(K4.a.f8678a, 0, 0, 0L, this.f862C.getOnGoingRecipeId(), 0L, 0, 0, null, null, kotlin.coroutines.jvm.internal.b.a(true), null, null, 0L, 7671, null);
                U4.b.t("(RecipeStepsViewModel) #7.0 calculateAndPopulateStepListSize Executed", new Object[0]);
                m.C0(this.f862C, this.f863D, true, false, 4, null);
                this.f862C.w1(0);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, m mVar, int i11, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f858C = i10;
            this.f859D = mVar;
            this.f860E = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new c(this.f858C, this.f859D, this.f860E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:11:0x003f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0079 -> B:11:0x003f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00aa -> B:11:0x003f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r9.f857B
                r2 = 0
                java.lang.String r3 = "(RecipeStepsViewModel) Job to Watch Internal Temperature "
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L21
                if (r1 == r5) goto L1d
                if (r1 != r4) goto L15
                oa.C4173r.b(r10)
                goto L3f
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                oa.C4173r.b(r10)
                goto L52
            L21:
                oa.C4173r.b(r10)
                int r10 = r9.f858C
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r10)
                java.lang.String r10 = " (Started)"
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                java.lang.Object[] r1 = new java.lang.Object[r2]
                U4.b.t(r10, r1)
            L3f:
                A5.m r10 = r9.f859D
                boolean r10 = A5.m.i0(r10)
                if (r10 == 0) goto Lad
                r9.f857B = r5
                r6 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r10 = Xb.T.a(r6, r9)
                if (r10 != r0) goto L52
                return r0
            L52:
                M4.h r10 = M4.h.f11978a
                A5.m r1 = r9.f859D
                long r6 = r1.getProbeID()
                com.apptionlabs.meater_app.model.MEATERDevice r1 = r10.o(r6)
                boolean r1 = r1 instanceof com.apptionlabs.meater_app.model.Probe
                if (r1 == 0) goto L3f
                A5.m r1 = r9.f859D
                long r6 = r1.getProbeID()
                com.apptionlabs.meater_app.model.MEATERDevice r10 = r10.o(r6)
                com.apptionlabs.meater_app.model.Probe r10 = (com.apptionlabs.meater_app.model.Probe) r10
                if (r10 != 0) goto L73
                oa.F r10 = oa.C4153F.f46609a
                return r10
            L73:
                int r1 = r9.f858C
                int r10 = r10.getInternalTemperature()
                if (r1 > r10) goto L3f
                int r10 = r9.f858C
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r1.append(r10)
                java.lang.String r10 = " (Finished)"
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                java.lang.Object[] r1 = new java.lang.Object[r2]
                U4.b.t(r10, r1)
                Xb.G0 r10 = Xb.Z.c()
                A5.m$c$a r1 = new A5.m$c$a
                A5.m r6 = r9.f859D
                int r7 = r9.f860E
                r8 = 0
                r1.<init>(r6, r7, r8)
                r9.f857B = r4
                java.lang.Object r10 = Xb.C1837g.g(r10, r1, r9)
                if (r10 != r0) goto L3f
                return r0
            Lad:
                oa.F r10 = oa.C4153F.f46609a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: A5.m.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$calculateAndPopulateStepListSize$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class d extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f864B;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new d(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f864B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            K4.a.l(K4.a.f8678a, 0, 0, 0L, m.this.getOnGoingRecipeId(), 0L, 0, 0, null, null, null, null, kotlin.coroutines.jvm.internal.b.a(true), 0L, 6135, null);
            return C4153F.f46609a;
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$callAnalytics$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class e extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f866B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Integer f868D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f869E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Integer num, boolean z10, InterfaceC4588d<? super e> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f868D = num;
            this.f869E = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new e(this.f868D, this.f869E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((e) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            RecipeAnalyticsRequestInput recipeAnalyticsRequestInputK0;
            m mVar;
            C4696b.e();
            if (this.f866B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            K4.a aVar = K4.a.f8678a;
            K4.b bVarE = aVar.e(m.this.getOnGoingRecipeId());
            C3862t.d(bVarE);
            long lastStepTimeStamp = bVarE.getLastStepTimeStamp();
            Integer num = this.f868D;
            if (num != null) {
                m mVar2 = m.this;
                boolean z10 = this.f869E;
                int iIntValue = num.intValue();
                if (lastStepTimeStamp == -1) {
                    U4.b.t("(RecipeStepsViewModel) Call Analytics = Step Number : " + iIntValue + " --- " + Calendar.getInstance().getTimeInMillis(), new Object[0]);
                    bVarE.w(Calendar.getInstance().getTimeInMillis());
                    recipeAnalyticsRequestInputK0 = m.K0(mVar2, iIntValue, bVarE.getLastStepTimeStamp(), 0L, 0L, bVarE.getOngoingRecipeId(), 12, null);
                    mVar = mVar2;
                } else {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    U4.b.t("(RecipeStepsViewModel) Call Analytics = Step Number : " + iIntValue + " --- Start " + lastStepTimeStamp + " End " + timeInMillis, new Object[0]);
                    K4.a.l(aVar, 0, 0, 0L, mVar2.getOnGoingRecipeId(), 0L, 0, 0, null, null, null, null, null, timeInMillis, 4087, null);
                    recipeAnalyticsRequestInputK0 = z10 ? m.K0(mVar2, iIntValue, lastStepTimeStamp, 0L, timeInMillis, bVarE.getOngoingRecipeId(), 4, null) : m.K0(mVar2, iIntValue, lastStepTimeStamp, timeInMillis, 0L, bVarE.getOngoingRecipeId(), 8, null);
                    mVar = mVar2;
                }
                mVar.O1(recipeAnalyticsRequestInputK0);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$initializeRecipe$4", f = "RecipeStepsViewModel.kt", l = {208}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class f extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f870B;

        /* compiled from: RecipeStepsViewModel.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ m f872B;

            a(m mVar) {
                this.f872B = mVar;
            }

            @Override // ac.InterfaceC1971f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(K4.b bVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                try {
                    if (this.f872B.lastMLStepNumber != bVar.getStepNumber()) {
                        if (this.f872B.getProbeID() == -1) {
                            return C4153F.f46609a;
                        }
                        U4.b.t("CHINTAN ***** StepNumber Change to : " + bVar.getStepNumber(), new Object[0]);
                        if (this.f872B.getCurrentStepNumber() != bVar.getStepNumber()) {
                            this.f872B.z0(bVar, true, bVar.getStepNumber() > this.f872B.getCookStepNumber() || bVar.getStepNumber() > this.f872B.getRestStepNumber());
                            this.f872B.lastMLStepNumber = bVar.getStepNumber();
                            m.u1(this.f872B, false, 1, null);
                        }
                    }
                } catch (Exception e10) {
                    U4.b.t("(RecipeStepsViewModel) Exception : " + e10.getMessage(), new Object[0]);
                    this.f872B._finishRecipe.l(kotlin.coroutines.jvm.internal.b.c(404));
                }
                return C4153F.f46609a;
            }
        }

        f(InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new f(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((f) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f870B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1970e<K4.b> interfaceC1970eF = K4.a.f8678a.f(m.this.getOnGoingRecipeId());
                a aVar = new a(m.this);
                this.f870B = 1;
                if (interfaceC1970eF.b(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$jumpToLastLeftStep$1", f = "RecipeStepsViewModel.kt", l = {766, 768}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class g extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f873B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ boolean f874C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ m f875D;

        /* compiled from: RecipeStepsViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$jumpToLastLeftStep$1$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f876B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ m f877C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f877C = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f877C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                K4.b bVarE;
                C4696b.e();
                if (this.f876B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                if (this.f877C.lastAdapterPosition == -1 && this.f877C.lastMLStepNumber > -1 && (bVarE = K4.a.f8678a.e(this.f877C.getOnGoingRecipeId())) != null) {
                    m.A0(this.f877C, bVarE, false, false, 6, null);
                }
                U4.b.t("(RecipeStepsViewModel) last Adapter Position ToJump : " + this.f877C.lastAdapterPosition, new Object[0]);
                this.f877C._lastStepToJump.l(kotlin.coroutines.jvm.internal.b.c(this.f877C.lastAdapterPosition));
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, m mVar, InterfaceC4588d<? super g> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f874C = z10;
            this.f875D = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new g(this.f874C, this.f875D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((g) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f873B;
            if (i10 == 0) {
                C4173r.b(obj);
                if (this.f874C) {
                    this.f873B = 1;
                    if (T.a(100L, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    return C4153F.f46609a;
                }
                C4173r.b(obj);
            }
            G0 g0C = Z.c();
            a aVar = new a(this.f875D, null);
            this.f873B = 2;
            if (C1837g.g(g0C, aVar, this) == objE) {
                return objE;
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$preloadVideos$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class h extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f878B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ a2.g f880D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ d.a f881E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ a.c f882F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ ArrayList<String> f883G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a2.g gVar, d.a aVar, a.c cVar, ArrayList<String> arrayList, InterfaceC4588d<? super h> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f880D = gVar;
            this.f881E = aVar;
            this.f882F = cVar;
            this.f883G = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new h(this.f880D, this.f881E, this.f882F, this.f883G, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((h) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f878B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            m.this.y0(this.f880D, this.f881E, this.f882F);
            if (m.this.shouldCacheRunning) {
                m.this.y1(this.f883G, this.f882F);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$saveWatchedVideosStatusOnCloud$1", f = "RecipeStepsViewModel.kt", l = {1156, 1158}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class i extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f884B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f885C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ SaveWatchedVideoRequestInput f887E;

        /* compiled from: RecipeStepsViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$saveWatchedVideosStatusOnCloud$1$2$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f888B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ m f889C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<WatchedVideos> f890D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, AbstractC3900b<WatchedVideos> abstractC3900b, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f889C = mVar;
                this.f890D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f889C, this.f890D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f888B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f889C.F0(this.f890D);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(SaveWatchedVideoRequestInput saveWatchedVideoRequestInput, InterfaceC4588d<? super i> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f887E = saveWatchedVideoRequestInput;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            i iVar = m.this.new i(this.f887E, interfaceC4588d);
            iVar.f885C = obj;
            return iVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((i) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f884B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.f885C
                oa.C4173r.b(r8)
                goto L6e
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                oa.C4173r.b(r8)     // Catch: java.lang.Throwable -> L20
                goto L3c
            L20:
                r8 = move-exception
                goto L43
            L22:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f885C
                Xb.I r8 = (Xb.I) r8
                A5.m r8 = A5.m.this
                p4.k r1 = r7.f887E
                oa.q$a r4 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L20
                t4.g r8 = A5.m.g0(r8)     // Catch: java.lang.Throwable -> L20
                r7.f884B = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = r8.a(r1, r7)     // Catch: java.lang.Throwable -> L20
                if (r8 != r0) goto L3c
                return r0
            L3c:
                l4.b r8 = (l4.AbstractC3900b) r8     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = oa.C4172q.a(r8)     // Catch: java.lang.Throwable -> L20
                goto L4d
            L43:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r8 = oa.C4173r.a(r8)
                java.lang.Object r8 = oa.C4172q.a(r8)
            L4d:
                A5.m r1 = A5.m.this
                boolean r3 = oa.C4172q.d(r8)
                if (r3 == 0) goto L6f
                r3 = r8
                l4.b r3 = (l4.AbstractC3900b) r3
                Xb.G0 r4 = Xb.Z.c()
                A5.m$i$a r5 = new A5.m$i$a
                r6 = 0
                r5.<init>(r1, r3, r6)
                r7.f885C = r8
                r7.f884B = r2
                java.lang.Object r1 = Xb.C1837g.g(r4, r5, r7)
                if (r1 != r0) goto L6d
                return r0
            L6d:
                r0 = r8
            L6e:
                r8 = r0
            L6f:
                java.lang.Throwable r8 = oa.C4172q.b(r8)
                if (r8 == 0) goto L7e
                java.lang.String r0 = "Exception"
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                U4.b.e(r0, r8)
            L7e:
                oa.F r8 = oa.C4153F.f46609a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: A5.m.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"A5/m$j", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends AbstractC4585a implements F {
        public j(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$startUpdateAvailableDeviceList$1", f = "RecipeStepsViewModel.kt", l = {1494}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class k extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f891B;

        k(InterfaceC4588d<? super k> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(MEATERDevice mEATERDevice, MEATERDevice mEATERDevice2) {
            return !mEATERDevice2.isMaster() && mEATERDevice2.getParentDeviceID() == mEATERDevice.getDeviceID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(Ba.l lVar, Object obj) {
            return ((Boolean) lVar.invoke(obj)).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new k(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((k) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            ArrayList arrayList;
            Object objE = C4696b.e();
            int i11 = this.f891B;
            if (i11 != 0 && i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            do {
                if (m.this.contentType != null) {
                    if (m.this.contentType == EnumC1600h.f14042E || m.this.contentType == EnumC1600h.f14043F) {
                        List<MEATERDevice> listU = M4.h.f11978a.U(false);
                        C3862t.e(listU, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.meater_app.model.MEATERDevice>");
                        arrayList = (ArrayList) listU;
                    } else {
                        M4.h hVar = M4.h.f11978a;
                        List<MEATERDevice> listX = hVar.X(hVar.U(true));
                        C3862t.e(listX, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.meater_app.model.MEATERDevice>");
                        arrayList = (ArrayList) listX;
                    }
                    ArrayList<MEATERDevice> arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((MEATERDevice) obj2).isMEATERBlock()) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    C3862t.f(it, "iterator(...)");
                    i10 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        C3862t.f(next, "next(...)");
                        MEATERDevice mEATERDevice = (MEATERDevice) next;
                        if (mEATERDevice.isMEATERProbe() && mEATERDevice.isOnline() && !mEATERDevice.appearsToHaveCookInProgress()) {
                            i10++;
                        }
                    }
                    for (final MEATERDevice mEATERDevice2 : arrayList2) {
                        final Ba.l lVar = new Ba.l() { // from class: A5.n
                            @Override // Ba.l
                            public final Object invoke(Object obj3) {
                                return Boolean.valueOf(m.k.n(mEATERDevice2, (MEATERDevice) obj3));
                            }
                        };
                        arrayList.removeIf(new Predicate() { // from class: A5.o
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj3) {
                                return m.k.o(lVar, obj3);
                            }
                        });
                    }
                    ((SnapshotStateList) m.this._sortedItems.getValue()).clear();
                    Iterator it2 = arrayList.iterator();
                    C3862t.f(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        C3862t.f(next2, "next(...)");
                        MEATERDevice mEATERDevice3 = (MEATERDevice) next2;
                        if (mEATERDevice3.isOnline()) {
                            if (mEATERDevice3.isMEATERProbe() && !mEATERDevice3.appearsToHaveCookInProgress()) {
                                ((SnapshotStateList) m.this._sortedItems.getValue()).add(new DeviceInfo(Calendar.getInstance().getTimeInMillis(), mEATERDevice3, null, 4, null));
                            } else if (mEATERDevice3.isMEATERBlock()) {
                                ArrayList<MEATERDevice> childDevices = mEATERDevice3.getChildDevices();
                                C3862t.f(childDevices, "getChildDevices(...)");
                                if (!childDevices.isEmpty()) {
                                    ((SnapshotStateList) m.this._sortedItems.getValue()).add(new DeviceInfo(Calendar.getInstance().getTimeInMillis(), mEATERDevice3, null, 4, null));
                                }
                            }
                        }
                    }
                } else {
                    i10 = 0;
                }
                if (i10 == 0) {
                    m.this._showEmptyView.l(kotlin.coroutines.jvm.internal.b.a(true));
                } else {
                    m.this._showEmptyView.l(kotlin.coroutines.jvm.internal.b.a(false));
                }
                m.this._deviceList.setValue(m.this._sortedItems.getValue());
                this.f891B = 1;
            } while (T.a(500L, this) != objE);
            return objE;
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$storeImmediately$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class l extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f893B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f895D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f896E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i10, String str, InterfaceC4588d<? super l> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f895D = i10;
            this.f896E = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new l(this.f895D, this.f896E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((l) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f893B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            K4.a aVar = K4.a.f8678a;
            K4.b bVarE = aVar.e(m.this.getOnGoingRecipeId());
            if (bVarE != null && bVarE.getStepNumber() != this.f895D) {
                K4.a.l(aVar, 0, 0, 0L, m.this.getOnGoingRecipeId(), 0L, 0, this.f895D, this.f896E, null, null, null, null, 0L, 7991, null);
                m.this.T1(this.f895D, this.f896E);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: RecipeStepsViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$storeOnGoingRecipeStepNumber$1", f = "RecipeStepsViewModel.kt", l = {1373, 1374}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: A5.m$m, reason: collision with other inner class name */
    static final class C0016m extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f897B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f899D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f900E;

        /* compiled from: RecipeStepsViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsViewModel$storeOnGoingRecipeStepNumber$1$1", f = "RecipeStepsViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: A5.m$m$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f901B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ m f902C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f903D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ String f904E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, int i10, String str, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f902C = mVar;
                this.f903D = i10;
                this.f904E = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f902C, this.f903D, this.f904E, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f901B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f902C.M1(this.f903D, this.f904E);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0016m(int i10, String str, InterfaceC4588d<? super C0016m> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f899D = i10;
            this.f900E = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new C0016m(this.f899D, this.f900E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0016m) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f897B;
            if (i10 == 0) {
                C4173r.b(obj);
                this.f897B = 1;
                if (T.a(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    return C4153F.f46609a;
                }
                C4173r.b(obj);
            }
            G0 g0C = Z.c();
            a aVar = new a(m.this, this.f899D, this.f900E, null);
            this.f897B = 2;
            if (C1837g.g(g0C, aVar, this) == objE) {
                return objE;
            }
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC4557g saveWatchedVideosUseCase, G5.a preferences, I5.a cacheManager, NetworkConstant networkConstant) {
        super(preferences);
        C3862t.g(saveWatchedVideosUseCase, "saveWatchedVideosUseCase");
        C3862t.g(preferences, "preferences");
        C3862t.g(cacheManager, "cacheManager");
        C3862t.g(networkConstant, "networkConstant");
        this.saveWatchedVideosUseCase = saveWatchedVideosUseCase;
        this.preferences = preferences;
        this.cacheManager = cacheManager;
        this.networkConstant = networkConstant;
        this.stepProgressData = new ArrayList<>();
        D<Integer> d10 = new D<>();
        this._nextStepClick = d10;
        this.nextStepClick = d10;
        D<Integer> d11 = new D<>();
        this._stepListSize = d11;
        this.stepListSize = d11;
        D<Integer> d12 = new D<>();
        this._lastStepToJump = d12;
        this.lastStepToJump = d12;
        D<Integer> d13 = new D<>();
        this._watchedVideosResponse = d13;
        this.watchedVideosResponse = d13;
        D<Integer> d14 = new D<>();
        this._finishRecipe = d14;
        this.finishRecipe = d14;
        this.lastAdapterPosition = -1;
        this.lastMLStepNumber = -1;
        this._sortedItems = J.a(m1.f());
        t<List<Object>> tVarA = J.a(kotlin.collections.r.m());
        this._deviceList = tVarA;
        this.deviceList = C1972g.b(tVarA);
        D<Boolean> d15 = new D<>();
        this._showEmptyView = d15;
        this.showEmptyView = d15;
        this.coroutineExceptionHandler = new j(F.INSTANCE);
    }

    static /* synthetic */ void A0(m mVar, K4.b bVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        mVar.z0(bVar, z10, z11);
    }

    private final void A1() {
        List<StepContent> listD;
        Object next;
        if (getDeviceInstructionVideoStepNumber() == -1 || (listD = z().n().get(getDeviceInstructionVideoStepNumber()).d()) == null) {
            return;
        }
        Iterator<T> it = listD.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((StepContent) next).getType() == EnumC4125A.f46414K) {
                    break;
                }
            }
        }
        StepContent stepContent = (StepContent) next;
        if (stepContent != null) {
            stepContent.c(null);
        }
    }

    public static /* synthetic */ int C0(m mVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return mVar.B0(i10, z10, z11);
    }

    private final void C1(ArrayList<String> videoTutorialIds) {
        HashSet hashSet = new HashSet();
        Iterator<String> it = videoTutorialIds.iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            String next = it.next();
            C3862t.f(next, "next(...)");
            hashSet.add(next);
        }
        this.preferences.T0(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void F0(AbstractC3900b<WatchedVideos> it) {
        if (it instanceof AbstractC3900b.a) {
            this._watchedVideosResponse.l(200);
            return;
        }
        if (!(it instanceof AbstractC3900b.C0590b)) {
            throw new NoWhenBranchMatchedException();
        }
        try {
            WatchedVideos watchedVideos = (WatchedVideos) ((AbstractC3900b.C0590b) it).a();
            ArrayList<String> arrayListA = watchedVideos != null ? watchedVideos.a() : null;
            C3862t.d(arrayListA);
            C1(arrayListA);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this._watchedVideosResponse.l(200);
            throw th;
        }
        this._watchedVideosResponse.l(200);
    }

    private final void G0(StepContent content) {
        MEATERDevice mEATERDeviceO = M4.h.f11978a.o(getProbeID());
        if (mEATERDeviceO != null) {
            String strP0 = P0(z().getAppliance(), mEATERDeviceO);
            U4.b.t("Device Instructional Video URL : " + strP0, new Object[0]);
            content.c(new StepContentMeta(null, null, null, null, null, null, null, null, null, null, null, null, strP0, 4095, null));
        }
    }

    private final HashMap<Integer, StepContentMeta> H0() {
        StepContentMeta meta;
        HashMap<Integer, StepContentMeta> map = new HashMap<>();
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                for (StepContent stepContent : listD) {
                    if (stepContent.getType() == EnumC4125A.f46418O && (meta = stepContent.getMeta()) != null && meta.getAutoProgress() != null) {
                        map.put(Integer.valueOf(i10), meta);
                    }
                }
            }
            i10 = i11;
        }
        for (Integer num : map.keySet()) {
            C3862t.f(num, "next(...)");
            int iIntValue = num.intValue();
            StepContentMeta stepContentMeta = map.get(Integer.valueOf(iIntValue));
            Integer toTime = null;
            String toState = stepContentMeta != null ? stepContentMeta.getToState() : null;
            StepContentMeta stepContentMeta2 = map.get(Integer.valueOf(iIntValue));
            Integer toInternalTemp = stepContentMeta2 != null ? stepContentMeta2.getToInternalTemp() : null;
            StepContentMeta stepContentMeta3 = map.get(Integer.valueOf(iIntValue));
            if (stepContentMeta3 != null) {
                toTime = stepContentMeta3.getToTime();
            }
            U4.b.t("Auto Progress at " + iIntValue + " for " + toState + " OR Internal Temp: " + toInternalTemp + " OR Time: " + toTime, new Object[0]);
        }
        return map;
    }

    private final RecipeAnalyticsRequestInput J0(int stepIndex, long startedAt, long finishedAt, long cancelledAt, long onGoingRecipeId) {
        RecipeAnalyticsRequestInput recipeAnalyticsRequestInput = new RecipeAnalyticsRequestInput(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        recipeAnalyticsRequestInput.D(Integer.valueOf(z().getId()));
        recipeAnalyticsRequestInput.v(Integer.valueOf(z().getDescription().getTotalTimeMinutes()));
        recipeAnalyticsRequestInput.z(Integer.valueOf(z().n().size()));
        recipeAnalyticsRequestInput.I(Integer.valueOf(stepIndex));
        recipeAnalyticsRequestInput.H(z().n().get(stepIndex).getTitle());
        recipeAnalyticsRequestInput.G(z().n().get(stepIndex).getEstimatedDurationMinutes());
        recipeAnalyticsRequestInput.y(x4.g.j());
        recipeAnalyticsRequestInput.x(x4.g.s());
        Date date = new Date();
        date.setTime(startedAt);
        recipeAnalyticsRequestInput.F(DateExtensionKt.getServerDateFormat().format(date));
        if (finishedAt != -1) {
            date.setTime(finishedAt);
            recipeAnalyticsRequestInput.w(DateExtensionKt.getServerDateFormat().format(date));
        }
        if (cancelledAt != -1) {
            date.setTime(cancelledAt);
            recipeAnalyticsRequestInput.s(DateExtensionKt.getServerDateFormat().format(date));
        }
        String hexString = Long.toHexString(onGoingRecipeId);
        C3862t.f(hexString, "toHexString(...)");
        Locale locale = Locale.ROOT;
        String upperCase = hexString.toUpperCase(locale);
        C3862t.f(upperCase, "toUpperCase(...)");
        recipeAnalyticsRequestInput.A(upperCase);
        if (getProbeID() != -1) {
            MEATERDevice mEATERDeviceO = M4.h.f11978a.o(getProbeID());
            C3862t.e(mEATERDeviceO, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.Probe");
            Probe probe = (Probe) mEATERDeviceO;
            recipeAnalyticsRequestInput.u(probe.getDeviceIDString());
            recipeAnalyticsRequestInput.C(Integer.valueOf(probe.getProbeNumber()));
            if (getSetupRecommendedTemperature() != null) {
                recipeAnalyticsRequestInput.E(getSetupRecommendedTemperature());
            }
            recipeAnalyticsRequestInput.B(Integer.valueOf(probe.getPeakTemperature()));
            recipeAnalyticsRequestInput.J(Integer.valueOf(probe.getTargetInternalTemperature()));
            String hexString2 = Long.toHexString(probe.getCookID());
            C3862t.f(hexString2, "toHexString(...)");
            String upperCase2 = hexString2.toUpperCase(locale);
            C3862t.f(upperCase2, "toUpperCase(...)");
            recipeAnalyticsRequestInput.t(upperCase2);
        }
        return recipeAnalyticsRequestInput;
    }

    static /* synthetic */ RecipeAnalyticsRequestInput K0(m mVar, int i10, long j10, long j11, long j12, long j13, int i11, Object obj) {
        return mVar.J0(i10, j10, (i11 & 4) != 0 ? -1L : j11, (i11 & 8) != 0 ? -1L : j12, j13);
    }

    private final void K1() {
        InterfaceC1867v0 interfaceC1867v0 = this.cachingJob;
        if (interfaceC1867v0 == null || !interfaceC1867v0.a()) {
            return;
        }
        InterfaceC1867v0 interfaceC1867v02 = this.cachingJob;
        C3862t.d(interfaceC1867v02);
        InterfaceC1867v0.a.a(interfaceC1867v02, null, 1, null);
        this.shouldCacheRunning = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(int stepNumber, String stepTitle) {
        C1841i.d(android.view.Z.a(this), null, null, new l(stepNumber, stepTitle, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(RecipeAnalyticsRequestInput recipeAnalyticsRequestInput) {
        if (this.preferences.l() == null) {
            return;
        }
        PendingRequest pendingRequest = new PendingRequest();
        pendingRequest.requestMethod = this.networkConstant.getNetworkConstant().e();
        pendingRequest.requestBody = new Gson().t(recipeAnalyticsRequestInput);
        LocalStorage.sharedStorage().pendingRequestDAO().b(pendingRequest);
    }

    private final String P0(r appliance, MEATERDevice device) {
        String strO1 = o1(appliance);
        String strP1 = p1(device);
        String str = this.preferences.m1() ? "https://recipes.dev.meater.cloud/videos/instructional" : "https://recipes.meater.cloud/videos/instructional";
        String str2 = File.separator;
        return str + str2 + strO1 + str2 + strP1 + ".mp4";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T1(int stepNumber, String stepTitle) {
        MEATERDevice mEATERDeviceO;
        if (getProbeID() == -1 || (mEATERDeviceO = M4.h.f11978a.o(getProbeID())) == null || !mEATERDeviceO.isMEATERProbe()) {
            return;
        }
        Probe probe = (Probe) mEATERDeviceO;
        probe.setOnGoingRecipeStepTitle(stepTitle);
        probe.setRecipeStepID(stepNumber);
        probe.markCookSetupModified();
    }

    private final int e1() {
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (((StepContent) it.next()).getType() == EnumC4125A.f46414K) {
                        return i10;
                    }
                }
            }
            i10 = i11;
        }
        return -1;
    }

    private final int f1(String state) {
        StepContentMeta meta;
        String toState;
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                for (StepContent stepContent : listD) {
                    if (stepContent.getType() == EnumC4125A.f46418O && (meta = stepContent.getMeta()) != null && (toState = meta.getToState()) != null && C3862t.b(toState, state)) {
                        return i10;
                    }
                }
            }
            i10 = i11;
        }
        return -1;
    }

    private final int g1() {
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (((StepContent) it.next()).getType() == EnumC4125A.f46416M) {
                        return i10;
                    }
                }
            }
            i10 = i11;
        }
        return -1;
    }

    private final int h1() {
        StepContentMeta meta;
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                for (StepContent stepContent : listD) {
                    if (stepContent.getType() == EnumC4125A.f46418O && (meta = stepContent.getMeta()) != null && meta.getToTime() != null) {
                        return i10;
                    }
                }
            }
            i10 = i11;
        }
        return -1;
    }

    private final int i1() {
        return z().n().size() - 1;
    }

    private final int j1() {
        StepContentMeta meta;
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                for (StepContent stepContent : listD) {
                    if (stepContent.getType() == EnumC4125A.f46418O && (meta = stepContent.getMeta()) != null && meta.getToInternalTemp() != null) {
                        return i10;
                    }
                }
            }
            i10 = i11;
        }
        return -1;
    }

    private final int k1(int stepNumber, boolean shouldIgnoreStepBlockFlag) {
        K4.b bVarE = K4.a.f8678a.e(getOnGoingRecipeId());
        int iP = -1;
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                for (StepContent stepContent : listD) {
                    if (stepContent.getType() == EnumC4125A.f46418O) {
                        if (bVarE != null && !bVarE.getElapsedTimeStepCrossed() && getElapsedTimeStepNumber() != -1) {
                            U4.b.t("(getStepNumberTillRemoveFromHeat) = #1.1 Last Visible Step " + getElapsedTimeStepNumber(), new Object[0]);
                            iP = getElapsedTimeStepNumber();
                        }
                        if (bVarE != null && !bVarE.getInternalTempStepCrossed() && getInternalTempStepNumber() != -1) {
                            U4.b.t("(getStepNumberTillRemoveFromHeat) = #1.2 Last Visible Step " + getInternalTempStepNumber(), new Object[0]);
                            iP = getInternalTempStepNumber();
                        }
                        StepContentMeta meta = stepContent.getMeta();
                        if (Ub.n.u(meta != null ? meta.getToState() : null, C5060e.f52836a.o(), false, 2, null) && stepNumber < getCookStepNumber()) {
                            U4.b.t("(getStepNumberTillRemoveFromHeat) = #1.3 Last Visible Step " + i10, new Object[0]);
                            iP = getCookStepNumber();
                        }
                    }
                }
            }
            i10 = i11;
        }
        if (stepNumber != iP || !shouldIgnoreStepBlockFlag) {
            return iP;
        }
        U4.b.t("(getStepNumberTillRemoveFromHeat) = #1.4 Changed Last Visible Step to " + getCookStepNumber(), new Object[0]);
        return getCookStepNumber();
    }

    private final int l1() {
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                for (StepContent stepContent : listD) {
                    if (stepContent.getType() == EnumC4125A.f46418O) {
                        StepContentMeta meta = stepContent.getMeta();
                        if (Ub.n.u(meta != null ? meta.getToState() : null, C5060e.f52836a.n(), false, 2, null)) {
                            return i10;
                        }
                    }
                }
            }
            i10 = i11;
        }
        return z().n().size();
    }

    private final int m1() {
        int i10 = 0;
        for (Object obj : z().n()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.r.w();
            }
            List<StepContent> listD = ((Step) obj).d();
            if (listD != null) {
                Iterator<T> it = listD.iterator();
                while (it.hasNext()) {
                    if (((StepContent) it.next()).getType() == EnumC4125A.f46417N) {
                        return i10;
                    }
                }
            }
            i10 = i11;
        }
        return -1;
    }

    private final String o1(r appliance) {
        switch (a.f848e[appliance.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return C5060e.f52836a.f();
            case 4:
                return C5060e.f52836a.c();
            case 5:
                return C5060e.f52836a.e();
            case 6:
                return C5060e.f52836a.g();
            case 7:
                return C5060e.f52836a.b();
            case 8:
                return C5060e.f52836a.d();
            case 9:
                return C5060e.f52836a.f();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String p1(MEATERDevice device) {
        T4.p parentOrMasterOrThisDevice = device.getParentOrMasterOrThisDevice();
        if (parentOrMasterOrThisDevice instanceof MEATERDevice) {
            MEATERDevice mEATERDevice = (MEATERDevice) parentOrMasterOrThisDevice;
            if (mEATERDevice.isMEATERPlus()) {
                int i10 = a.f847d[mEATERDevice.getMEATERDeviceType().ordinal()];
                return (i10 == 1 || i10 == 2) ? C5060e.f52836a.k() : i10 != 3 ? C5060e.f52836a.i() : C5060e.f52836a.m();
            }
            if (mEATERDevice.isMEATERBlock()) {
                return mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK ? C5060e.f52836a.j() : mEATERDevice.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK ? C5060e.f52836a.l() : C5060e.f52836a.h();
            }
        }
        return C5060e.f52836a.i();
    }

    public static /* synthetic */ void u1(m mVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        mVar.t1(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(a2.g dataSpec, d.a progressListener, a.c cacheDataSource) {
        Object objA;
        try {
            C4172q.Companion companion = C4172q.INSTANCE;
            new b2.d(cacheDataSource.a(), dataSpec, null, progressListener).a();
            objA = C4172q.a(C4153F.f46609a);
        } catch (Throwable th) {
            C4172q.Companion companion2 = C4172q.INSTANCE;
            objA = C4172q.a(C4173r.a(th));
        }
        Throwable thB = C4172q.b(objA);
        if (thB != null) {
            thB.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(ArrayList<String> videosList, a.c cacheDataSource) {
        String str;
        if (videosList.isEmpty()) {
            str = null;
        } else {
            str = videosList.get(0);
            videosList.remove(0);
        }
        if (!this.shouldCacheRunning || str == null || Ub.n.a0(str)) {
            return;
        }
        this.cachingJob = C1841i.d(android.view.Z.a(this), Z.b(), null, new h(new a2.g(Uri.parse(str)), new d.a() { // from class: A5.l
            @Override // b2.d.a
            public final void a(long j10, long j11, long j12) {
                m.z1(j10, j11, j12);
            }
        }, cacheDataSource, videosList, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(K4.b onGoingRecipeInfo, boolean shouldPopulateValue, boolean shouldIgnoreStepBlockFlag) {
        int iIndexOf = Y0(B0(onGoingRecipeInfo.getStepNumber(), shouldPopulateValue, shouldIgnoreStepBlockFlag)).indexOf(Integer.valueOf(onGoingRecipeInfo.getStepNumber()));
        this.lastAdapterPosition = iIndexOf;
        K4.a.l(K4.a.f8678a, 0, 0, 0L, 0L, 0L, iIndexOf, 0, null, null, null, null, null, 0L, 8159, null);
        U4.b.t("(RecipeStepsViewModel) Calculated Adapter Position for Step {" + onGoingRecipeInfo.getStepNumber() + "} is = " + this.lastAdapterPosition, new Object[0]);
    }

    public final int B0(int stepNumber, boolean shouldPopulateValue, boolean shouldIgnoreStepBlockFlag) {
        int iT;
        int size;
        Integer numE;
        U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #0 Step Number : " + stepNumber + ", should Populate Value : " + shouldPopulateValue + ", shouldIgnoreBlockFlag " + shouldIgnoreStepBlockFlag, new Object[0]);
        if (getProbeID() != -1) {
            U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.0 Cook State : " + getCookState(), new Object[0]);
            switch (a.f845b[getCookState().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (getCookFinished()) {
                        U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.1 Cook Finished", new Object[0]);
                        size = z().n().size();
                        break;
                    } else if (shouldIgnoreStepBlockFlag) {
                        if (stepNumber >= getCookStepNumber()) {
                            if (stepNumber >= getRestStepNumber()) {
                                U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.4 shouldIgnoreStepBlockFlag: True, and Till End", new Object[0]);
                                size = z().n().size();
                                break;
                            } else {
                                U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.3 shouldIgnoreStepBlockFlag: True, and Till Resting", new Object[0]);
                                iT = l1();
                            }
                        } else {
                            U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.2 shouldIgnoreStepBlockFlag: True, and Step Number is Remove From Heat", new Object[0]);
                            iT = k1(stepNumber, shouldIgnoreStepBlockFlag);
                        }
                        size = iT + 1;
                        break;
                    } else {
                        if ((getElapsedTimeStepNumber() == -1 && getInternalTempStepNumber() == -1) || (stepNumber > getElapsedTimeStepNumber() && stepNumber > getInternalTempStepNumber())) {
                            if (stepNumber > getCookStepNumber()) {
                                if (stepNumber > getRestStepNumber()) {
                                    U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.8 shouldIgnoreStepBlockFlag: False, Till Remove From Heat", new Object[0]);
                                    size = z().n().size();
                                    break;
                                } else {
                                    U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.7 shouldIgnoreStepBlockFlag: False, Till Resting", new Object[0]);
                                    iT = getRestStepNumber();
                                }
                            } else {
                                U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.6 shouldIgnoreStepBlockFlag: False, Till Resting", new Object[0]);
                                iT = getCookStepNumber();
                            }
                        } else {
                            U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #3.5 shouldIgnoreStepBlockFlag: False, Till Intermediate Blocking", new Object[0]);
                            iT = getElapsedTimeStepNumber() != -1 ? getElapsedTimeStepNumber() : getInternalTempStepNumber();
                        }
                        size = iT + 1;
                    }
                    break;
                case 4:
                case 5:
                    if (!shouldIgnoreStepBlockFlag) {
                        U4.b.t("RecipeStepsViewModel calculateAndPopulateStepListSize) #4.3 shouldIgnoreStepBlockFlag: False, Till Resting steps", new Object[0]);
                        iT = l1();
                    } else if (stepNumber >= getRestStepNumber()) {
                        U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #4.2 shouldIgnoreStepBlockFlag: True, Till End steps", new Object[0]);
                        size = z().n().size();
                        break;
                    } else {
                        U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #4.1 shouldIgnoreStepBlockFlag: True, Till Resting", new Object[0]);
                        iT = l1();
                    }
                    size = iT + 1;
                    break;
                case 6:
                case 7:
                case 8:
                    U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #5.0 Cook Finished, Till end steps", new Object[0]);
                    C1841i.d(android.view.Z.a(this), null, null, new d(null), 3, null);
                    H(true);
                    size = z().n().size();
                    break;
                default:
                    U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #6.0 Outer Else Condition", new Object[0]);
                    size = z().n().size();
                    break;
            }
        } else {
            U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #1.0 Probe is not selected", new Object[0]);
            if (getSetupCookStepNumber() == -1 || getCookFinished()) {
                U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #1.1 First condition", new Object[0]);
                size = z().n().size();
            } else {
                U4.b.t("RecipeStepsViewModel (calculateAndPopulateStepListSize) #1.2 Probe is not selected", new Object[0]);
                iT = getDeviceSelectionStepNumber();
                size = iT + 1;
            }
        }
        if (shouldPopulateValue && ((numE = this._stepListSize.e()) == null || numE.intValue() != size)) {
            this._stepListSize.l(Integer.valueOf(size));
        }
        U4.b.t("RecipeStepsViewModel calculateAndPopulateStepListSize = " + size, new Object[0]);
        return size;
    }

    public final void B1() {
        this.lastAdapterPosition = -1;
    }

    public final void D0(Integer stepNumber, boolean isRecipeCancelled) {
        this.analyticsJob = C1841i.d(android.view.Z.a(this), Z.b().s(this.coroutineExceptionHandler), null, new e(stepNumber, isRecipeCancelled, null), 2, null);
    }

    public final void D1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Q5.b.f14344D.getValue());
        arrayList.add(Q5.b.f14345E.getValue());
        arrayList.add(Q5.b.f14346F.getValue());
        arrayList.add(Q5.b.f14347G.getValue());
        SaveWatchedVideoRequestInput saveWatchedVideoRequestInput = new SaveWatchedVideoRequestInput(arrayList);
        if (saveWatchedVideoRequestInput.a().isEmpty()) {
            return;
        }
        this.saveWatchedVideosJob = C1841i.d(android.view.Z.a(this), Z.b().s(this.coroutineExceptionHandler), null, new i(saveWatchedVideoRequestInput, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E0(com.apptionlabs.meater_app.model.MEATERDevice r7) {
        /*
            r6 = this;
            java.lang.String r0 = "device"
            kotlin.jvm.internal.C3862t.g(r7, r0)
            com.apptionlabs.meater_app.model.MEATERDevice r0 = r7.getParentDevice()
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L4a
            boolean r0 = r0.isMEATERBlock()
            if (r0 != r4) goto L4a
            com.apptionlabs.meater_app.model.MEATERDevice r0 = r7.getParentDevice()
            if (r0 == 0) goto L20
            com.apptionlabs.meater_app.model.MEATERDeviceType r0 = r0.getMEATERDeviceType()
            goto L21
        L20:
            r0 = r3
        L21:
            com.apptionlabs.meater_app.model.MEATERDeviceType r5 = com.apptionlabs.meater_app.model.MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK
            if (r0 != r5) goto L26
            goto L36
        L26:
            com.apptionlabs.meater_app.model.MEATERDevice r0 = r7.getParentDevice()
            if (r0 == 0) goto L31
            com.apptionlabs.meater_app.model.MEATERDeviceType r0 = r0.getMEATERDeviceType()
            goto L32
        L31:
            r0 = r3
        L32:
            com.apptionlabs.meater_app.model.MEATERDeviceType r5 = com.apptionlabs.meater_app.model.MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK
            if (r0 != r5) goto L4a
        L36:
            com.apptionlabs.meater_app.model.MEATERDevice r7 = r7.getParentDevice()
            if (r7 == 0) goto L40
            java.lang.String r3 = r7.getFirmwareRevision()
        L40:
            java.lang.String r7 = "v.3.0.5.44"
            int r7 = P5.Q.e(r3, r7)
            if (r7 > r1) goto L69
        L48:
            r2 = r4
            goto L69
        L4a:
            com.apptionlabs.meater_app.model.MEATERDevice r0 = r7.getParentDevice()
            if (r0 == 0) goto L69
            boolean r0 = r0.isMEATERBlock()
            if (r0 != r4) goto L69
            com.apptionlabs.meater_app.model.MEATERDevice r7 = r7.getParentDevice()
            if (r7 == 0) goto L60
            java.lang.String r3 = r7.getFirmwareRevision()
        L60:
            java.lang.String r7 = "v.3.0.3.1"
            int r7 = P5.Q.e(r3, r7)
            if (r7 > r1) goto L69
            goto L48
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A5.m.E0(com.apptionlabs.meater_app.model.MEATERDevice):boolean");
    }

    public final void E1(Probe probe, List<Alert> alerts) {
        C3862t.g(probe, "probe");
        C3862t.g(alerts, "alerts");
        if (probe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
            return;
        }
        for (Alert alert : alerts) {
            com.apptionlabs.meater_app.model.Alert alert2 = new com.apptionlabs.meater_app.model.Alert();
            int i10 = a.f846c[alert.getType().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    alert2.setType(AlarmType.ALARM_TYPE_TIME_FROM_NOW);
                } else if (i10 == 3) {
                    alert2.setType(AlarmType.ALARM_TYPE_MAX_INTERNAL);
                } else {
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    alert2.setType(AlarmType.ALARM_TYPE_REPEAT_DURATION);
                }
            }
            if (alert2.getType() != null) {
                alert2.setIsNewAlert(true);
                alert2.setLimit(alert.getValue());
                alert2.setState(AlarmState.ALARM_STATE_NOT_READY);
                alert2.setName(alert.getName());
                probe.getAlerts().add(alert2);
            }
        }
        U4.b.t(alerts.size() + " x Alerts set for Probe " + getProbeID(), new Object[0]);
    }

    public final void F1(List<Alert> alerts) {
        C3862t.g(alerts, "alerts");
        if (getProbeID() != -1) {
            MEATERDevice mEATERDeviceO = M4.h.f11978a.o(getProbeID());
            C3862t.e(mEATERDeviceO, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.Probe");
            E1((Probe) mEATERDeviceO, alerts);
        }
    }

    public final void G1() {
        List<StepContent> listD;
        Object next;
        if (getDeviceInstructionVideoStepNumber() == -1 || (listD = z().n().get(getDeviceInstructionVideoStepNumber()).d()) == null) {
            return;
        }
        Iterator<T> it = listD.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((StepContent) next).getType() == EnumC4125A.f46414K) {
                    break;
                }
            }
        }
        StepContent stepContent = (StepContent) next;
        if (stepContent != null) {
            G0(stepContent);
        }
    }

    public final void H1(EnumC1600h contentType) {
        C3862t.g(contentType, "contentType");
        this.contentType = contentType;
    }

    public final void I0() {
        D<Integer> d10 = this._stepListSize;
        d10.l(d10.e());
    }

    public final void I1(String str) {
        this.recommendedTemperature = str;
    }

    public final void J1() {
        InterfaceC1867v0 interfaceC1867v0 = this.deviceListUpdateJob;
        if (interfaceC1867v0 != null) {
            C3862t.d(interfaceC1867v0);
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
            this.deviceListUpdateJob = null;
        }
        this.deviceListUpdateJob = C1841i.d(android.view.Z.a(this), Z.b(), null, new k(null), 2, null);
    }

    public final ArrayList<String> L0() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<Step> it = z().n().iterator();
        while (it.hasNext()) {
            String title = it.next().getTitle();
            if (title != null) {
                arrayList.add(title);
            }
        }
        return arrayList;
    }

    public final void L1() {
        InterfaceC1867v0 interfaceC1867v0 = this.deviceListUpdateJob;
        if (interfaceC1867v0 != null) {
            C3862t.d(interfaceC1867v0);
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
            this.deviceListUpdateJob = null;
        }
    }

    /* renamed from: M0, reason: from getter */
    public I5.a getCacheManager() {
        return this.cacheManager;
    }

    public final StepContent N0() {
        List<StepContent> listD = z().n().get(getSetupCookStepNumber()).d();
        if (listD == null) {
            return null;
        }
        for (StepContent stepContent : listD) {
            if (stepContent.getType() == EnumC4125A.f46417N) {
                return stepContent;
            }
        }
        return null;
    }

    public final void N1(int stepNumber, String stepTitle) {
        C3862t.g(stepTitle, "stepTitle");
        K(stepNumber);
        U4.b.t("CHINTAN ***** Step Number : " + stepNumber + " OnResume", new Object[0]);
        InterfaceC1867v0 interfaceC1867v0 = this.storeJob;
        if (interfaceC1867v0 != null) {
            if (interfaceC1867v0 != null) {
                InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
            }
            this.storeJob = null;
        }
        if (stepNumber == 0) {
            this.storeJob = C1841i.d(android.view.Z.a(this), Z.b(), null, new C0016m(stepNumber, stepTitle, null), 2, null);
            return;
        }
        InterfaceC1867v0 interfaceC1867v02 = this.storeJob;
        if (interfaceC1867v02 != null) {
            if (interfaceC1867v02 != null) {
                InterfaceC1867v0.a.a(interfaceC1867v02, null, 1, null);
            }
            this.storeJob = null;
        }
        M1(stepNumber, stepTitle);
    }

    public final EnumC5057b O0(int stepNumber) {
        return stepNumber == getDeviceSelectionStepNumber() ? EnumC5057b.f52810E : stepNumber == getElapsedTimeStepNumber() ? EnumC5057b.f52811F : stepNumber == getInternalTempStepNumber() ? EnumC5057b.f52811F : stepNumber == getCookStepNumber() ? (getCookFinished() || getCookState().compareTo(DeviceCookState.COOK_STATE_READY_FOR_RESTING) >= 0) ? EnumC5057b.f52809D : EnumC5057b.f52812G : stepNumber == getRestStepNumber() ? (getCookFinished() || getCookState().compareTo(DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE) >= 0) ? EnumC5057b.f52809D : EnumC5057b.f52814I : stepNumber == getFinishStepNumber() ? EnumC5057b.f52815J : EnumC5057b.f52809D;
    }

    public final void P1(DeviceCookState cookState) {
        C3862t.g(cookState, "cookState");
        I(cookState);
    }

    public final H<List<Object>> Q0() {
        return this.deviceList;
    }

    public final void Q1(MeatCut meatCut) {
        C3862t.g(meatCut, "meatCut");
        this.meatCut = meatCut;
    }

    public final B<Integer> R0() {
        return this.finishRecipe;
    }

    public final void R1(String recommendedTemperature) {
        C3862t.g(recommendedTemperature, "recommendedTemperature");
        this.recommendedTemperature = recommendedTemperature;
    }

    public final B<Integer> S0() {
        return this.lastStepToJump;
    }

    public final void S1(Probe relatedProbe) {
        C3862t.g(relatedProbe, "relatedProbe");
        x5.g gVar = x5.g.f52863a;
        long jW = getOnGoingRecipeId();
        long deviceID = relatedProbe.getDeviceID();
        DeviceCookState cookState = relatedProbe.getCookState();
        C3862t.f(cookState, "getCookState(...)");
        gVar.n(jW, deviceID, cookState);
    }

    /* renamed from: T0, reason: from getter */
    public final MeatCut getMeatCut() {
        return this.meatCut;
    }

    public final int U0(int stepNumber) {
        if (stepNumber < getSetupCookStepNumber()) {
            stepNumber++;
        }
        switch (a.f844a[O0(stepNumber).ordinal()]) {
            case 1:
                return R.string.menu_text_next;
            case 2:
                return getProbeID() == -1 ? R.string.select_device : R.string.menu_text_next;
            case 3:
            case 4:
            case 5:
            case 6:
                return R.string.wait_text;
            case 7:
                return R.string.recipe_finish_button_text;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final B<Integer> V0() {
        return this.nextStepClick;
    }

    /* renamed from: W0, reason: from getter */
    public final G5.a getPreferences() {
        return this.preferences;
    }

    /* renamed from: X0, reason: from getter */
    public final Setup getRecipeSetup() {
        return this.recipeSetup;
    }

    public final ArrayList<Integer> Y0(int listLimit) {
        U4.b.t("(RecipeStepsViewModel) getRecipeStepsList : LastLimit " + listLimit, new Object[0]);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < listLimit; i10++) {
            if (getProbeID() != -1 && i10 == getDeviceSelectionStepNumber()) {
                U4.b.t("(RecipeStepsViewModel) Recipe Steps List : Probe Selected : " + getProbeID() + " hence DeviceSelection is ignored", new Object[0]);
            } else if (getCookConfirmed() && i10 == getSetupCookStepNumber() && getCookState().compareTo(DeviceCookState.COOK_STATE_STARTED) >= 0) {
                U4.b.t("(RecipeStepsViewModel) Recipe Steps List : Cook Confirmed : " + getCookConfirmed() + " hence SetupCookStep is ignored", new Object[0]);
            } else {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        U4.b.t("(RecipeStepsViewModel) Recipe Steps List : " + arrayList, new Object[0]);
        return arrayList;
    }

    /* renamed from: Z0, reason: from getter */
    public final String getRecommendedTemperature() {
        return this.recommendedTemperature;
    }

    public final B<Boolean> a1() {
        return this.showEmptyView;
    }

    public final List<OnCompleteAction> b1(int stepNumber) {
        if (stepNumber < z().n().size()) {
            return z().n().get(stepNumber).b();
        }
        return null;
    }

    public final List<StepContent> c1(int stepNumber) {
        List<StepContent> listD = z().n().get(stepNumber).d();
        U4.b.t("Step Number: " + stepNumber + " , Title : " + z().n().get(stepNumber).getTitle(), new Object[0]);
        if (listD != null) {
            Iterator<StepContent> it = listD.iterator();
            while (it.hasNext()) {
                U4.b.t("Step Number: " + stepNumber + " , Content Type: " + it.next().getType(), new Object[0]);
            }
        }
        return listD;
    }

    public final B<Integer> d1() {
        return this.stepListSize;
    }

    @Override // android.view.Y
    protected void g() {
        super.g();
        InterfaceC1867v0 interfaceC1867v0 = this.lastStepJob;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
        this.shouldElapsedTimeJobRunning = false;
        this.shouldCookInternalTempJobRunning = false;
        InterfaceC1867v0 interfaceC1867v02 = this.cookElapsedTimeJob;
        if (interfaceC1867v02 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v02, null, 1, null);
        }
        InterfaceC1867v0 interfaceC1867v03 = this.cookInternalTempJob;
        if (interfaceC1867v03 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v03, null, 1, null);
        }
        InterfaceC1867v0 interfaceC1867v04 = this.saveWatchedVideosJob;
        if (interfaceC1867v04 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v04, null, 1, null);
        }
        InterfaceC1867v0 interfaceC1867v05 = this.analyticsJob;
        if (interfaceC1867v05 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v05, null, 1, null);
        }
        InterfaceC1867v0 interfaceC1867v06 = this.deviceListUpdateJob;
        if (interfaceC1867v06 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v06, null, 1, null);
        }
        A0.i(android.view.Z.a(this).getCoroutineContext(), null, 1, null);
        K1();
        U4.b.t("(RecipeStepsViewModel) OnCleared. Clearing all resources and Jobs.", new Object[0]);
    }

    @Override // y5.AbstractC5128a
    public void k() {
        super.k();
        A1();
    }

    public final ArrayList<Integer> n1() {
        return this.stepProgressData;
    }

    public final B<Integer> q1() {
        return this.watchedVideosResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r1(int recipeId) {
        StepContent stepContentN0;
        StepContentMeta meta;
        Setup setup;
        StepContentMeta meta2;
        String video;
        this.stepProgressData.clear();
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<Step> it = z().n().iterator();
        while (true) {
            StepContent stepContent = null;
            if (!it.hasNext()) {
                break;
            }
            Step next = it.next();
            Integer estimatedDurationMinutes = next.getEstimatedDurationMinutes();
            C3862t.d(estimatedDurationMinutes);
            estimatedDurationMinutes.intValue();
            this.stepProgressData.add(estimatedDurationMinutes);
            List<StepContent> listD = next.d();
            if (listD != null) {
                Iterator<T> it2 = listD.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((StepContent) next2).getType() == EnumC4125A.f46413J) {
                        stepContent = next2;
                        break;
                    }
                }
                stepContent = stepContent;
            }
            if (stepContent != null && (meta2 = stepContent.getMeta()) != null && (video = meta2.getVideo()) != null) {
                arrayList.add(video);
            }
        }
        this.shouldCacheRunning = true;
        y1(arrayList, this.cacheManager.getCacheDataSourceFactory());
        M(g1());
        U4.b.t("(RecipeStepsViewModel) deviceSelectionStepNumber = " + getDeviceSelectionStepNumber(), new Object[0]);
        U(m1());
        U4.b.t("(RecipeStepsViewModel) setupCookStepNumber = " + getSetupCookStepNumber(), new Object[0]);
        L(e1());
        U4.b.t("(RecipeStepsViewModel) deviceInstructionVideoStepNumber = " + getDeviceInstructionVideoStepNumber(), new Object[0]);
        N(h1());
        U4.b.t("(RecipeStepsViewModel) elapsedTimeStepNumber = " + getElapsedTimeStepNumber(), new Object[0]);
        P(j1());
        U4.b.t("(RecipeStepsViewModel) internalTempStepNumber = " + getInternalTempStepNumber(), new Object[0]);
        C5060e c5060e = C5060e.f52836a;
        J(f1(c5060e.o()));
        U4.b.t("(RecipeStepsViewModel) cookStepNumber = " + getCookStepNumber(), new Object[0]);
        T(f1(c5060e.n()));
        U4.b.t("(RecipeStepsViewModel) restStepNumber = " + getRestStepNumber(), new Object[0]);
        O(i1());
        U4.b.t("(RecipeStepsViewModel) finishStepNumber = " + getFinishStepNumber(), new Object[0]);
        E(H0());
        if (getSetupCookStepNumber() != -1 && (stepContentN0 = N0()) != null && (meta = stepContentN0.getMeta()) != null && (setup = meta.getSetup()) != null) {
            this.recipeSetup = setup;
            MeatModel meatModelF = x5.g.f52863a.f(setup);
            if (meatModelF != null) {
                MeatCutsHelper meatCutsHelper = MeatCutsHelper.getInstance();
                Integer id2 = meatModelF.f31705id;
                C3862t.f(id2, "id");
                MeatCut meatCut = meatCutsHelper.getMeatCut(id2.intValue());
                if (getProbeID() == -1) {
                    this.meatCut = meatCut;
                    this.recommendedTemperature = setup.getRecommendedTemperature();
                } else {
                    MEATERDevice mEATERDeviceO = M4.h.f11978a.o(getProbeID());
                    C3862t.e(mEATERDeviceO, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.Probe");
                    Probe probe = (Probe) mEATERDeviceO;
                    if (probe.getCookPreset() == null) {
                        this.recommendedTemperature = setup.getRecommendedTemperature();
                        this.meatCut = meatCut;
                    } else {
                        this.meatCut = probe.getmCut();
                        MeatCookingTemperature cookPreset = probe.getCookPreset();
                        this.recommendedTemperature = cookPreset != null ? cookPreset.name : null;
                    }
                }
            }
        }
        U4.b.t("(RecipeStepsViewModel) Cook Setup = " + this.recipeSetup, new Object[0]);
        U4.b.t("(RecipeStepsViewModel) Recommended Temperature = " + this.recommendedTemperature, new Object[0]);
        K4.b bVarE = K4.a.f8678a.e(getOnGoingRecipeId());
        if (bVarE != null) {
            R(bVarE.getProbeId());
            G(bVarE.getCookConfirmed());
            H(bVarE.getCookFinish());
            this.lastMLStepNumber = bVarE.getStepNumber();
            U4.b.t("(RecipeStepsViewModel) StepNumber from OnGoingRecipeInfo : " + bVarE.getStepNumber(), new Object[0]);
        }
        C1841i.d(android.view.Z.a(this), null, null, new f(null), 3, null);
    }

    public final boolean s1(int stepNumber) {
        int i10 = stepNumber + 1;
        return i10 < z().n().size() && z().n().get(i10).getOptional() != null;
    }

    public final void t1(boolean withDelay) {
        InterfaceC1867v0 interfaceC1867v0 = this.lastStepJob;
        if (interfaceC1867v0 != null) {
            if (interfaceC1867v0 != null) {
                InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
            }
            this.lastStepJob = null;
        }
        this.lastStepJob = C1841i.d(android.view.Z.a(this), Z.b().s(this.coroutineExceptionHandler), null, new g(withDelay, this, null), 2, null);
    }

    public final boolean v1() {
        MEATERDevice mEATERDeviceO = M4.h.f11978a.o(getProbeID());
        if (mEATERDeviceO instanceof Probe) {
            Probe probe = (Probe) mEATERDeviceO;
            if (probe.getCookState().getValue() == DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue()) {
                U4.b.t("(manuallyChangeRemoveFromHeatToResting) Cook State is not in READY FOR RESTING", new Object[0]);
                probe.setCookState(DeviceCookState.COOK_STATE_RESTING);
                probe.getEventLog().addManuallyMovedToRestingEvent();
                C2316d.k(probe);
                probe.markCookSetupModified();
                return true;
            }
            U4.b.t("(manuallyChangeRemoveFromHeatToResting) Cook State is not in READY FOR RESTING", new Object[0]);
        }
        return false;
    }

    public final void w0(int stepNumber, int timeToWatch) {
        this.shouldElapsedTimeJobRunning = true;
        K4.b bVarE = K4.a.f8678a.e(getOnGoingRecipeId());
        if (bVarE != null) {
            this.shouldElapsedTimeJobRunning = true ^ bVarE.getElapsedTimeStepCrossed();
        }
        if (this.cookElapsedTimeJob == null) {
            this.cookElapsedTimeJob = C1841i.d(android.view.Z.a(this), Z.b().s(this.coroutineExceptionHandler), null, new b(timeToWatch, this, stepNumber, null), 2, null);
        }
    }

    public final void w1(int numberOfStepsToSkip) {
        this._nextStepClick.l(Integer.valueOf(numberOfStepsToSkip));
    }

    public final void x0(int stepNumber, int temperatureToWatch) {
        this.shouldCookInternalTempJobRunning = true;
        K4.b bVarE = K4.a.f8678a.e(getOnGoingRecipeId());
        if (bVarE != null) {
            this.shouldCookInternalTempJobRunning = true ^ bVarE.getInternalTempStepCrossed();
        }
        if (this.cookInternalTempJob == null) {
            this.cookInternalTempJob = C1841i.d(android.view.Z.a(this), Z.b().s(this.coroutineExceptionHandler), null, new c(temperatureToWatch, this, stepNumber, null), 2, null);
        }
    }

    public final void x1(int currentPosition) {
        DeviceCookState deviceCookStateO = getCookState();
        DeviceCookState deviceCookState = DeviceCookState.COOK_STATE_READY_FOR_RESTING;
        if (deviceCookStateO.compareTo(deviceCookState) >= 0) {
            if (getCookState() == deviceCookState) {
                if (currentPosition == getCookStepNumber()) {
                    w1(0);
                }
            } else {
                if (getCookState().compareTo(DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE) < 0 || currentPosition != getRestStepNumber()) {
                    return;
                }
                w1(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(long j10, long j11, long j12) {
    }
}
