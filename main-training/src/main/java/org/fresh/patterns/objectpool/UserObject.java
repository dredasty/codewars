package org.fresh.patterns.objectpool;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class UserObject {
    private String name;
    private int age;
}
