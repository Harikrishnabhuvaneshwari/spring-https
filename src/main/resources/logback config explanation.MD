## Understanding logback config.

## \<statusListener class="ch.qos.logback.core.status.NopStatusListener"/>

> Silencing Startup Messages, Optimizing Logging Performance.
> If debug is turned ON in \<configuration>, this will be ignored.
> During development and debugging, it's generally beneficial to have access to status messages to diagnose
> configuration issues or unexpected logging behavior. However, for production environments or when you are confident
> in your configuration,
> using NopStatusListener can help improve logging performance and reduce unnecessary noise in logs.
    
