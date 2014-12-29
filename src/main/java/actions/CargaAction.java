package actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import java.io.File;

/**
 * Created by Carlos Coves Prieto on 11/21/14.
 */
public class CargaAction extends ActionSupport {

    private File file;
    private String fileFileName;
    private String fileContentType;


    public String upload() throws Exception {

        if (fileFileName != null) {
            ServletContext servletContext = ServletActionContext.getServletContext();

            String folder = servletContext.getRealPath("imagenes");
            File almacenamientoFile = new File(folder,this.fileFileName);
            this.file.renameTo(almacenamientoFile);

        }
        return "success";
    }

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return this.file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

}
