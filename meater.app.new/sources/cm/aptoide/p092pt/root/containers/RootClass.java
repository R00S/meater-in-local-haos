package cm.aptoide.p092pt.root.containers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class RootClass {
    static String PATH_TO_DX = "/Users/Chris/Projects/android-sdk-macosx/build-tools/18.0.1/dx";

    /* renamed from: cm.aptoide.pt.root.containers.RootClass$1 */
    static /* synthetic */ class C41521 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$root$containers$RootClass$READ_STATE;

        static {
            int[] iArr = new int[READ_STATE.values().length];
            $SwitchMap$cm$aptoide$pt$root$containers$RootClass$READ_STATE = iArr;
            try {
                iArr[READ_STATE.STARTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$root$containers$RootClass$READ_STATE[READ_STATE.FOUND_ANNOTATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class AnnotationsFinder {
        private final String AVOIDDIRPATH;
        private List<File> classFiles;

        public AnnotationsFinder() throws InterruptedException, IOException {
            String[] strArr;
            String[] strArr2;
            StringBuilder sb = new StringBuilder();
            sb.append("stericson");
            String str = File.separator;
            sb.append(str);
            sb.append("RootShell");
            sb.append(str);
            this.AVOIDDIRPATH = sb.toString();
            System.out.println("Discovering root class annotations...");
            this.classFiles = new ArrayList();
            lookup(new File("src"), this.classFiles);
            System.out.println("Done discovering annotations. Building jar file.");
            File builtPath = getBuiltPath();
            if (builtPath != null) {
                String str2 = "com" + str + "stericson" + str + "RootShell" + str + "containers" + str + "RootClass.class";
                String str3 = "com" + str + "stericson" + str + "RootShell" + str + "containers" + str + "RootClass$RootArgs.class";
                String str4 = "com" + str + "stericson" + str + "RootShell" + str + "containers" + str + "RootClass$AnnotationsFinder.class";
                String str5 = "com" + str + "stericson" + str + "RootShell" + str + "containers" + str + "RootClass$AnnotationsFinder$1.class";
                String str6 = "com" + str + "stericson" + str + "RootShell" + str + "containers" + str + "RootClass$AnnotationsFinder$2.class";
                boolean z = -1 != System.getProperty("os.name").toLowerCase().indexOf("win");
                if (z) {
                    StringBuilder sb2 = new StringBuilder(" " + str2 + " " + str3 + " " + str4 + " " + str5 + " " + str6);
                    Iterator<File> it = this.classFiles.iterator();
                    while (it.hasNext()) {
                        sb2.append(" " + it.next().getPath());
                    }
                    strArr = new String[]{"cmd", "/C", "jar cvf anbuild.jar" + sb2.toString()};
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("jar");
                    arrayList.add("cf");
                    arrayList.add("anbuild.jar");
                    arrayList.add(str2);
                    arrayList.add(str3);
                    arrayList.add(str4);
                    arrayList.add(str5);
                    arrayList.add(str6);
                    Iterator<File> it2 = this.classFiles.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getPath());
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                processBuilder.directory(builtPath);
                try {
                    processBuilder.start().waitFor();
                } catch (IOException | InterruptedException unused) {
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("res");
                String str7 = File.separator;
                sb3.append(str7);
                sb3.append("raw");
                File file = new File(sb3.toString());
                if (!file.exists()) {
                    file.mkdirs();
                }
                System.out.println("Done building jar file. Creating dex file.");
                if (z) {
                    strArr2 = new String[]{"cmd", "/C", "dx --dex --output=res" + str7 + "raw" + str7 + "anbuild.dex " + builtPath + str7 + "anbuild.jar"};
                } else {
                    strArr2 = new String[]{getPathToDx(), "--dex", "--output=res" + str7 + "raw" + str7 + "anbuild.dex", builtPath + str7 + "anbuild.jar"};
                }
                try {
                    new ProcessBuilder(strArr2).start().waitFor();
                } catch (IOException | InterruptedException unused2) {
                }
            }
            PrintStream printStream = System.out;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("All done. ::: anbuild.dex should now be in your project's res");
            String str8 = File.separator;
            sb4.append(str8);
            sb4.append("raw");
            sb4.append(str8);
            sb4.append(" folder :::");
            printStream.println(sb4.toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected java.io.File getBuiltPath() {
            /*
                r5 = this;
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "out"
                r1.append(r2)
                java.lang.String r2 = java.io.File.separator
                r1.append(r2)
                java.lang.String r3 = "production"
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                boolean r1 = r0.isDirectory()
                if (r1 == 0) goto L52
                cm.aptoide.pt.root.containers.RootClass$AnnotationsFinder$2 r1 = new cm.aptoide.pt.root.containers.RootClass$AnnotationsFinder$2
                r1.<init>()
                java.io.File[] r1 = r0.listFiles(r1)
                int r3 = r1.length
                if (r3 <= 0) goto L52
                java.io.File r3 = new java.io.File
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = r0.getAbsolutePath()
                r4.append(r0)
                r4.append(r2)
                r0 = 0
                r0 = r1[r0]
                java.lang.String r0 = r0.getName()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r3.<init>(r0)
                goto L53
            L52:
                r3 = 0
            L53:
                if (r3 != 0) goto L77
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "bin"
                r1.append(r4)
                r1.append(r2)
                java.lang.String r2 = "classes"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                boolean r1 = r0.isDirectory()
                if (r1 == 0) goto L77
                r3 = r0
            L77:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.pt.root.containers.RootClass.AnnotationsFinder.getBuiltPath():java.io.File");
        }

        protected String getPathToDx() throws IOException {
            String name;
            String str = System.getenv("ANDROID_HOME");
            if (str == null) {
                throw new IOException("Error: you need to set $ANDROID_HOME globally");
            }
            String str2 = null;
            int i2 = 0;
            for (File file : new File(str + File.separator + "build-tools").listFiles()) {
                if (file.getName().contains("-")) {
                    String[] strArrSplit = file.getName().split("-");
                    name = strArrSplit[1].contains("W") ? String.valueOf(strArrSplit[1].toCharArray()[0]) : strArrSplit[1];
                } else {
                    name = file.getName();
                }
                String[] strArrSplit2 = name.split("[.]");
                int i3 = Integer.parseInt(strArrSplit2[0]) * 10000;
                if (strArrSplit2.length > 1) {
                    i3 += Integer.parseInt(strArrSplit2[1]) * 100;
                    if (strArrSplit2.length > 2) {
                        i3 += Integer.parseInt(strArrSplit2[2]);
                    }
                }
                if (i3 > i2) {
                    String str3 = file.getAbsolutePath() + File.separator + "dx";
                    if (new File(str3).exists()) {
                        str2 = str3;
                        i2 = i3;
                    }
                }
            }
            if (str2 != null) {
                return str2;
            }
            throw new IOException("Error: unable to find dx binary in $ANDROID_HOME");
        }

        protected boolean hasClassAnnotation(File file) throws IOException {
            READ_STATE read_state = READ_STATE.STARTING;
            Pattern patternCompile = Pattern.compile(" class ([A-Za-z0-9_]+)");
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    int i2 = C41521.$SwitchMap$cm$aptoide$pt$root$containers$RootClass$READ_STATE[read_state.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            Matcher matcher = patternCompile.matcher(line);
                            if (matcher.find()) {
                                System.out.println(" Found annotated class: " + matcher.group(0));
                                return true;
                            }
                            System.err.println("Error: unmatched annotation in " + file.getAbsolutePath());
                            read_state = READ_STATE.STARTING;
                        }
                    } else if (-1 < line.indexOf("@RootClass.Candidate")) {
                        read_state = READ_STATE.FOUND_ANNOTATION;
                    }
                }
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return false;
        }

        protected void lookup(File file, List<File> list) {
            String strReplace = file.toString().replace("src" + File.separator, HttpUrl.FRAGMENT_ENCODE_SET);
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    if (-1 == file2.getAbsolutePath().indexOf(this.AVOIDDIRPATH)) {
                        lookup(file2, list);
                    }
                } else if (file2.getName().endsWith(".java") && hasClassAnnotation(file2)) {
                    final String strReplace2 = file2.getName().replace(".java", HttpUrl.FRAGMENT_ENCODE_SET);
                    for (File file3 : new File(getBuiltPath().toString() + File.separator + strReplace).listFiles(new FilenameFilter() { // from class: cm.aptoide.pt.root.containers.RootClass.AnnotationsFinder.1
                        @Override // java.io.FilenameFilter
                        public boolean accept(File file4, String str) {
                            return str.startsWith(strReplace2);
                        }
                    })) {
                        list.add(new File(strReplace + File.separator + file3.getName()));
                    }
                }
            }
        }
    }

    public @interface Candidate {
    }

    enum READ_STATE {
        STARTING,
        FOUND_ANNOTATION
    }

    public class RootArgs {
        public String[] args;

        public RootArgs() {
        }
    }

    public RootClass(String[] strArr) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        String str = strArr[0];
        RootArgs rootArgs = new RootArgs();
        String[] strArr2 = new String[strArr.length - 1];
        rootArgs.args = strArr2;
        System.arraycopy(strArr, 1, strArr2, 0, strArr.length - 1);
        Class.forName(str).getConstructor(RootArgs.class).newInstance(rootArgs);
    }

    static void displayError(Exception exc) {
        System.out.println("##ERR##" + exc.getMessage() + "##");
        exc.printStackTrace();
    }

    public static void main(String[] strArr) {
        try {
            if (strArr.length == 0) {
                new AnnotationsFinder();
            } else {
                new RootClass(strArr);
            }
        } catch (Exception e2) {
            displayError(e2);
        }
    }
}
