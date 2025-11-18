package cm.aptoide.p092pt.dataprovider.model.p096v7;

/* loaded from: classes.dex */
public class Obb {
    private ObbItem main;
    private ObbItem patch;

    public static class ObbItem {
        private String filename;
        private long filesize;
        private String md5sum;
        private String path;

        protected boolean canEqual(Object obj) {
            return obj instanceof ObbItem;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ObbItem)) {
                return false;
            }
            ObbItem obbItem = (ObbItem) obj;
            if (!obbItem.canEqual(this)) {
                return false;
            }
            String path = getPath();
            String path2 = obbItem.getPath();
            if (path != null ? !path.equals(path2) : path2 != null) {
                return false;
            }
            String md5sum = getMd5sum();
            String md5sum2 = obbItem.getMd5sum();
            if (md5sum != null ? !md5sum.equals(md5sum2) : md5sum2 != null) {
                return false;
            }
            if (getFilesize() != obbItem.getFilesize()) {
                return false;
            }
            String filename = getFilename();
            String filename2 = obbItem.getFilename();
            return filename != null ? filename.equals(filename2) : filename2 == null;
        }

        public String getFilename() {
            return this.filename;
        }

        public long getFilesize() {
            return this.filesize;
        }

        public String getMd5sum() {
            return this.md5sum;
        }

        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            String path = getPath();
            int iHashCode = path == null ? 43 : path.hashCode();
            String md5sum = getMd5sum();
            int iHashCode2 = ((iHashCode + 59) * 59) + (md5sum == null ? 43 : md5sum.hashCode());
            long filesize = getFilesize();
            int i2 = (iHashCode2 * 59) + ((int) (filesize ^ (filesize >>> 32)));
            String filename = getFilename();
            return (i2 * 59) + (filename != null ? filename.hashCode() : 43);
        }

        public void setFilename(String str) {
            this.filename = str;
        }

        public void setFilesize(long j2) {
            this.filesize = j2;
        }

        public void setMd5sum(String str) {
            this.md5sum = str;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public String toString() {
            return "Obb.ObbItem(path=" + getPath() + ", md5sum=" + getMd5sum() + ", filesize=" + getFilesize() + ", filename=" + getFilename() + ")";
        }
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof Obb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Obb)) {
            return false;
        }
        Obb obb = (Obb) obj;
        if (!obb.canEqual(this)) {
            return false;
        }
        ObbItem patch = getPatch();
        ObbItem patch2 = obb.getPatch();
        if (patch != null ? !patch.equals(patch2) : patch2 != null) {
            return false;
        }
        ObbItem main = getMain();
        ObbItem main2 = obb.getMain();
        return main != null ? main.equals(main2) : main2 == null;
    }

    public ObbItem getMain() {
        return this.main;
    }

    public ObbItem getPatch() {
        return this.patch;
    }

    public int hashCode() {
        ObbItem patch = getPatch();
        int iHashCode = patch == null ? 43 : patch.hashCode();
        ObbItem main = getMain();
        return ((iHashCode + 59) * 59) + (main != null ? main.hashCode() : 43);
    }

    public void setMain(ObbItem obbItem) {
        this.main = obbItem;
    }

    public void setPatch(ObbItem obbItem) {
        this.patch = obbItem;
    }

    public String toString() {
        return "Obb(patch=" + getPatch() + ", main=" + getMain() + ")";
    }
}
