// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerapp.outputs;

import com.pulumi.azure.containerapp.outputs.GetAppTemplateInitContainerEnv;
import com.pulumi.azure.containerapp.outputs.GetAppTemplateInitContainerVolumeMount;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAppTemplateInitContainer {
    /**
     * @return A list of extra arguments to pass to the container.
     * 
     */
    private List<String> args;
    /**
     * @return A command to pass to the container to override the default. This is provided as a list of command line elements without spaces.
     * 
     */
    private List<String> commands;
    /**
     * @return The amount of vCPU to allocate to the container. Possible values include `0.25`, `0.5`, `0.75`, `1.0`, `1.25`, `1.5`, `1.75`, and `2.0`.
     * 
     */
    private Double cpu;
    /**
     * @return One or more `env` blocks as detailed below.
     * 
     */
    private List<GetAppTemplateInitContainerEnv> envs;
    /**
     * @return The amount of ephemeral storage available to the Container App.
     * 
     */
    private String ephemeralStorage;
    /**
     * @return The image to use to create the container.
     * 
     */
    private String image;
    /**
     * @return The amount of memory to allocate to the container. Possible values include `0.5Gi`, `1Gi`, `1.5Gi`, `2Gi`, `2.5Gi`, `3Gi`, `3.5Gi`, and `4Gi`.
     * 
     */
    private String memory;
    /**
     * @return The name of the Container App.
     * 
     */
    private String name;
    /**
     * @return A `volume_mounts` block as detailed below.
     * 
     */
    private List<GetAppTemplateInitContainerVolumeMount> volumeMounts;

    private GetAppTemplateInitContainer() {}
    /**
     * @return A list of extra arguments to pass to the container.
     * 
     */
    public List<String> args() {
        return this.args;
    }
    /**
     * @return A command to pass to the container to override the default. This is provided as a list of command line elements without spaces.
     * 
     */
    public List<String> commands() {
        return this.commands;
    }
    /**
     * @return The amount of vCPU to allocate to the container. Possible values include `0.25`, `0.5`, `0.75`, `1.0`, `1.25`, `1.5`, `1.75`, and `2.0`.
     * 
     */
    public Double cpu() {
        return this.cpu;
    }
    /**
     * @return One or more `env` blocks as detailed below.
     * 
     */
    public List<GetAppTemplateInitContainerEnv> envs() {
        return this.envs;
    }
    /**
     * @return The amount of ephemeral storage available to the Container App.
     * 
     */
    public String ephemeralStorage() {
        return this.ephemeralStorage;
    }
    /**
     * @return The image to use to create the container.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return The amount of memory to allocate to the container. Possible values include `0.5Gi`, `1Gi`, `1.5Gi`, `2Gi`, `2.5Gi`, `3Gi`, `3.5Gi`, and `4Gi`.
     * 
     */
    public String memory() {
        return this.memory;
    }
    /**
     * @return The name of the Container App.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A `volume_mounts` block as detailed below.
     * 
     */
    public List<GetAppTemplateInitContainerVolumeMount> volumeMounts() {
        return this.volumeMounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppTemplateInitContainer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> args;
        private List<String> commands;
        private Double cpu;
        private List<GetAppTemplateInitContainerEnv> envs;
        private String ephemeralStorage;
        private String image;
        private String memory;
        private String name;
        private List<GetAppTemplateInitContainerVolumeMount> volumeMounts;
        public Builder() {}
        public Builder(GetAppTemplateInitContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.cpu = defaults.cpu;
    	      this.envs = defaults.envs;
    	      this.ephemeralStorage = defaults.ephemeralStorage;
    	      this.image = defaults.image;
    	      this.memory = defaults.memory;
    	      this.name = defaults.name;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        @CustomType.Setter
        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder commands(List<String> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        @CustomType.Setter
        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        @CustomType.Setter
        public Builder envs(List<GetAppTemplateInitContainerEnv> envs) {
            this.envs = Objects.requireNonNull(envs);
            return this;
        }
        public Builder envs(GetAppTemplateInitContainerEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder ephemeralStorage(String ephemeralStorage) {
            this.ephemeralStorage = Objects.requireNonNull(ephemeralStorage);
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder memory(String memory) {
            this.memory = Objects.requireNonNull(memory);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder volumeMounts(List<GetAppTemplateInitContainerVolumeMount> volumeMounts) {
            this.volumeMounts = Objects.requireNonNull(volumeMounts);
            return this;
        }
        public Builder volumeMounts(GetAppTemplateInitContainerVolumeMount... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }
        public GetAppTemplateInitContainer build() {
            final var _resultValue = new GetAppTemplateInitContainer();
            _resultValue.args = args;
            _resultValue.commands = commands;
            _resultValue.cpu = cpu;
            _resultValue.envs = envs;
            _resultValue.ephemeralStorage = ephemeralStorage;
            _resultValue.image = image;
            _resultValue.memory = memory;
            _resultValue.name = name;
            _resultValue.volumeMounts = volumeMounts;
            return _resultValue;
        }
    }
}