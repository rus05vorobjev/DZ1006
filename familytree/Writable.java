package familytree;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;
import java.io.Serializable;

public interface Writable {
boolean save(Serializable sr, String path);
Object read (String path);

}
