package com.github.jasssonpet.poc.Y;

import javax.servlet.ServletContextEvent;

public class ContextLoaderListener extends org.springframework.web.context.ContextLoaderListener {

  @Override
  public void contextInitialized(ServletContextEvent event) {
    Object bundleContext = event.getServletContext().getAttribute("osgi-bundlecontext");
    event.getServletContext().setAttribute("org.springframework.osgi.web.org.osgi.framework.BundleContext", bundleContext);

    super.contextInitialized(event);
  }
}