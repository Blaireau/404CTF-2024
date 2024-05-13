package i0;

import android.os.Bundle;
import androidx.lifecycle.C0100k;
import androidx.lifecycle.P;
import b0.C0135m;
import com.example.reverseexample.R;
import g.C0187j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m.AbstractC0398e;
import m.C0396c;
import m.C0400g;

/* renamed from: i0.d  reason: case insensitive filesystem */
/* loaded from: base/dex/classes.dex */
public final class C0275d {

    /* renamed from: b  reason: collision with root package name */
    public boolean f3730b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f3731c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3732d;

    /* renamed from: e  reason: collision with root package name */
    public C0187j f3733e;

    /* renamed from: a  reason: collision with root package name */
    public final C0400g f3729a = new C0400g();

    /* renamed from: f  reason: collision with root package name */
    public boolean f3734f = true;

    public final Bundle a(String str) {
        if (this.f3732d) {
            Bundle bundle = this.f3731c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f3731c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f3731c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f3731c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final InterfaceC0274c b() {
        Map.Entry entry;
        InterfaceC0274c interfaceC0274c;
        Iterator it = this.f3729a.iterator();
        do {
            AbstractC0398e abstractC0398e = (AbstractC0398e) it;
            if (abstractC0398e.hasNext()) {
                entry = (Map.Entry) abstractC0398e.next();
                L0.c.n("components", entry);
                interfaceC0274c = (InterfaceC0274c) entry.getValue();
            } else {
                return null;
            }
        } while (!L0.c.f((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0274c;
    }

    public final void c(P p2) {
        if (this.f3730b ^ R.xml.data_extraction_rules) {
            p2.a(new C0135m(R.styleable.ActionMenuItemView, this));
            this.f3730b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void d(String str, InterfaceC0274c interfaceC0274c) {
        Object obj;
        L0.c.o("key", str);
        L0.c.o("provider", interfaceC0274c);
        C0400g c0400g = this.f3729a;
        C0396c a2 = c0400g.a(str);
        if (a2 != null) {
            obj = a2.f4462b;
        } else {
            C0396c c0396c = new C0396c(str, interfaceC0274c);
            c0400g.f4473d += R.xml.data_extraction_rules;
            C0396c c0396c2 = c0400g.f4471b;
            if (c0396c2 == null) {
                c0400g.f4470a = c0396c;
            } else {
                c0396c2.f4463c = c0396c;
                c0396c.f4464d = c0396c2;
            }
            c0400g.f4471b = c0396c;
            obj = null;
        }
        if (((InterfaceC0274c) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void e() {
        if (this.f3734f) {
            C0187j c0187j = this.f3733e;
            if (c0187j == null) {
                c0187j = new C0187j(this);
            }
            this.f3733e = c0187j;
            try {
                C0100k.class.getDeclaredConstructor(new Class[R.xml.backup_rules]);
                C0187j c0187j2 = this.f3733e;
                if (c0187j2 != null) {
                    ((Set) c0187j2.f3290b).add(C0100k.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class " + C0100k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}