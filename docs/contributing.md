We're offering support for Chucker on the [#chucker](https://kotlinlang.slack.com/archives/CRWD6370R) channel on [kotlinlang.slack.com](https://kotlinlang.slack.com/). Come and join the conversation over there.

**We're looking for contributors! Don't be shy.** 😁 Feel free to open issues/pull requests to help us improve this project.

* When reporting a new Issue, make sure to attach **Screenshots**, **Videos** or **GIFs** of the problem you are reporting.
* When submitting a new PR, make sure tests are all green. Write new tests if necessary.

Short `TODO` List for new contributors:

- Increment the test coverage.
- [Issues marked as `Help wanted`](https://github.com/ChuckerTeam/chucker/labels/help%20wanted)

### Building 🛠

In order to start working on Chucker, you need to fork the project and open it in Android Studio/IntelliJ IDEA.

Before committing we suggest you install the pre-commit hooks with the following command:

```
./gradlew installGitHook
```

This will make sure your code is validated against KtLint and Detekt before every commit.
The command will run automatically before the `clean` task, so you should have the pre-commit hook installed by then.

Before submitting a PR please run:

```
./gradlew build
```

This will build the library and will run all the verification tasks (ktlint, detekt, lint, unit tests) locally.
This will make sure your CI checks will pass.