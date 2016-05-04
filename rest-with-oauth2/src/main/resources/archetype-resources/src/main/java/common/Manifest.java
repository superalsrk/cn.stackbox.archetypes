package ${package}.common;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "Tadalin")
@XmlAccessorType(XmlAccessType.NONE)
public class Manifest {

    public static Manifest newInstance() {
        return new Manifest();
    }

    private static Date date = new Date();

    @XmlElement
    private String app;

    @XmlElement
    private String version;

    @XmlElement
    private String bootdate;

    public Manifest() {
        this.app = Manifest.class.getPackage().getImplementationTitle();
        this.version = Manifest.class.getPackage().getImplementationVersion();
        this.bootdate = new DateTime(date).toString("yyyy-MM-dd HH-mm-ss");
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBootdate() {
        return bootdate;
    }

    public void setBootdate(String bootdate) {
        this.bootdate = bootdate;
    }
}
