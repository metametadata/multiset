(defproject
  metametadata/multiset "0.1.1"
  :description "A simple multiset/bag implementation for Clojure. Works in JDK 11."
  :url "https://github.com/metametadata/multiset"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :repositories {"clojars" {:sign-releases false}}

  :source-paths ["src" "src/main"]
  :test-paths ["test" "src/test"]

  :dependencies [[org.clojure/clojure "1.7.0" :scope "provided"]
                 [org.clojure/algo.generic "0.1.2"]]

  :profiles {:dev {:dependencies              [[midje "1.9.6"]]
                   :plugins                   [[lein-html5-docs "3.0.1"]
                                               [lein-midje "3.1.3"]]
                   :html5-docs-docs-dir       "doc"
                   :html5-docs-ns-includes    #"multiset\..*"
                   :html5-docs-ns-excludes    #".*\.t_.*"
                   :html5-docs-repository-url ""}})
