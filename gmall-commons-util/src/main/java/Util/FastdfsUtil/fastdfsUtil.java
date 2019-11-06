package Util.FastdfsUtil;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

import java.io.IOException;

public class fastdfsUtil {
    public String fastUpload(String trackconf,String orginalFileName) throws IOException, MyException {
        String file = this.getClass().getResource(trackconf).getFile();
        ClientGlobal.init(file);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer connection = trackerClient.getConnection();
        StorageClient storageClient = new StorageClient(connection, null);

        /* 不封装  jpg  其他格式 也要考虑在内*/
        String[] upload_file = storageClient.upload_file(orginalFileName, "jpg", null);
        for (int i = 0; i < upload_file.length; i++) {
            String s = upload_file[i];
            System.out.println("s = " + s);
        }

    }
}
