package io.quarkus.qlue;

/**
 * The exception thrown when a chain build fails.
 *
 * @author <a href="mailto:david.lloyd@redhat.com">David M. Lloyd</a>
 */
public final class ChainBuildException extends Exception {
    private static final long serialVersionUID = -1143606746171493097L;

    /**
     * Constructs a new {@code ChainBuildException} instance. The message is left blank ({@code null}), and no
     * cause is specified.
     *
     */
    public ChainBuildException() {
    }

    /**
     * Constructs a new {@code ChainBuildException} instance with an initial message. No
     * cause is specified.
     *
     * @param msg the message
     */
    public ChainBuildException(final String msg) {
        super(msg);
    }

    /**
     * Constructs a new {@code ChainBuildException} instance with an initial cause. If
     * a non-{@code null} cause is specified, its message is used to initialize the message of this
     * {@code ChainBuildException}; otherwise the message is left blank ({@code null}).
     *
     * @param cause the cause
     */
    public ChainBuildException(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new {@code ChainBuildException} instance with an initial message and cause.
     *
     * @param msg the message
     * @param cause the cause
     */
    public ChainBuildException(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
