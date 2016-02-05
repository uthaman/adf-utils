import java.util.Iterator;

import javax.faces.component.UIComponent;


public class JsfUtils {

    /**
   * <p>Return the {@link UIComponent} (if any) with the specified
   * <code>id</code>, searching recursively starting at the specified
   * <code>base</code>, and examining the base component itself, followed
   * by examining all the base component's facets and children.
   * Unlike findComponent method of {@link javax.faces.component.UIComponentBase}, which
   * skips recursive scan each time it finds a {@link NamingContainer},
   * this method examines all components, regardless of their namespace
   * (assuming IDs are unique).
   *
   * @param base Base {@link UIComponent} from which to search
   * @param id Component identifier to be matched
   */
      public static UIComponent findComponent(UIComponent base, String id)
      {
        if (id==null || "".equals(id))
        {
          return null;
        }
        // Is the "base" component itself the match we are looking for?
        if (id.equals(base.getId()))
        {
          return base;
        }
        // check for direct child
        UIComponent result = base.findComponent(id);
        if (result!=null)
        {
          return result;
        }

        // Search through our facets and children
        UIComponent kid = null;
        Iterator kids = base.getFacetsAndChildren();
        while (kids.hasNext() && (result == null))
        {
          kid = (UIComponent) kids.next();
          if (id.equals(kid.getId()))
          {
            result = kid;
            break;
          }
          result = findComponent(kid, id);
          if (result != null)
          {
            break;
          }
        }
        return result;
      }
}
