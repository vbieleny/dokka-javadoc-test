package org.example.library;

/**
 * A group of <i>members</i>.
 * @param <T> the type of a member in this group.
 */
public final class JavaGroup<T> {
    private final String name;

    /**
     * Creates an empty group.
     * @param name the name of this group.
     */
    public JavaGroup(final String name) {
        this.name = name;
    }

    /**
     * Adds a <code>member</code> to this group.
     * @param member member to add.
     * @return the new size of the group.
     */
    public int add(final T member) {
        System.out.println(member);
        return 42;
    }

    /**
     * Getter for group name.
     * @return the name of this group.
     */
    public String getName() {
        return name;
    }
}
