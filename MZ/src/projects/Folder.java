package projects;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private List<File> files;
    private List<Folder> folders;
    private String name;

    public Folder(List<File> files, List<Folder> folders, String name) {
        this.files = files;
        this.folders = folders;
        this.name = name;
    }

    public Folder() {
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public List<File> getFiles() {
        return files;
    }
    public void setFiles(List<File> files) {
        this.files = files;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void addFolder(Folder folder) {
        this.folders.add(folder);
    }

    public double getTotalSize() {
        double totalSize = 0;
        for (File file: files) {
            totalSize += file.getSize();
        }
        return totalSize;
    }
}
