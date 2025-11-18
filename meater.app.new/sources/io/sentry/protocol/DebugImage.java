package io.sentry.protocol;

import io.sentry.C9518n2;
import io.sentry.InterfaceC9448h3;
import io.sentry.InterfaceC9504l2;
import io.sentry.InterfaceC9578r2;
import io.sentry.InterfaceC9670w1;
import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DebugImage implements InterfaceC9578r2 {
    public static final String JVM = "jvm";
    public static final String PROGUARD = "proguard";
    private String arch;
    private String codeFile;
    private String codeId;
    private String debugFile;
    private String debugId;
    private String imageAddr;
    private Long imageSize;
    private String type;
    private Map<String, Object> unknown;
    private String uuid;

    /* renamed from: io.sentry.protocol.DebugImage$a */
    public static final class C9538a implements InterfaceC9504l2<DebugImage> {
        @Override // io.sentry.InterfaceC9504l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DebugImage mo30683a(C9518n2 c9518n2, InterfaceC9670w1 interfaceC9670w1) throws Exception {
            String strM31879B;
            DebugImage debugImage = new DebugImage();
            c9518n2.m31884b();
            HashMap map = null;
            while (c9518n2.m31882N() == EnumC9666b.NAME) {
                strM31879B = c9518n2.m31879B();
                strM31879B.hashCode();
                switch (strM31879B) {
                    case "debug_file":
                        debugImage.debugFile = c9518n2.m31090N0();
                        break;
                    case "image_addr":
                        debugImage.imageAddr = c9518n2.m31090N0();
                        break;
                    case "image_size":
                        debugImage.imageSize = c9518n2.m31086G0();
                        break;
                    case "code_file":
                        debugImage.codeFile = c9518n2.m31090N0();
                        break;
                    case "arch":
                        debugImage.arch = c9518n2.m31090N0();
                        break;
                    case "type":
                        debugImage.type = c9518n2.m31090N0();
                        break;
                    case "uuid":
                        debugImage.uuid = c9518n2.m31090N0();
                        break;
                    case "debug_id":
                        debugImage.debugId = c9518n2.m31090N0();
                        break;
                    case "code_id":
                        debugImage.codeId = c9518n2.m31090N0();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        c9518n2.m31092R0(interfaceC9670w1, map, strM31879B);
                        break;
                }
            }
            c9518n2.m31889j();
            debugImage.setUnknown(map);
            return debugImage;
        }
    }

    public String getArch() {
        return this.arch;
    }

    public String getCodeFile() {
        return this.codeFile;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getDebugFile() {
        return this.debugFile;
    }

    public String getDebugId() {
        return this.debugId;
    }

    public String getImageAddr() {
        return this.imageAddr;
    }

    public Long getImageSize() {
        return this.imageSize;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override // io.sentry.InterfaceC9578r2
    public void serialize(InterfaceC9448h3 interfaceC9448h3, InterfaceC9670w1 interfaceC9670w1) throws IOException {
        interfaceC9448h3.mo30823f();
        if (this.uuid != null) {
            interfaceC9448h3.mo30828k("uuid").mo30819b(this.uuid);
        }
        if (this.type != null) {
            interfaceC9448h3.mo30828k("type").mo30819b(this.type);
        }
        if (this.debugId != null) {
            interfaceC9448h3.mo30828k("debug_id").mo30819b(this.debugId);
        }
        if (this.debugFile != null) {
            interfaceC9448h3.mo30828k("debug_file").mo30819b(this.debugFile);
        }
        if (this.codeId != null) {
            interfaceC9448h3.mo30828k("code_id").mo30819b(this.codeId);
        }
        if (this.codeFile != null) {
            interfaceC9448h3.mo30828k("code_file").mo30819b(this.codeFile);
        }
        if (this.imageAddr != null) {
            interfaceC9448h3.mo30828k("image_addr").mo30819b(this.imageAddr);
        }
        if (this.imageSize != null) {
            interfaceC9448h3.mo30828k("image_size").mo30822e(this.imageSize);
        }
        if (this.arch != null) {
            interfaceC9448h3.mo30828k("arch").mo30819b(this.arch);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC9448h3.mo30828k(str).mo30824g(interfaceC9670w1, this.unknown.get(str));
            }
        }
        interfaceC9448h3.mo30821d();
    }

    public void setArch(String str) {
        this.arch = str;
    }

    public void setCodeFile(String str) {
        this.codeFile = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setDebugFile(String str) {
        this.debugFile = str;
    }

    public void setDebugId(String str) {
        this.debugId = str;
    }

    public void setImageAddr(String str) {
        this.imageAddr = str;
    }

    public void setImageSize(Long l) {
        this.imageSize = l;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setImageSize(long j2) {
        this.imageSize = Long.valueOf(j2);
    }
}
