What is Facade?

The Facade Design Pattern provides a simplified interface to a complex subsystem.
It hides internal complexity and exposes only what the client needs.

Without Facade:
Client must interact with many classes
Tight coupling
Hard to maintain and change

With Facade:
Client talks to one class
Subsystem complexity is hidden
Cleaner, readable code

Example:
You are building a video streaming system.
To play a video, multiple systems must work together:

Authentication
Video loading
Audio setup
Video rendering

The Facade provides a single method: playVideo().