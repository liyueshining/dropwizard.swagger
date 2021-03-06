package io.paradoxical.dropwizard.swagger.bundles;

import io.paradoxical.dropwizard.bundles.assets.AdminAssetsBundle;
import io.paradoxical.dropwizard.bundles.assets.AssetsDefinition;
import io.paradoxical.dropwizard.swagger.SwaggerAssets;

public class SwaggerUIAdminAssetsBundle extends AdminAssetsBundle {
    public SwaggerUIAdminAssetsBundle() {
        this(SwaggerAssets.Assets);
    }

    public SwaggerUIAdminAssetsBundle(final AssetsDefinition assets) {
        super(assets);
    }
}
