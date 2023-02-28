def getApplicationProperty() {

    def gitScm = checkout scm
    def config = readYaml file: 'property.yml'
    return config
}
def getApplicationDefaultConfigs() {
    def defaultConfig = null
    defaultConfig = readYaml file:"$GLOBAL_CONFIG/property-default.yml"
    echo defaultConfig
    return defaultConfig
}