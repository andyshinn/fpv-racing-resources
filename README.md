# FPV Racing Resources

A list of resources for multi-rotors and FPV racing. See http://andyshinn.github.io/fpv-racing-resources/ for the resource index. The site is generated from the files in the `docs` folder.

## Motivation

I found it difficult to find and organize parts while building my first multi-rotors. It seemed like a good idea to try and organize parts and specifications to be able to make decisions on what to buy at a glance.

## Contributing

This index will thrive with contributions from users like you! Please feel free to fork and open a pull request with your additions. See below for instructions on adding a new resource.

## Building

We use [Hugo](https://gohugo.io/) to build the site. Once you have Hugo installed, simply run `hugo` from the cloned repository directory. The site will be generated under the `docs` folder.

You can also run `hugo server` and then browse the generated site at http://localhost:50139/fpv-racing-resources/. This gives you a chance to see your changes before committing and opened a pull request.

## Adding Page

Content is split into different sections (such as a `shop` or `flight-controller`). We use the `hugo new` command to add a new page. The following example adds a page for a fictional flight controller called the *Super Boss F10*:

```
hugo new flight-controller/super-boss.md
```

This will generate a new file at `content/flight-controller/super-boss.md` that we can further edit. We can start by setting the title to something more meaningful such as *Super Boss F10*. We can also fill out other information in the front-matter such as the `specs` and `external_url`. Any content we want to display on the actual page can be regular markdown after the last `---` which denotes the end of the front-matter.
