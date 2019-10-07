package org.fresh.processor;

import org.apache.commons.lang3.StringUtils;
import org.fresh.annotation.Factory;

import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.MirroredTypeException;

public class FactoryAnnotatedClass {
    private TypeElement annotatedClassElement;
    private String qualifiedSuperClassName;
    private String simpleTypeName;
    private String id;

    public FactoryAnnotatedClass(TypeElement classElement) throws IllegalArgumentException {
        this.annotatedClassElement = classElement;
        Factory annotation = classElement.getAnnotation(Factory.class);
        id = annotation.id();

        if (StringUtils.isEmpty(id)) {
            throw new IllegalArgumentException(
                    String.format("id() in @%s for class %s is null or empty! that's not allowed",
                            Factory.class.getSimpleName(), classElement.getQualifiedName().toString()));
        }

        try {
            Class<?> clazz = annotation.type();
            qualifiedSuperClassName = clazz.getCanonicalName();
            simpleTypeName = clazz.getSimpleName();
        } catch (MirroredTypeException mte) {
            DeclaredType classTypeMirror = (DeclaredType) mte.getTypeMirror();
            TypeElement classTypeElement = (TypeElement) classTypeMirror.asElement();
            qualifiedSuperClassName = classTypeElement.getQualifiedName().toString();
            simpleTypeName = classTypeElement.getSimpleName().toString();
        }
    }

    public String getId() {
        return id;
    }

    public String getQualifiedFactoryGroupName() {
        return qualifiedSuperClassName;
    }

    public String getSimpleFactoryGroupName() {
        return simpleTypeName;
    }

    public TypeElement getTypeElement() {
        return annotatedClassElement;
    }

}
