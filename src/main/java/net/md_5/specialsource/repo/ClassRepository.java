package net.md_5.specialsource.repo;

import org.objectweb.asm.tree.ClassNode;

public interface ClassRepository {

    ClassNode findClass(String internalName);
}
